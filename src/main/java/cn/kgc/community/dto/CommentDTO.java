package cn.kgc.community.dto;

import cn.kgc.community.model.User;
import lombok.Data;

/**
 * create by 王甲廷 on 2020/9/25 9:30
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private String content;
    private User user;
}
