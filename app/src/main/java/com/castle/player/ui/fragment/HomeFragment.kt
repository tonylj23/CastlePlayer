package com.castle.player.ui.fragment

import android.graphics.Color
import android.media.ThumbnailUtils
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.View
import android.widget.TextView
import com.castle.player.R
import com.castle.player.adapter.HomeAdpter
import com.castle.player.base.BaseFragment
import com.castle.player.util.ThreadUtil
import com.castle.player.widget.HomeItemView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.fragment_home.*
import okhttp3.*
import org.jetbrains.anko.textColor
import java.io.IOException
import java.util.zip.Inflater

class HomeFragment :BaseFragment(){


    val adapter:HomeAdpter by lazy{
        HomeAdpter()
    }

    override fun interView(): View? {

        return View.inflate(context, R.layout.fragment_home,null)
    }

    override fun initListener(){
        recyclerView.layoutManager=LinearLayoutManager(context)


    }

    override fun initData() {
        loadDatas()
    }

    private fun loadDatas() {
        val path=URLProviderUtils.getHomeUrl(0,20)
        val client = OkHttpClient()
        val request = Request.Builder()
            .url(path)
            .get()
            .build()
        client.newCall(request).enqueue(object :Callback{
            override fun onFailure(call: Call, e: IOException) {

            }

            override fun onResponse(call: Call, response: Response) {
                val toString = response?.body()?.toString()
                val gson= Gson()
                val list=gson.fromJson<List<HomeItemBean>>(toString,object:TypeToken<List<HomeItemBean>>(){}.type)
                ThreadUtil.runOnMainThread(object :Runnable{
                    override fun run() {
                        adapter.updateList(list)
                    }

                })
            }

        })
    }

}