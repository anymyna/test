package com.example.laboratory.test.mockito;

/**
 *
 */
public interface NetworkCallback {
    void onSuccess(Object data);
    void onFailure(int code, String msg);
}
