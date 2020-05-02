package com.stacker.simplegithubapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class VPAdapter : FragmentPagerAdapter{

    var followerpage : Fragment = Follower()
    var followingpage : Fragment = Following()
    var profilepage : Fragment = Profile()
    var searchpage : Fragment = Search()

    var Data : ArrayList<Fragment> = arrayListOf(profilepage,followerpage,followingpage,searchpage)

    constructor(fm : FragmentManager) : super(fm){}

    override fun getItem(position: Int): Fragment = Data.get(position)

    override fun getCount(): Int = Data.size
}