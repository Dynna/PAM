package com.example.myapplication.ui.main.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ListItemBinding
import com.example.myapplication.data.model.Post

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Post>
    ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){
    private lateinit var binding: ListItemBinding

    inner class ItemViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        return ItemViewHolder(
            ListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.itemAuthor.setText(dataset[position].strResourceId)
        holder.binding.itemTitle.setText(dataset[position].stringResourceId)
        holder.binding.itemImage.setImageResource(dataset[position].imageResourceId)
    }

    override fun getItemCount() = dataset.size
}
