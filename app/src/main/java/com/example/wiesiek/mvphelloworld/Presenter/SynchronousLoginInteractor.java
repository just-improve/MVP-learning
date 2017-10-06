package com.example.wiesiek.mvphelloworld.Presenter;

import android.os.Handler;

import com.example.wiesiek.mvphelloworld.InterfejsyKaty.ISynchronousLoginInteractor;
import com.example.wiesiek.mvphelloworld.InterfejsyKaty.OnLoginFinishedListener;

/**
 * Created by Wiesiek on 2017-10-06.
 */

public class SynchronousLoginInteractor implements ISynchronousLoginInteractor {

    /******************************************************************************************
     * An Interactor helps models cross application boundaries such as networks or serialization
     * This LoginInteractor knows nothing about a UI or the LoginPresenter
     *******************************************************************************************
     */

    public SynchronousLoginInteractor(){}


    @Override
    public void validatedCredentials(final OnLoginFinishedListener onLoginFinishedListener, final String username,final String password) {
       final boolean  resultUser = username.contains("leon");
       final boolean resultPass = password.contains("2015");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (resultPass==true && resultUser ==true){
                    onLoginFinishedListener.onSucces();
                }
                else
                    onLoginFinishedListener.onError();
            }
        }, 5000);



//        return username.contains("gmail");
    }
}
