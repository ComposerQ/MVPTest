package com.rabbit.mvptest.addUser.presenter;

import android.os.Handler;
import android.os.Looper;

import com.rabbit.mvptest.addUser.bean.UserBean;
import com.rabbit.mvptest.addUser.model.IUserModel;
import com.rabbit.mvptest.addUser.model.UserModel;
import com.rabbit.mvptest.addUser.view.IUserView;

/**
 * Created by shmilylhg on 2016/5/25.
 */
public class UserPresenter implements IUserPresenter{

    private IUserView iUserView;
    private IUserModel iUserModel;
    Handler handler;

    public UserPresenter(IUserView view) {
        iUserView = view;
        iUserModel = new UserModel(000,"","");
        handler = new Handler(Looper.getMainLooper());
    }

    @Override
    public void saveUser(int id,String firstName,String lastName) {
        iUserModel.setID(id);
        iUserModel.setFirstName(firstName);
        iUserModel.setLastName(lastName);
    }

    @Override
    public void loadUser(int id) {
        UserBean user = iUserModel.load(id);
        iUserView.setFirstName(user.getFirstName());
        iUserView.setLastName(user.getLastName());

    }

    @Override
    public void setProgressBarVisibility(int visibility) {
        iUserView.onSetProgressBarVisibility(visibility);
    }

    @Override
    public void doLogin() {

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                iUserView.onLoginResult();
            }
        }, 5000);
    }

    @Override
    public void onDestroy() {

    }
}
