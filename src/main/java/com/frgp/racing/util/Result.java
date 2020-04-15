package com.frgp.racing.util;

import lombok.Data;

@Data
public class Result {
    private static final int CODE_SUCCESS = 200;

    private static final int CODE_FAIL = 400;

    private static final String MSG_SUCCESS = "操作成功";

    private static final String MSG_FAIL = "操作失败";

    public int code;

    public String msg;

    public Object data;

    public boolean success;

    public Result() {
    }

    public Result(int code) {
        this.code = code;
        this.success = code == CODE_SUCCESS;
    }

    public Result(int code, Object data) {
        this.code = code;
        this.data = data;
        this.success = code == CODE_SUCCESS;
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.success = code == CODE_SUCCESS;
    }

    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.success = code == CODE_SUCCESS;
    }

    public Result(int code, String msg, Object data, boolean success) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.success = success;
    }

    public static Result success() {
        return new Result(CODE_SUCCESS, MSG_SUCCESS);
    }

    public static Result success(Object data) {
        return new Result(CODE_SUCCESS, MSG_SUCCESS, data);
    }

    public static Result success(String msg, Object data) {
        return new Result(CODE_SUCCESS, msg, data);
    }

    public static Result fail() {
        return new Result(CODE_FAIL, MSG_FAIL);
    }

    public static Result fail(Object data) {
        return new Result(CODE_FAIL, MSG_FAIL, data);
    }

    public static Result fail(String msg, Object data) {
        return new Result(CODE_FAIL, msg, data);
    }
}
