package ru.alexbykov.gatekeeper.utils

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.google.gson.Gson

/**
 *  @author Alex Bykov
 *  Date: 06.01.2018.
 *
 *  You can contact me at me@alexbykov.ru
 */
open class BasePreferenceHelper(applicationContext: Context) {


    var preferences = PreferenceManager.getDefaultSharedPreferences(applicationContext)


    protected fun putString(key: String, value: String) {
        preferences.edit().putString(key, value).apply()
    }

    protected fun getString(key: String) = preferences.getString(key, "")!!

    protected fun putBoolean(key: String, value: Boolean) {
        preferences.edit().putBoolean(key, value).apply()
    }

    protected fun getBoolean(key: String) = preferences.getBoolean(key, false)


    protected fun isContains(key: String) = preferences.contains(key)

    @SuppressLint("ApplySharedPref")
    protected fun clearByKey(key: String) {
        preferences.edit().remove(key).commit()
    }


}