package com.blkxltng.chatapp;

/**
 * Created by firej on 5/18/2017.
 */

public interface LoginView {

    void showProgress(boolean showProgress);

    void setUsernameError(int messageResId);

    void setPasswordError(int messageResId);

    void successAction();
}
