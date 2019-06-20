package com.castle.player.ui.fragment

import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.TextView
import com.castle.player.base.BaseFragment
import org.jetbrains.anko.textColor

class VbFragment :BaseFragment(){
    override fun interView(): View? {
        val view = TextView(context)
        view.gravity=Gravity.CENTER
        view.textColor=Color.RED
        view.text=javaClass.simpleName
        return view
    }
}