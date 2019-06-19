package com.castle.player.ui.activity

import android.preference.PreferenceManager
import android.support.v7.widget.Toolbar
import com.castle.player.R
import com.castle.player.base.BaseActivity
import com.castle.player.util.ToolBarManager
import org.jetbrains.anko.find

class SettingActivity : BaseActivity(),ToolBarManager {
    override val toolbar: Toolbar by lazy{
        find<Toolbar>(R.id.toolbar)
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_setting

    }

    override fun initData() {
        initSettingToolBar()


    }

}