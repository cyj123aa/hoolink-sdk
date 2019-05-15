package com.hoolink.sdk.bo.command.camera.ys;

/**
 * @author chenzhixiong
 * @date 2018/12/29 14:02
 */
public class TokenBackBO {
   private String code;
   private String msg;
   private Data data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data{
       private String accessToken;
       private String expireTime;

       public String getAccessToken() {
           return accessToken;
       }

       public void setAccessToken(String accessToken) {
           this.accessToken = accessToken;
       }

       public String getExpireTime() {
           return expireTime;
       }

       public void setExpireTime(String expireTime) {
           this.expireTime = expireTime;
       }
   }

    @Override
    public String toString() {
        return "TokenBackBO{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
