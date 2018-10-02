package com.azure.c.azure.po;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Data
@DynamicUpdate
@Entity
public class UserInfo {

    /**
     * @DynamicUpdate
     * 动态sql 自动更新时间,前提是这行记录有值发生了改变
     */

    @Id
    private String id;

    private String userName;

    private String account;

    private String password;

    private String picture;

    private String email;

    private String phone;

    private Integer gender;

    private Date createTime;

    private Date updateTime;





}
