package com.mez.hdu.narsports.mat.chs.mznm

import android.app.Application
import com.mez.hdu.narsports.mat.chs.mznm.domain.utils.METRICA
import com.yandex.metrica.YandexMetrica
import com.yandex.metrica.YandexMetricaConfig
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class Rt137: Application() {
    override fun onCreate() {
        super.onCreate()
        val config = YandexMetricaConfig.newConfigBuilder(METRICA).build()
        YandexMetrica.activate(applicationContext, config)
        YandexMetrica.enableActivityAutoTracking(this)

    }
}