package com.vuthisak.sample.fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.unit.dp
import androidx.viewpager2.widget.ViewPager2
import com.vuthisak.common.base.BaseFragment
import com.vuthisak.common.composeui.CustomTab
import com.vuthisak.sample.R
import com.vuthisak.sample.adapter.ScreenSlidePagerAdapter
import com.vuthisak.sample.databinding.FragmentSampleBinding
import kotlinx.coroutines.flow.StateFlow

class SampleFragment : BaseFragment(R.layout.fragment_sample) {

    private lateinit var binding: FragmentSampleBinding

    private val offset: MutableState<Float> = mutableFloatStateOf(0F)
    private val position: MutableState<Int> = mutableIntStateOf(0)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSampleBinding.bind(view)
        setupUi()
    }

    private fun setupUi() = with(binding) {
        viewPager.adapter = ScreenSlidePagerAdapter(childFragmentManager, lifecycle)
        val width = requireActivity().resources.getDimension(R.dimen.dp_100)
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                if (position == this@SampleFragment.position.value) {
                    offset.value = ((positionOffset * position) * width).toFloat()
                }
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                this@SampleFragment.position.value = position
            }
        })
        viewPager.currentItem = position.value
        composeView.apply {
            // Dispose of the Composition when the view's LifecycleOwner
            // is destroyed
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                CustomTabSample()
            }
        }
    }

    @Composable
    private fun CustomTabSample() {
        val (selected, setSelected) = remember {
            position
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(58.dp)
        ) {
            CustomTab(
                items = listOf("All", "Payments", "Transfer"),
                selectedItemIndex = selected,
                onClick = setSelected,
                targetValue = offset.value
            )
        }
    }

}
