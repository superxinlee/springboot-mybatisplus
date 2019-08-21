package com.superxinlee.springbootmybatisplus.vo;

import com.superxinlee.springbootmybatisplus.enums.ResultCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResultVo {
    //http结果响应码
    private Integer code;
    //提示信息
    private String msg;
    //返回对象内容
    private Object data;


    public ResultVo(ResultCodeEnum resultCodeEnum, Object data) {
        this(resultCodeEnum.getCode(), resultCodeEnum.getMessage(), data);
    }

    public ResultVo(ResultCodeEnum resultCodeEnum){
        this(resultCodeEnum.getCode(),resultCodeEnum.getMessage(),null);
    }
}
