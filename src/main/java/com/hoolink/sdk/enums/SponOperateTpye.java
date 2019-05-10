package com.hoolink.sdk.enums;

/**
 * @author chenzhixiong
 * @date 2019/3/15 17:21
 */
public enum SponOperateTpye {
    /**
     * 操作类型（0：延时操作；1：对讲操作；2：监听操作；3：广播操作；4：指令操
     */
    DELAY(0,"延时"),
    ABUTMENT(1,"对接"),
    LISTEN(2,"监听"),
    BROADCAST(3,"广播"),
    COMMAND(4,"指令");

    private Integer statusCode;
    private String statusType;

    SponOperateTpye(Integer statusCode,String statusType) {
        this.statusCode = statusCode;
        this.statusType = statusType;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getStatusType() {
        return statusType;
    }
}
