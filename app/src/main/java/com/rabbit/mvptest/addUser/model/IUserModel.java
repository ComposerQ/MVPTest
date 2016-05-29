package com.rabbit.mvptest.addUser.model;

import com.rabbit.mvptest.addUser.bean.UserBean;

/**
 * Created by shmilylhg on 2016/5/25.
 */
public interface IUserModel {

    int getID();
    
    String getFirstName();

    String getLastName();

    void setID(int id);

    void setFirstName(String firstName);

    void setLastName(String lastName);

    UserBean load(int id);
}
