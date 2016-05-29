package com.rabbit.mvptest.login.view;

/**
 * Created by shmilylhg on 2016/5/25.
 */
public interface ILoginView {
    void onClearText();
    void onLoginResult(Boolean result,int code);
    void onSetProgressBarVisibility(int visibility);
}
