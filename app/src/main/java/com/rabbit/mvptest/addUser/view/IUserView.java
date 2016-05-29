package com.rabbit.mvptest.addUser.view;

/**
 * Created by shmilylhg on 2016/5/25.
 */
public interface IUserView {
    int getID();
    String getFirstName();
    String getLastName();
    void setFirstName(String firstName);
    void setLastName(String lastName);
    void onLoginResult();
    void onSetProgressBarVisibility(int visibility);
}
