package com.example.wiesiek.mvphelloworld.Presenter;

import com.example.wiesiek.mvphelloworld.InterfejsyKaty.ILoginView;
import com.example.wiesiek.mvphelloworld.InterfejsyKaty.ILoginPresenter;
import com.example.wiesiek.mvphelloworld.InterfejsyKaty.OnLoginFinishedListener;

/**
 * Created by Wiesiek on 2017-09-27.
 */

public class LoginPresenter implements ILoginPresenter, OnLoginFinishedListener {

    ILoginView login;
    AsyncLoginInteractor asyncLoginInteractor;
    SynchronousLoginInteractor synchronousLoginInteractor;
    public LoginPresenter(ILoginView login){
        this.login=login;
         asyncLoginInteractor = new AsyncLoginInteractor();
        synchronousLoginInteractor = new SynchronousLoginInteractor();

    }

    @Override
    public void AttemptLogin(String username, String password) {
//        asyncLoginInteractor.validateCredentialsAsync(this, username,password);
        synchronousLoginInteractor.validatedCredentials(this, username,password);
    }

    @Override
    public void onError() {
        login.loginFailed();
    }

    @Override
    public void onSucces() {
        login.navigateToListActivity();
    }
}
