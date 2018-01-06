package ru.alexbykov.gatekeeper.api

import ru.alexbykov.gatekeeper.App
import ru.alexbykov.gatekeeper.utils.BasePreferenceHelper

/**
 * @author Alex Bykov
 * *         Date: 06.01.2018.
 * *
 *
 *
 * *         You can contact me at me@alexbykov.ru
 */

class Settings(app: App) : BasePreferenceHelper(app) {


    companion object {
        private val PREF_PHONE_GATE_1 = "phone_gate_1_key"
        private val PREF_PHONE_GATE_2 = "phone_gate_2_key"
        private val PREF_AUTO_CALL_ENABLED = "is_auto_call_enabled_key"
    }


    fun savePhoneGate1(phone: String) {
        putString(PREF_PHONE_GATE_1, phone)
    }


    fun savePhoneGate2(phone: String) {
        putString(PREF_PHONE_GATE_2, phone)
    }


    fun getPhoneGate1() = getString(PREF_PHONE_GATE_1)

    fun getPhoneGate2() = getString(PREF_PHONE_GATE_2)


    fun isAutoCallEnabled(): Boolean {
        return getBoolean(PREF_AUTO_CALL_ENABLED)
    }


    fun saveAutoCallEnabled(enabled: Boolean) {
        putBoolean(PREF_AUTO_CALL_ENABLED, enabled)
    }

    fun isNoPhones(): Boolean {
        return getPhoneGate1().isEmpty() || getPhoneGate2().isEmpty()
    }

}
