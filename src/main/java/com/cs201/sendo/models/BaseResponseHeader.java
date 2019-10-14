package com.cs201.sendo.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BaseResponseHeader {
    private boolean isSuccessful;
    private String resultCode;
    private String resultMessage;

    public BaseResponseHeader() {
        isSuccessful = true;
        resultCode = "0";
        resultMessage = "SUCCESS";
    }

    public BaseResponseHeader(boolean isSuccessful, String resultCode, String resultMessage) {
        this.isSuccessful = isSuccessful;
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
    }
}
