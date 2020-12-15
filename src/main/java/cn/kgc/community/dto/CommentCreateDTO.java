package cn.kgc.community.dto;

import lombok.Data;

/**
 * create by 王甲廷 on 2020/9/24 10:44
 */
@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
    private Long commentator;
}
