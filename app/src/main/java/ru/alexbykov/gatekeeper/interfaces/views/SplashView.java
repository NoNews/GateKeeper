package ru.alexbykov.gatekeeper.interfaces.views;

import ru.alexbykov.gatekeeper.interfaces.utils_view.NavigatorActivityView;

public interface SplashView extends BaseView, NavigatorActivityView {
    void showErrorConnection(boolean show);
}
