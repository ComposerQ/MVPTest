package com.rabbit.mvptest.addUser.presenter;

/**
 * Created by shmilylhg on 2016/5/25.
 */
public interface IUserPresenter {
    void saveUser(int id,String firstName,String lastName);
    void loadUser(int id);
    void setProgressBarVisibility(int visibility);
    void doLogin();
    void onDestroy();
}
