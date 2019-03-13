package com.agooday.preference.model

import android.support.annotation.WorkerThread
import com.agooday.preference.AGDPrefUtil
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

public class PrefFloat(private val name: String, private val defaultValue: Float) : ReadWriteProperty<Any, Float> {
    @WorkerThread
    override fun getValue(thisRef: Any, property: KProperty<*>): Float {
        return AGDPrefUtil.getInstance().sADGPreferences.getFloat(name, defaultValue)
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Float) {
        AGDPrefUtil.getInstance().sADGPreferences.edit().putFloat(name, value).apply()
    }

}