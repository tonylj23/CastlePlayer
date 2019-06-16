package com.castle.player.ui.activity

import android.support.v4.view.ViewCompat
import android.support.v4.view.ViewPropertyAnimatorListener
import android.view.View
import com.castle.player.R
import com.castle.player.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash_layout.*
import org.jetbrains.anko.startActivity

class SplashActivity : BaseActivity() ,ViewPropertyAnimatorListener{
    override fun onAnimationCancel(p0: View?) {

    }

    override fun onAnimationStart(p0: View?) {

    }

    override fun onAnimationEnd(p0: View?) {
        startActivityAndFinish<MainActivity>()
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_splash_layout
    }

    override fun initData() {
        ViewCompat.animate(splash_img).scaleX(1.0f).scaleY(1.0f).setDuration(2000).setListener(this).start()
    }
}