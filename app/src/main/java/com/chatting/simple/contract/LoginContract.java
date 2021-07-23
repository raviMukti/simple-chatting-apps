package com.chatting.simple.contract;

import com.chatting.simple.model.CustomUser;

public interface LoginContract {

    interface View{
        void showChatRoom();
    }

    interface Interactor{
        void login(CustomUser user);
    }

    interface Presenter{
        void login(CustomUser user);
    }
}
