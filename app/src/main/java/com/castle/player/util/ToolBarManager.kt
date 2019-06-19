package com.castle.player.util

import android.content.Intent
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.widget.Toast
import com.castle.player.R
import com.castle.player.ui.activity.SettingActivity

interface ToolBarManager {
    val toolbar: Toolbar
    fun initMainToolBar() {
        toolbar.setTitle("我的影音")
        toolbar.inflateMenu(R.menu.main)

        toolbar.setOnMenuItemClickListener {
            toolbar.context.startActivity(Intent(toolbar.context,SettingActivity::class.java))
            true
        }
//        toolbar.setOnMenuItemClickListener(object :Toolbar.OnMenuItemClickListener{
//            override fun onMenuItemClick(item: MenuItem?): Boolean {
//                when(item?.itemId){
//                    R.id.setting->{
//
//                    }
//                }
//                return true
//            }
//
//        })
    }
    fun initSettingToolBar() {
        toolbar.setTitle("设置")

    }
}