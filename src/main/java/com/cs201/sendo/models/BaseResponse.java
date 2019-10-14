package com.cs201.sendo.models;

import lombok.ToString;

@ToString
public class BaseResponse<T> {
    private BaseResponseHeader header = new BaseResponseHeader();
    private T data = null;

    public BaseResponse() {
    }

    public BaseResponse(T data) {
        this.data = data;
    }

    public BaseResponse(BaseResponseHeader header, T data) {
        this.header = header;
        this.data = data;
    }

    public BaseResponseHeader getHeader() {
        return header;
    }

    public void setHeader(BaseResponseHeader header) {
        this.header = header;
    }

    public void setHeader(RuntimeException runTimeException) {
        this.header.setResultMessage(runTimeException.getMessage());
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
