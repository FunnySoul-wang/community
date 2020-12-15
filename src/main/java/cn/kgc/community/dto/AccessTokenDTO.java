package cn.kgc.community.dto;

import lombok.Data;

/**
 * create by 王甲廷 on 2020/9/15 15:44
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
