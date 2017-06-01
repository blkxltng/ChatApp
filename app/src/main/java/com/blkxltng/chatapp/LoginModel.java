package com.blkxltng.chatapp;

/**
 * Created by firej on 5/18/2017.
 */

public interface LoginModel {

    interface OnLoginFinishedListener {

        void onCanceled();

        void onPasswordError();

        void onSuccess();
    }

    void login(String usernamme, String password, OnLoginFinishedListener listener);
}
