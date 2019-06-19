package com.castle.player.ui.fragment

import android.os.Bundle
import android.preference.Preference
import android.preference.PreferenceFragment
import android.preference.PreferenceScreen
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.castle.player.R
import com.castle.player.ui.activity.AboutActivity
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast

class SettingFragment : PreferenceFragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        addPreferencesFromResource(R.xml.setting)
        return super.onCreateView(inflater, container, savedInstanceState)
    }


    override fun onPreferenceTreeClick(preferenceScreen: PreferenceScreen?, preference: Preference?): Boolean {
        val key = preference?.key
        if("about_us"==key){
            this.startActivity(intentFor<AboutActivity>())
        }
        return super.onPreferenceTreeClick(preferenceScreen, preference)
    }
}