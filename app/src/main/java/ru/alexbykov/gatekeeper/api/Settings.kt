package ru.alexbykov.gatekeeper.api

import ru.alexbykov.gatekeeper.App

/**
 * @author Alex Bykov
 * *         Date: 06.01.2018.
 * *
 *
 *
 * *         You can contact me at me@alexbykov.ru
 */

class Settings(app: App) {


    fun savePhoneGate1(phone: String) {

    }


    fun savePhoneGate2(phone: String) {

    }


    fun getPhoneGate1():String {
        return ""
    }

    fun getPhoneGate2():String {
        return ""
    }


    fun isAutoCallEnabled():Boolean{
        return true
    }

    fun isNoPhones(): Boolean {
        return false
    }

}
