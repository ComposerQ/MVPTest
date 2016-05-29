package com.rabbit.mvptest.login.model;

/**
 * Created by shmilylhg on 2016/5/25.
 */
public interface IUser {

    String getName();

    String getPassword();

    int checkUserValidity(String name,String password);
}
