package com.logibeat.cloud.showcase.criteria;

import com.logibeat.cloud.common.model.DateRange;
import com.logibeat.cloud.common.model.EntityCriteria;
import com.logibeat.cloud.showcase.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class UserCriteria extends EntityCriteria {
    private static final long serialVersionUID = -3692572090365651179L;

    private String loginId;
    private User.Type type;
    private Date birthday;
    private String name;
    private String email;
    private String mobile;

    private DateRange birthdayRange;
}
