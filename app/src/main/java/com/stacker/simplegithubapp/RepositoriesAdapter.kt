package com.stacker.simplegithubapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class RepositoriesAdapter: RecyclerView.Adapter<RepositoriesAdapter.ViewHolder>(){

    val RepositoriesItems = ArrayList<Repositories>()

    //뷰를 홀딩하고 있는 뷰홀더를 만듬
    //리사이클러뷰 내부에 데이터들의 리스트를 관리하는 필드
    inner class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val tvRepoId = itemView.findViewById<TextView>(R.id.tv_rv_repositories_repoID)
        val tvRepoUpdated = itemView.findViewById<TextView>(R.id.tv_rv_repositories_updated)
        val tvRepoSummary = itemView.findViewById<TextView>(R.id.tv_rv_repositories_summary)
    }

    //뷰를 인플레이트
    // layoutInflater = 뷰를 메모리에 가져옴
    // layoutInflater.inflate() = 뷰를 만들어줌
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.rv_repositories, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = RepositoriesItems.size

    // 데이터를 바인딩 해줌
    // 각 뷰홀더별 포지션이 파라미터로 떨어지니 포지션으로 데이터를 찾음
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = RepositoriesItems[position]

        holder.tvRepoId.text = data.repo_id
        holder.tvRepoUpdated.text = data.repo_updated
        holder.tvRepoSummary.text = data.repo_summary
    }

    //아이템들을 자동으로 채워주기 위해서 만듬
    fun initRepoItems(repoitems : List<Repositories>){
        RepositoriesItems.addAll(repoitems)
    }
}