package com.example.wiesiek.mvphelloworld.Presenter;

import android.os.Handler;

import com.example.wiesiek.mvphelloworld.InterfejsyKaty.IAsyncLoginInteractor;
import com.example.wiesiek.mvphelloworld.InterfejsyKaty.OnLoginFinishedListener;

/**
 * Created by Wiesiek on 2017-10-06.
 */

public class AsyncLoginInteractor implements IAsyncLoginInteractor{
    @Override
    public void validateCredentialsAsync(final OnLoginFinishedListener listener,final String username, final String password) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                if ((username.length() > 3) && (password.length() > 3)) {
//                    listener.onSuccess();
                    listener.onSucces();
                } else {
                    listener.onError();
                }
            }
        }, 2000);
    }
}
