package com.superxinlee.springbootmybatisplus.enums;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * API 统一返回状态码 Created by lixin on 19/5/24.
 */
@Getter
public enum ResultCodeEnum {

    /* 成功状态码 */
    SUCCESS(200, "成功"),
    EVAL_CODE_HAS_EXISTED(986, "二级维度代码已经存在"),
    HONOR_CODE_HAS_EXISTED(987, "一级维度代码已经存在"),
    CLASS_HAS_DISCIPLINE(988, "班级课程已经有任教老师"),
    CLASS_HAS_HEAD_MASTER(989, "班级已经拥有班主任"),
    SCHOOL_CODE_HAS_EXISTED(990, "菜单代码已经存在"),
    ROLE_CODE_HAS_EXISTED(991, "菜单代码已经存在"),
    ORG_CODE_HAS_EXISTED(992, "组织代码已经存在"),
    MENU_CODE_HAS_EXISTED(993, "菜单代码已经存在"),
    FIELD_CODE_HAS_EXISTED(994, "学科领域代码已经存在"),
    CLASS_CODE_HAS_EXISTED(995, "班级代码已经存在"),
    DISCIPLINE_APPLY_ERROR_TIME(996, "不在登记时间范围内,不能申请！"),
    DISCIPLINE_CODE_HAS_EXISTED(997, "该学校下已存在该学科码的学科"),
    DELETE_ERROR(998, "删除失败"),
    SAVE_ERROR(999, "保存失败"),
    /* 参数错误： */
    BAD_REQUEST(400, "参数解析失败"),
    METHOD_NOT_ALLOWED(405, "不支持当前请求方法"),
    SYSTEM_ERR(500, "服务器运行异常"),
    PARAM_IS_INVALID(10001, "参数无效"),
    PARAM_IS_BLANK(10002, "参数为空"),
    PARAM_TYPE_BIND_ERROR(10003, "参数类型错误"),
    PARAM_NOT_COMPLETE(10004, "参数缺失"),

    /* 用户错误：20001-29999 */
    USER_NOT_LOGGED_IN(20001, "用户未登录"),
    USER_LOGIN_ERROR(20002, "账号不存在或密码错误"),
    USER_ACCOUNT_FORBIDDEN(20003, "账号已被禁用"),
    USER_NOT_EXIST(20004, "用户不存在"),
    USER_HAS_EXISTED(20005, "用户已存在"),
    USER_USER_CODE_IS_BLANK(20006, "用户账号为空"),
    USER_IDENTITY_NUMBER_IS_BLANK(20007, "用户身份证号为空"),
    USER_PASSWORD_IS_BLANK(20008, "密码为空"),
    USER_USERNAME_IS_BLANK(20009, "姓名为空"),
    USER_ID_IS_BLANK(20010, "用户id为空"),
    CODE_IS_ERROR(20011, "验证码错误"),
    PASSWORD_IS_ERROR(20012, "用户密码错误"),
    USER_SCHOOL_NOT_EXIST(20013, "用户未绑定学校"),

    /* 系统错误：40001-49999 */
    SYSTEM_INNER_ERROR(40001, "系统繁忙，请稍后重试"),

    /* 数据错误：50001-599999 */
    DATA_NONE(50001, "数据未找到"),
    DATA_IS_WRONG(50002, "数据有误"),
    DATA_ALREADY_EXISTED(50003, "数据已存在"),

    /* 接口错误：60001-69999 */
    INTERFACE_INNER_INVOKE_ERROR(60001, "内部系统接口调用异常"),
    INTERFACE_OUTER_INVOKE_ERROR(60002, "外部系统接口调用异常"),
    INTERFACE_FORBID_VISIT(60003, "该接口禁止访问"),
    INTERFACE_ADDRESS_INVALID(60004, "接口地址无效"),
    INTERFACE_REQUEST_TIMEOUT(60005, "接口请求超时"),
    INTERFACE_EXCEED_LOAD(60006, "接口负载过高"),

    /* 权限错误：70001-79999 */
    PERMISSION_NO_ACCESS(70001, "无访问权限");


    private Integer code;

    private String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    @Override
    public String toString() {
        return this.name();
    }

    // 校验重复的code值
    public static void main(String[] args) {
        ResultCodeEnum[] ApiResultCodes = ResultCodeEnum.values();
        List<Integer> codeList = new ArrayList<Integer>();
        for (ResultCodeEnum ApiResultCode : ApiResultCodes) {
            if (codeList.contains(ApiResultCode.code)) {
                System.out.println(ApiResultCode.code);
            } else {
                codeList.add(ApiResultCode.code());
            }
        }
    }
}
