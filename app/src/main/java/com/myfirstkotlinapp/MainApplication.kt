package com.myfirstkotlinapp

import android.support.multidex.MultiDexApplication

/**
 * Created by jaffer on 27/11/17.
 */

class MainApplication : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        instance = this


    }

    companion object {
        var instance: MainApplication? = null
            private set

    }

    /*

    class CyberApp : MultiDexApplication() {

    var component: AppComponent? = null
        private set

    override fun onCreate() {

        super.onCreate()
        instance = this
        Fabric.with(this, Crashlytics())
        FirebaseApp.initializeApp(this)
        if (BuildConfig.DEBUG) {
            initDebugLibs()
        }
        setupDagger()
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    private fun initDebugLibs() {
        Timber.plant(Timber.DebugTree())
        Sherlock.init(this)
        Traceur.enableLogging()
    }

    private fun setupDagger() {
        if (component == null) {
            component = DaggerAppComponent
                    .builder()
                    .appModule(AppModule(this))
                    .preferenceModule(PreferenceModule(this))
                    .networkModule(NetworkModule(this))
                    .build()
        }
    }

    companion object {

        var instance: CyberApp? = null
            private set
    }

}
    }*/
}
