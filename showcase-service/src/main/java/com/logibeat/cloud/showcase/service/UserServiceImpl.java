package com.logibeat.cloud.showcase.service;

import com.logibeat.cloud.common.constant.DateTimePattern;
import com.logibeat.cloud.common.model.DateRange;
import com.logibeat.cloud.common.utils.DateTimeUtil;
import com.logibeat.cloud.showcase.criteria.UserCriteria;
import com.logibeat.cloud.showcase.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Object test() {
        Date start = DateTimeUtil.parse("2017-01-01", DateTimePattern.COMMON_DATE);
        Date end = DateTimeUtil.parse("2018-01-01", DateTimePattern.COMMON_DATE);
        UserCriteria criteria = new UserCriteria();
        DateRange range = DateRange.closedOpen(start, end);
        criteria.setUpdateRange(range);
        criteria.setOrderBy("login_id desc");
        criteria.setLoginId("ADMIN");
        return userDao.paging(1, 10, criteria);
    }
}
