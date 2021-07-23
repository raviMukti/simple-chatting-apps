package com.chatting.simple.interactor;

import android.content.Context;
import android.widget.Toast;

import com.chatting.simple.contract.LoginContract;
import com.chatting.simple.model.CustomUser;
import com.sendbird.android.SendBird;
import com.sendbird.android.SendBirdException;
import com.sendbird.android.User;

public class LoginInteractor implements LoginContract.Interactor {

    private Context context;

    @Override
    public void login(CustomUser user) {
        SendBird.connect(user.getUserId(), new SendBird.ConnectHandler() {
            @Override
            public void onConnected(User user, SendBirdException e) {
                if (e != null)
                {
                    // Error
                    Toast.makeText(context, e.getCode() + ":" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
