package com.vuthisak.sampleproject

import android.os.Bundle
import com.vuthisak.common.base.BaseActivity
import com.vuthisak.mlkit.creditscanner.CreditMlScannerFragment
import com.vuthisak.sampleproject.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    private val fragment = CreditMlScannerFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupFragmentContainer()
    }

    private fun setupFragmentContainer() {
        supportFragmentManager
            .beginTransaction()
            .add(fragment, fragment.tag)
            .commit()
    }

}
