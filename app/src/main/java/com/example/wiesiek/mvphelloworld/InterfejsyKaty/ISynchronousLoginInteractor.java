package com.example.wiesiek.mvphelloworld.InterfejsyKaty;

/**
 * Created by Wiesiek on 2017-10-06.
 */

public interface ISynchronousLoginInteractor {
    void validatedCredentials(OnLoginFinishedListener onLoginFinishedListener,String username, String password);
}
