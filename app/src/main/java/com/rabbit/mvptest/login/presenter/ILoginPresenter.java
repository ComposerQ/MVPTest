package com.rabbit.mvptest.login.presenter;

/**
 * Created by shmilylhg on 2016/5/25.
 */
public interface ILoginPresenter {

    void clear();

    void doLogin(String name,String password);

    void setProgressBarVisibility(int visibility);

    void onDestroy();
}
