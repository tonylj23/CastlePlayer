package com.castle.player.ui.activity

import android.support.design.widget.BottomNavigationView
import android.support.v7.widget.Toolbar
import com.castle.player.R
import com.castle.player.base.BaseActivity
import com.castle.player.util.BottomNavigationViewHelper
import com.castle.player.util.FragmentUtils
import com.castle.player.util.ToolBarManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.find

class MainActivity : BaseActivity(),ToolBarManager {
    //惰性加载
    override val toolbar: Toolbar by lazy {
        find<Toolbar>(R.id.toolbar)
    }

    val bottomNav :BottomNavigationView by lazy {
        find<BottomNavigationView>(R.id.bottom_nav)
    }



    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        initMainToolBar()

        BottomNavigationViewHelper.disableShiftMode(bottomNav)
        val beginTransaction = supportFragmentManager.beginTransaction()
        beginTransaction.replace(R.id.container,FragmentUtils.fragmentUtils.getFragment(R.id.tab_home),"")
        beginTransaction.commit()
    }


    override fun initListener() {
        bottomNav.setOnNavigationItemSelectedListener {
            val beginTransaction = supportFragmentManager.beginTransaction()
            beginTransaction.replace(R.id.container,FragmentUtils.fragmentUtils.getFragment(it.itemId),it.toString())
            beginTransaction.commit()
            true
        }
    }
}
