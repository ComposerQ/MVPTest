package com.rabbit.mvptest.login.model;

/**
 * Created by shmilylhg on 2016/5/25.
 */
public class UserModel implements IUser {

    String mName;
    String mPassword;

    public UserModel(String name,String password) {
        mName = name;
        mPassword = password;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public String getPassword() {
        return mPassword;
    }

    @Override
    public int checkUserValidity(String name,String password) {
        if (name==null||password==null||!name.equals(getName())||!password.equals(getPassword())) {
            return -1;
        }
        return 0;
    }
}
