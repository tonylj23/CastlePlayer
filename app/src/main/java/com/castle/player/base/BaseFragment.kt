package com.castle.player.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.runOnUiThread
import org.jetbrains.anko.toast

abstract class BaseFragment : Fragment() ,AnkoLogger{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()

    }

    protected fun init(){

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return interView()
    }

    abstract fun interView(): View?

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initListener()
        initData()
    }

    protected fun initData() {

    }

    protected fun initListener() {

    }

    fun myToast(msg:String){
        context?.runOnUiThread {
            toast(msg)
        }
    }
}