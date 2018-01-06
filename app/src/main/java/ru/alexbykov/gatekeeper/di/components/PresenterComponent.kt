package ru.alexbykov.gatekeeper.di.components

import javax.inject.Singleton

import dagger.Component
import ru.alexbykov.gatekeeper.App
import ru.alexbykov.gatekeeper.di.modules.RestModule
import ru.alexbykov.gatekeeper.di.modules.UtilsModule
import ru.alexbykov.gatekeeper.presenters.MainActivityPresenter
import ru.alexbykov.gatekeeper.presenters.SplashPresenter

/**
 * Created by Alex Bykov on 09.11.2016.
 * You can contact me at: me@alexbykov.ru.
 */


@Singleton
@Component(modules = arrayOf(RestModule::class, UtilsModule::class))
interface PresenterComponent {
    //@formatter:off
    fun inject(app: App)

    val mainActivityPresenter: MainActivityPresenter
    val splashPresenter: SplashPresenter
}
