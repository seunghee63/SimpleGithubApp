package com.stacker.simplegithubapp

import android.os.Bundle
import android.os.RecoverySystem
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Profile : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val repolist = listOf<Repositories>(
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다."),
            Repositories("hyunseok4475","2020-02-02","대략적인 요약을 보여줍니다.")
        )

        val rv = activity!!.findViewById<RecyclerView>(R.id.main_recyclerRepositories)
        val adapter = RepositoriesAdapter()

        adapter.initRepoItems(repolist)

        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(context)
    }
}