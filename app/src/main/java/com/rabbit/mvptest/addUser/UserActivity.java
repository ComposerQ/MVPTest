package com.rabbit.mvptest.addUser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.rabbit.mvptest.R;
import com.rabbit.mvptest.addUser.presenter.IUserPresenter;
import com.rabbit.mvptest.addUser.presenter.UserPresenter;
import com.rabbit.mvptest.addUser.view.IUserView;

/**
 * Created by shmilylhg on 2016/5/25.
 */
public class UserActivity extends AppCompatActivity implements IUserView,View.OnClickListener{

    private EditText mID;
    private EditText mFirstName;
    private EditText mLastName;

    private Button mBtnDeposit;
    private Button mBtnTake;

    IUserPresenter userPresenter;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_user);

        mID = (EditText)this.findViewById(R.id.id);
        mFirstName = (EditText)this.findViewById(R.id.first_name);
        mLastName = (EditText)this.findViewById(R.id.last_name);
        progressBar = (ProgressBar) this.findViewById(R.id.progress_login);

        mBtnDeposit = (Button)this.findViewById(R.id.btn_deposit);
        mBtnDeposit.setOnClickListener(this);

        mBtnTake = (Button)this.findViewById(R.id.btn_take);
        mBtnTake.setOnClickListener(this);

        userPresenter = new UserPresenter(this);
        userPresenter.setProgressBarVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_take:
                userPresenter.setProgressBarVisibility(View.VISIBLE);
                userPresenter.saveUser(getID(),getFirstName(),getLastName());
                break;
            case R.id.btn_deposit:
                userPresenter.setProgressBarVisibility(View.VISIBLE);
                userPresenter.loadUser(getID());
                break;
            default:
                break;
        }
    }

    @Override
    public int getID() {
        return new Integer(mID.getText().toString());
    }

    @Override
    public String getFirstName() {
        return mFirstName.getText().toString();
    }

    @Override
    public String getLastName() {
        return mLastName.getText().toString();
    }

    @Override
    public void setFirstName(String firstName) {
        mFirstName.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        mLastName.setText(lastName);
    }

    @Override
    public void onSetProgressBarVisibility(int visibility) {
        progressBar.setVisibility(visibility);
    }

    @Override
    public void onLoginResult() {

    }


}
