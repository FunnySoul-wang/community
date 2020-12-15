package cn.kgc.community.enums;

/**
 * create by 王甲廷 on 2020/9/24 11:14
 */
public enum CommentTypeEnum {
    QUESTION(1),
    COMMENT(2);

    private Integer type;

    public static boolean isExist(Integer type) {
        for (CommentTypeEnum commentTypeEnum : CommentTypeEnum.values()) {
            if (commentTypeEnum.getType() == type){
                return true;
            }
        }
        return false;
    }

    public Integer getType(){
        return type;
    }

    CommentTypeEnum(Integer type){
        this.type = type;
    }
}
