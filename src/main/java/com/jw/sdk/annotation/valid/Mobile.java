package com.jw.sdk.annotation.valid;


import org.hibernate.validator.constraints.CompositionType;
import org.hibernate.validator.constraints.ConstraintComposition;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * <li>移动 134 135 136 137 138 139 147 148 150 151 152 157 158 159 178 182 183 184 187 188 198 1440 1703 1705 1706 <br>
 *  (^1((3[4-9]|4[78]|5[0-2,7-9]|78|8[2-478]|98)\d{8}$))|(^1(440|70[356])\d{7}$) </li>
 *
 * <li>联通 130 131 132 155 156 185 186 145 146 166 167 175 176 1704 1707 1708 1709 1710 1711 1712 1713 1714 1715 1716 1717 1718 1719 <br>
 *  (^1((3[0-2]|4[56]|5[56]|6[67]|7[156]|8[56])\d{8}$))|(^170[47-9]\d{7}$) </li>
 *
 * <li>电信 133 153 177 180 181 189 191 199 1349 1410 1700 1701 1702 1740 <br>
 *  (^1((33|53|77|8[019]|9[19])\d{8}$))|(^1(349|410|70[0-2]|740)\d{7}$) </li>
 *
 * <li>综合 <br>
 * (^1((3[0-9]|4[5-8]|5[0-35-9]|6[67]|7[015-8]|8[0-9]|9[189])\d{8}$))|(^1(349|4[14]0|740)\d{7}$) </li>
 *
 * @author zhangxin
 * @date 2019/4/23
 */
@ConstraintComposition(CompositionType.OR)
@Pattern(regexp = "(^1((3[0-9]|4[5-8]|5[0-35-9]|6[67]|7[015-8]|8[0-9]|9[189])\\d{8}$))|(^1(349|4[14]0|740)\\d{7}$)")
@Documented
@Constraint(validatedBy = {})
@Target({METHOD, FIELD, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@ReportAsSingleViolation
public @interface Mobile {

    String message() default "手机号格式错误";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
