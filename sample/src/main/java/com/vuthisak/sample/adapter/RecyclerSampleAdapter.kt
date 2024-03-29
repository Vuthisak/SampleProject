package com.vuthisak.sample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.vuthisak.common.base.BaseRecyclerAdapter
import com.vuthisak.common.base.BaseViewHolder
import com.vuthisak.sample.databinding.ItemRecyclerSampleBinding

class RecyclerSampleAdapter
    : BaseRecyclerAdapter<String, RecyclerSampleAdapter.ViewHolder>(mutableListOf()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemRecyclerSampleBinding
                .inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(binding: ItemRecyclerSampleBinding) : BaseViewHolder(binding)
}