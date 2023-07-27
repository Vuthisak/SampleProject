package com.vuthisak.common.base

import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerAdapter<D, VH : BaseViewHolder>(
    val items: MutableList<D>
) : RecyclerView.Adapter<VH>() {

    override fun getItemCount(): Int = items.size

    fun insert(item: D) {
        items.add(item)
        notifyItemInserted(getLastIndex())
    }

    fun update(position: Int, item: D) {
        items[position] = item
        notifyItemChanged(position)
    }

    fun removeAt(position: Int) {
        items.removeAt(position)
        notifyItemRemoved(position)
    }

    fun remove(item: D) {
        val position = items.indexOf(item)
        if (position != RecyclerView.NO_POSITION) {
            items.removeAt(position)
            notifyItemRemoved(position)
        }
    }

    private fun getLastIndex() = items.size - 1

}
