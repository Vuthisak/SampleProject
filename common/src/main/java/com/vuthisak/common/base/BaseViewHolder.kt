package com.vuthisak.common.base

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseViewHolder(val binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {

    protected val contentView = binding.root
    protected val context = binding.root.context

}