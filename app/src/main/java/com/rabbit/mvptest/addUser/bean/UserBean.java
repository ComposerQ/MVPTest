package com.rabbit.mvptest.addUser.bean;

/**
 * Created by shmilylhg on 2016/5/26.
 */
public class UserBean {
    private String mFirstName;
    private String mLastName;

    public UserBean(String firstName,String lastName) {
        mFirstName = firstName;
        mLastName = lastName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }
}
