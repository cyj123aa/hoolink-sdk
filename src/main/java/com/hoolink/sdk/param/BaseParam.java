package com.hoolink.sdk.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author zhao_aken
 * Created by zhao_aken on 2017/11/27.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseParam<T> implements Serializable {

    private static final long serialVersionUID = 3710671367322502503L;

    private T data;

}
