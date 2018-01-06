package ru.alexbykov.gatekeeper.presenters

import android.util.Log
import com.arellomobile.mvp.InjectViewState
import ru.alexbykov.gatekeeper.api.RestApi
import ru.alexbykov.gatekeeper.interfaces.views.MainView
import javax.inject.Inject

@InjectViewState
class MainActivityPresenter @Inject
internal constructor(restApi: RestApi) : BasePresenter<MainView>() {


    init {
        this.restApi = restApi
        Log.d(TAG, "MainActivityPresenter: text")
    }

}
