package com.castle.player.util

import android.support.v4.app.Fragment
import com.castle.player.R
import com.castle.player.ui.fragment.HomeFragment
import com.castle.player.ui.fragment.MvFragment
import com.castle.player.ui.fragment.VbFragment
import com.castle.player.ui.fragment.YouDanFragment

class FragmentUtils private constructor() {
    val homeFragment by lazy {
        HomeFragment()
    }
    val mvFragment by lazy {
        MvFragment()
    }
    val vbFragment by lazy {
        VbFragment();
    }
    val youDanFragment by lazy {
        YouDanFragment()
    }
    companion object {
        val fragmentUtils by lazy{
            FragmentUtils()
        }
    }

    fun getFragment(tabId:Int):Fragment?{
        when(tabId){
            R.id.tab_home-> return homeFragment
            R.id.tab_mv->return mvFragment
            R.id.tab_vb->return vbFragment
            R.id.tab_yd->return youDanFragment
        }
        return null
    }
}