package ru.alexbykov.gatekeeper.di.components

import javax.inject.Singleton

import dagger.Component
import ru.alexbykov.gatekeeper.App
import ru.alexbykov.gatekeeper.activities.BaseActivity
import ru.alexbykov.gatekeeper.di.modules.ViewModule
import ru.alexbykov.gatekeeper.fragments.BaseFragment

/**
 * Date: 04.06.2017
 * Time: 10:30
 * Project: Android Template

 * @author Alex Bykov
 * *         You can contact me at me@alexbykov.ru
 */


@Singleton
@Component(modules = arrayOf(ViewModule::class))
interface ViewComponent {
    fun inject(app: App)
    fun inject(baseFragment: BaseFragment)
    fun inject(baseActivity: BaseActivity)
}
