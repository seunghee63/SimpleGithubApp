package com.stacker.simplegithubapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.stacker.simplegithubapp.databinding.ActivityMainBinding
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_profile.*


class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding
    lateinit var compositeDisposable: CompositeDisposable

    var tt : String =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setContentView(R.layout.activity_main)

        compositeDisposable = CompositeDisposable()

        compositeDisposable.add(GitHubAPI.getRepoList("test")
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.newThread())
            .subscribe({response:GithubResponseModel->
                for(item in response.items){
                    Log.d("MainAcitivity", item.updatedAt)
                    tt += item.name
                }
            },{error:Throwable->
                Log.d("MainActivity", error.localizedMessage)
                Toast.makeText(this,"${error.localizedMessage}",Toast.LENGTH_SHORT).show()
            }))

        var main_adapter = VPAdapter(supportFragmentManager)
        viewpager.adapter = main_adapter

        tabLayout.setupWithViewPager(viewpager)

        print(tt)
    }

    private fun loadFragment(fragment: Fragment) {
        val transcation = supportFragmentManager.beginTransaction()
        transcation.replace(R.id.container, fragment)
        transcation.addToBackStack(null)
        transcation.commit()
    }
}



