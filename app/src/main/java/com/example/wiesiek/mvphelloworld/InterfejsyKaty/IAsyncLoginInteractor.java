package com.example.wiesiek.mvphelloworld.InterfejsyKaty;

/**
 * Created by Wiesiek on 2017-10-06.
 */

public interface IAsyncLoginInteractor {
    public void validateCredentialsAsync (OnLoginFinishedListener listener,String username, String password);

}
