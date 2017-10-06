package com.example.wiesiek.mvphelloworld.Presenter;

import com.example.wiesiek.mvphelloworld.InterfejsyKaty.ISynchronousLoginInteractor;

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
    public boolean validatedCredentials( String username, String password) {
        return username.contains("gmail");
    }
}
