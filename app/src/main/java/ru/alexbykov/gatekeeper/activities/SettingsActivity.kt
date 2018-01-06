package ru.alexbykov.gatekeeper.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle

import ru.alexbykov.gatekeeper.interfaces.views.SettingsView
import ru.alexbykov.gatekeeper.presenters.SettingsPresenter
import ru.alexbykov.gatekeeper.activities.BaseActivity
import ru.alexbykov.gatekeeper.R


import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import kotlinx.android.synthetic.main.activity_settings.*
import kotlinx.android.synthetic.main.toolbar.*

import ru.alexbykov.gatekeeper.utils.Injector


class SettingsActivity : BaseSingleActivity(), SettingsView {

    companion object {
        private val LAYOUT = R.layout.activity_settings
    }


    @InjectPresenter lateinit var settingsPresenter: SettingsPresenter

    @ProvidePresenter
    internal fun provideSettingsPresenter(): SettingsPresenter {
        return Injector.presenterComponent!!.settingsPresenter
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(LAYOUT)
        super.onCreate(savedInstanceState)
    }


    override fun setupUI() {
        toolbar.title = getString(R.string.settings)
    }

    override fun setupUX() {
        ltAutoCall.setOnClickListener {
            switchAutoCall.isChecked = !switchAutoCall.isChecked
            settingsPresenter.saveAutoCall(switchAutoCall.isChecked)
        }
    }

    override fun unbindUX() {
        ltAutoCall.setOnClickListener(null)
    }

    override fun setAutoCallEnabled(enabled: Boolean) {
        switchAutoCall.isChecked = enabled
    }


}
