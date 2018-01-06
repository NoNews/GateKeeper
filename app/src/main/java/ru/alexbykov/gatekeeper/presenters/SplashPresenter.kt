package ru.alexbykov.gatekeeper.presenters

import com.arellomobile.mvp.InjectViewState

import javax.inject.Inject

import ru.alexbykov.gatekeeper.activities.MainActivity
import ru.alexbykov.gatekeeper.api.RestApi
import ru.alexbykov.gatekeeper.interfaces.views.SplashView
import ru.alexbykov.gatekeeper.utils.presenter.TokenHelper


@InjectViewState
class SplashPresenter @Inject
internal constructor(restApi: RestApi, preferenceHelper: TokenHelper) : BasePresenter<SplashView>() {

    init {
        this.restApi = restApi
        this.tokenHelper = preferenceHelper
        startNext()
    }


    fun startNext() {
        viewState.showErrorConnection(false)
        if (tokenHelper!!.isFirstRun) {
            viewState.startActivity(MainActivity::class.java)
        }
    }

}
