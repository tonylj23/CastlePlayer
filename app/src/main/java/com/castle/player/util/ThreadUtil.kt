package com.castle.player.util

import android.os.Handler
import android.os.Looper


object ThreadUtil {
    var handler= Handler(Looper.getMainLooper())
    fun runOnMainThread(runnable:Runnable){
        handler.post(runnable)
    }
}