package com.song2.mygitapp.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.song2.mygitapp.databinding.ItemFollowersBinding

class TestListAdapter : ListAdapter<Test, TestListAdapter.ViewHolder>(
    DiffTool()
) {

    private class DiffTool : DiffUtil.ItemCallback<Test>(){
        override fun areItemsTheSame(oldItem: Test, newItem: Test): Boolean {
            //아이디가 같은 경우
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Test, newItem: Test): Boolean {
            //내용이 같은 경우
            return oldItem == newItem
        }
    }

    inner class ViewHolder(val binding: ItemFollowersBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(test : Test){
            binding.test = test
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemFollowersBinding.inflate(layoutInflater)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
    }
}

data class Test(
    val id: String,
    val name: String
)