package cn.kgc.community.dto;

import cn.kgc.community.model.User;
import lombok.Data;

/**
 * create by 王甲廷 on 2020/9/17 14:23
 */
@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;

    private User user;
}
