package com.guoer.shooting.utils;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor(staticName = "newInstance")
@AllArgsConstructor
public class Result<T> {

    @JsonProperty("c")
    @NonNull
    private Integer code = 0;

    @JsonProperty("m")
    @NonNull
    private String message = "ok";

    @JsonProperty("d")
    private T data;

    public static <T> Result<T> build(Integer code, String message) {
        Result<T> r = Result.newInstance();
        r.setCode(code);
        r.setMessage(message);

        return r;
    }

    public static Result success() {
        return Result.newInstance();
    }

    public static <T> Result<T> success(T data) {
        return success(data, false);
    }

    public static <T> Result<T> success(T data, boolean asMessage) {
        Result<T> r = Result.newInstance();
        if (asMessage && data instanceof String) {
            r.setMessage(String.valueOf(data));
        } else {
            r.setData(data);
        }
        return r;
    }

    public static <T> Result<T> error(String message) {
        return error(-1, message);
    }

    public static <T> Result<T> error(Integer code) {
        return error(code, "操作失败");
    }

    public static <T> Result<T> error(Integer code, String message) {
        return build(code, message);
    }

    public static <T> Result<T> errorParams() {
        return error("非法参数");
    }

    public static <T> Result<T> copyObject(Result target) {
        Result<T> r = Result.newInstance();

        return build(target.getCode(), target.getMessage());
    }
}
