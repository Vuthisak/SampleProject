package com.vuthisak.mlkit.creditscanner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vuthisak.common.base.BaseFragment
import com.vuthisak.mlkit.R
import com.vuthisak.mlkit.databinding.FragmentCreditMlScannerBinding

class CreditMlScannerFragment : BaseFragment(R.layout.fragment_credit_ml_scanner) {

    private lateinit var binding: FragmentCreditMlScannerBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCreditMlScannerBinding.bind(view)
    }

}
