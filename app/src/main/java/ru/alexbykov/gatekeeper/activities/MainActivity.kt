package ru.alexbykov.gatekeeper.activities


import android.os.Bundle

import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter

import ru.alexbykov.gatekeeper.R
import ru.alexbykov.gatekeeper.interfaces.views.MainView
import ru.alexbykov.gatekeeper.presenters.MainActivityPresenter
import ru.alexbykov.gatekeeper.utils.Injector

class MainActivity : BaseActivity(), MainView {


    companion object {
        private val LAYOUT = R.layout.activity_main
    }

    @InjectPresenter
    lateinit var mainPresenter: MainActivityPresenter

    @ProvidePresenter
    internal fun provideMainActivityPresenter(): MainActivityPresenter {
        return Injector.presenterComponent!!.mainActivityPresenter
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(LAYOUT)
    }

    override fun setupUI() {

    }

    override fun setupUX() {

    }


}
