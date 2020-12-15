package cn.kgc.community.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * create by 王甲廷 on 2020/9/15 16:33
 */
@Data
@AllArgsConstructor
public class GithubUser {
    private String name;
    private Long id;
    private String bio;

    private String avatarUrl;
}
