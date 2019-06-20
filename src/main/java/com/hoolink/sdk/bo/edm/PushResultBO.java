package com.hoolink.sdk.bo.edm;

import lombok.Data;

/**
 * @Author: tonghao
 * @Date: 2019/6/17 10:05
 */
@Data
public class PushResultBO {

    public long msg_id;
    public int sendno;
    public int statusCode;
    public PushResultBO.Error error;

    public PushResultBO() {
    }

    public class Error {
        String message;
        int code;

        public Error() {
        }

        public String getMessage() {
            return this.message;
        }

        public int getCode() {
            return this.code;
        }
    }
}
