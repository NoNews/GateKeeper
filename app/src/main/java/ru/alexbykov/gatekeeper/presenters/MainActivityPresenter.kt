package ru.alexbykov.gatekeeper.presenters

import com.arellomobile.mvp.InjectViewState
import ru.alexbykov.gatekeeper.api.RestApi
import ru.alexbykov.gatekeeper.api.Settings
import ru.alexbykov.gatekeeper.interfaces.views.MainView
import javax.inject.Inject

@InjectViewState
class MainActivityPresenter @Inject
internal constructor(restApi: RestApi,
                     val settings: Settings) : BasePresenter<MainView>() {


    init {
        this.restApi = restApi
        viewState.showNoPhone(settings.isNoPhones())
    }

    fun onClickGateOne() {

    }

    fun onClickGateTwo() {
        
    }

}
