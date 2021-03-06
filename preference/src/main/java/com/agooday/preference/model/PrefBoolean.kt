package com.agooday.preference.model

import android.support.annotation.WorkerThread
import com.agooday.preference.AGDPreferenceManager
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

public class PrefBoolean(private val name: String, private val defaultValue: Boolean) : ReadWriteProperty<Any, Boolean> {
    @WorkerThread
    override fun getValue(thisRef: Any, property: KProperty<*>): Boolean {
        return AGDPreferenceManager.getInstance().sADGPreferences.getBoolean(name, defaultValue)
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Boolean) {
        AGDPreferenceManager.getInstance().sADGPreferences.edit().putBoolean(name, value).apply()
    }

}