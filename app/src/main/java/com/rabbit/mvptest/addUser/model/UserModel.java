package com.rabbit.mvptest.addUser.model;

import com.rabbit.mvptest.addUser.bean.UserBean;

/**
 * Created by shmilylhg on 2016/5/25.
 */
public class UserModel implements IUserModel{

    private int mID;
    private String mFirstName;
    private String mLastName;

    public UserModel(int id,String firstName,String lastName) {
        mID = id;
        mFirstName = firstName;
        mLastName = lastName;
    }

    @Override
    public int getID() {
        return mID;
    }

    @Override
    public String getFirstName() {
        return mFirstName;
    }

    @Override
    public String getLastName() {
        return mLastName;
    }

    @Override
    public void setID(int id) {
        mID = id;
    }

    @Override
    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    @Override
    public UserBean load(int id) {
        return new UserBean("","");
    }
}
