package com.example.laboratory.test.mockito.annotation;



import com.example.laboratory.test.mockito.PasswordValidator;
import com.example.laboratory.test.mockito.dagger2.UserManager;

import javax.inject.Inject;

/**
 * Created by xiaochuang on 4/29/16.
 */
public class LoginPresenter {
    private final UserManager mUserManager;
    private final PasswordValidator mPasswordValidator;

    public LoginPresenter() {
        this(null, null);
    }

    @Inject
    public LoginPresenter(UserManager userManager, PasswordValidator passwordValidator) {
        this.mUserManager = userManager;
        this.mPasswordValidator = passwordValidator;
    }

    public void login(String username, String password) {
        if (username == null || username.length() == 0) return;
        if (!mPasswordValidator.verifyPassword(password)) return;

        mUserManager.performLogin(username, password);
    }

}
