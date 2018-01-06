package ru.alexbykov.gatekeeper.di.modules

import android.preference.PreferenceManager

import javax.inject.Singleton

import dagger.Module
import dagger.Provides
import ru.alexbykov.gatekeeper.App
import ru.alexbykov.gatekeeper.api.RestApi
import ru.alexbykov.gatekeeper.api.Settings
import ru.alexbykov.gatekeeper.utils.presenter.TokenHelper

/**
 * Date: 04.06.2017
 * Time: 10:46
 * Project: Android Template

 * @author Alex Bykov
 * *         You can contact me at me@alexbykov.ru
 */

@Module
class RestModule(app: App) {

    private val tokenHelper: TokenHelper = TokenHelper(PreferenceManager.getDefaultSharedPreferences(app))
    private val restApi: RestApi
    private val settings: Settings= Settings(app)

    init {
        restApi = RestApi(tokenHelper)
    }


    @Singleton
    @Provides
    internal fun provideSettings(): Settings {
        return settings
    }

    @Singleton
    @Provides
    internal fun provideRestApi(): RestApi {
        return restApi
    }

    @Singleton
    @Provides
    internal fun provideTokenHelper(): TokenHelper {
        return tokenHelper
    }
}

