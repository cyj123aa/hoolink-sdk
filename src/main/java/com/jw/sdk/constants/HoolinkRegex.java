package com.jw.sdk.constants;

/**
 * @author XuBaofeng.
 * @date 2018-12-29 14:59.
 * <p>
 * description:
 */
public interface HoolinkRegex {

    /*** IP地址 ***/
    String IP_NUM = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";
    String IP_REGEX = "^" + IP_NUM + "\\." + IP_NUM + "\\." + IP_NUM + "\\." + IP_NUM + "$";

    /*** 网址URL ***/
    String RUL_REGEX = "(http://|ftp://|https://|www){0,1}[^\u4e00-\u9fa5\\s]*?\\.(com|net|cn|me|tw|fr)[^\u4e00-\u9fa5\\s]*";

    /*** 电话号码 ***/
    String PHONE_REGEX = "^((13[0-9])|(14[5|7])|(15([0-3,5]|[5-9]))|(18[0,1,2,5-9])|(177))\\d{8}$";

    /*** 固定电话 ***/
    String FIXED_PHONE_REGEX = "^(0\\d{2}-\\d{8}(-\\d{1,4})?)|(0\\d{3}-\\d{7,8}(-\\d{1,4})?)$";

    /*** 邮箱 ***/
    String EMAIL_REGEX = "\\w+@([\\w]+[\\w-]*)(\\.[\\w]+[-\\w]*)+";

    /*** 身份证 ***/
    String REGULAR_EXPRESSION_REGEX = "(^[1-9]\\d{5}(18|19|20)\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$)| (^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}$)";

    /*** 字符串不全为空格 ***/
    String STRING_NOT_NULL = "^[^ ]+$";

    /*** 边缘节点名称规则 ***/
    String FRINGE_NODE_NAME = "^[a-zA-Z0-9\\u4e00-\\u9fa5_\\\\-]+$";
}
