package ru.alexbykov.gatekeeper.activities


import android.os.Bundle

import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import kotlinx.android.synthetic.main.activity_main.*

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
        setContentView(LAYOUT)
        super.onCreate(savedInstanceState)
    }

    override fun setupUI() {
        toolbar.title = getString(R.string.app_name)
    }

    override fun setupUX() {
        btnGateOne.setOnClickListener { }
        btnGateTwo.setOnClickListener { }
        btnSettings.setOnClickListener {  }
    }

    override fun unbindUX() {
        btnGateOne.setOnClickListener(null)
        btnGateTwo.setOnClickListener(null)
        btnSettings.setOnClickListener(null)
    }

    override fun showNoPhone(show: Boolean) {
        if (show) {
            hideView(ltGateButtons)
            showView(ltSettings)
        }
        else{
            hideView(ltSettings)
            showView(ltGateButtons)
        }
    }

    override fun makeCall(phone: String, isAutoCall: Boolean) {

    }


}
