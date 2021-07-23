package com.chatting.simple.presenter;

import com.chatting.simple.contract.LoginContract;
import com.chatting.simple.model.CustomUser;

public class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.View loginView;
    private LoginContract.Interactor loginInteractor;

    public LoginPresenter(LoginContract.View loginView, LoginContract.Interactor loginInteractor) {
        this.loginView = loginView;
        this.loginInteractor = loginInteractor;
    }

    @Override
    public void login(CustomUser user) {
        try {
            loginInteractor.login(user);
            loginView.showChatRoom();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
