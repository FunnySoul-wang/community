package cn.kgc.community.exception;

/**
 * create by 王甲廷 on 2020/9/23 14:26
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode{

    QUESTION_NOT_FOUND(2001,"你找的问题不存在了，是不是换一个试试呢？"),
    TARGET_PARAM_NOT_FOUND(2002, "未选中任何问题或评论进行回复！"),
    NO_LOGIN(2003, "当前操作需要登录，请登陆后重试！"),
    SYS_ERROR(2004, "服务器冒烟了，要不然你稍后再试一试！！！"),
    TYPE_PARAM_WRONG(2005, "评论类型错误或者不存在"),
    COMMENT_NOT_FOUND(2006,"回复的评论不存在是否换一个试一试！！！"),
    COMMENT_IS_EMPTY(2007, "输入的内容不能为空"),
    ;


    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode(){
        return code;
    }

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message){
        this.message = message;
        this.code = code;
    }
}
