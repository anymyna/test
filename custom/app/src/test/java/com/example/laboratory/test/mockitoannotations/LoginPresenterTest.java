package com.example.laboratory.test.mockitoannotations;



import com.example.laboratory.test.mockito.PasswordValidator;
import com.example.laboratory.test.mockito.annotation.LoginPresenter;
import com.example.laboratory.test.mockito.dagger2.UserManager;


import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;

/**
 * Created by xiaochuang on 5/15/16.
 */
public class LoginPresenterTest {

    @Rule public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    UserManager mockUserManager;
    @Mock
    PasswordValidator mockValidator;
   
    @InjectMocks
    LoginPresenter loginPresenter;

//    @Sy PasswordValidator spyValidator; //使用@Spy创建Spy对象的例子

    @Test
    public void testLogin() {
        Mockito.when(mockValidator.verifyPassword("xiaochuang is handsome")).thenReturn(true);
        loginPresenter.login("xiaochuang", "xiaochuang is handsome");

        verify(mockUserManager).performLogin("xiaochuang", "xiaochuang is handsome");
    }
}