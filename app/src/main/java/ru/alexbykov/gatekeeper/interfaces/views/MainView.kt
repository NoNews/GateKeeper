package ru.alexbykov.gatekeeper.interfaces.views

interface MainView : BaseView {

    fun showNoPhone(show: Boolean)

    fun makeCall(phone: String, isAutoCall: Boolean)

}
