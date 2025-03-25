package com.example.dog_walker_application.ui.login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class loginViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public loginViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is login fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}