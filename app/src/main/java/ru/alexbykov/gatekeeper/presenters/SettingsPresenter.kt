package ru.alexbykov.gatekeeper.presenters


import ru.alexbykov.gatekeeper.interfaces.views.SettingsView

import com.arellomobile.mvp.InjectViewState
import ru.alexbykov.gatekeeper.api.Settings

import javax.inject.Inject


@InjectViewState
class SettingsPresenter @Inject constructor(val settings: Settings) : BasePresenter<SettingsView>() {


    init {
        viewState.setAutoCallEnabled(settings.isAutoCallEnabled())
    }

    fun saveAutoCall(enabled: Boolean) {
        settings.saveAutoCallEnabled(enabled)
    }
}