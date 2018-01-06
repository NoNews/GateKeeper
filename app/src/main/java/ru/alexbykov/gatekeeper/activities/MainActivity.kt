package ru.alexbykov.gatekeeper.activities


import android.os.Bundle

import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import kotlinx.android.synthetic.main.activity_main.*

import ru.alexbykov.gatekeeper.R
import ru.alexbykov.gatekeeper.interfaces.views.MainView
import ru.alexbykov.gatekeeper.presenters.MainActivityPresenter
import ru.alexbykov.gatekeeper.utils.Injector
import android.content.Intent
import android.net.Uri
import kotlinx.android.synthetic.main.toolbar.*


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
        toolbar.inflateMenu(R.menu.menu)
        toolbar.setOnMenuItemClickListener {
            startActivity(SettingsActivity::class.java)
            true
        }
    }

    override fun setupUX() {
        btnGateOne.setOnClickListener { mainPresenter.onClickGateOne() }
        btnGateTwo.setOnClickListener { mainPresenter.onClickGateTwo() }
        btnSettings.setOnClickListener { startActivity(SettingsActivity::class.java) }
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
        } else {
            hideView(ltSettings)
            showView(ltGateButtons)
        }
    }



    override fun makeCall(phone: String, isAutoCall: Boolean) {
        var action: String? = null
        if (isAutoCall) {
            action = Intent.ACTION_CALL
        } else {
            action = Intent.ACTION_VIEW
        }
        val intent = Intent(action)
        intent.data = Uri.parse("tel:" + phone)
        startActivity(intent)
    }

}
