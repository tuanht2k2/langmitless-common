package com.kma.common.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response<T> {
    private Integer code;
    private T data;
    private String message;

    public static Response<Object> getResponse(Integer code, Object data, String message) {
        return new Response<>(code, data, message);
    }

    public static Response<Object> getResponse(Integer code, String message) {
        return new Response<>(code, message);
    }

    public Response (Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
