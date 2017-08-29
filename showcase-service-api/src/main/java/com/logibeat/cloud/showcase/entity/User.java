package com.logibeat.cloud.showcase.entity;

import com.logibeat.cloud.common.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {
    private static final long serialVersionUID = -7714718843231336708L;

    private String loginId;
    private String password;
    private Type type;
    private Date birthday;
    private String name;
    private String email;
    private String mobile;

    public enum Type {
        ADMIN, SELLER, BUYER
    }
}
