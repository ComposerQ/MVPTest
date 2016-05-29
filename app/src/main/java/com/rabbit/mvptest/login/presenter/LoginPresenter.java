package com.rabbit.mvptest.login.presenter;

import android.os.Handler;
import android.os.Looper;

import com.rabbit.mvptest.login.model.IUser;
import com.rabbit.mvptest.login.model.UserModel;
import com.rabbit.mvptest.login.view.ILoginView;

/**
 * Created by shmilylhg on 2016/5/25.
 */
public class LoginPresenter implements ILoginPresenter{

    ILoginView iLoginView;
    IUser user;
    Handler handler;

    public LoginPresenter(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
        initUser();
        handler = new Handler(Looper.getMainLooper());
    }

    @Override
    public void clear() {
        iLoginView.onClearText();
    }

    @Override
    public void doLogin(String name, String password) {

        Boolean isLoginSuccess = true;

        final int code = user.checkUserValidity(name,password);

        if (code!=0) {
            isLoginSuccess = false;
        }

        final Boolean result = isLoginSuccess;

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                iLoginView.onLoginResult(result, code);
            }
        }, 5000);


    }

    @Override
    public void setProgressBarVisibility(int visibility) {
        iLoginView.onSetProgressBarVisibility(visibility);
    }

    @Override
    public void onDestroy() {
        iLoginView = null;
    }

    private void initUser() {
        user = new UserModel("mvp","mvp");
    }
}
