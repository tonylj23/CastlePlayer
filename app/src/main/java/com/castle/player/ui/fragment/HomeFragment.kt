package com.castle.player.ui.fragment

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.View
import android.widget.TextView
import com.castle.player.R
import com.castle.player.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*
import org.jetbrains.anko.textColor
import java.util.zip.Inflater

class HomeFragment :BaseFragment(){
    override fun interView(): View? {

        return View.inflate(context, R.layout.fragment_home,null)
    }

    override fun initListener(){
        recyclerView.layoutManager=
    }
}