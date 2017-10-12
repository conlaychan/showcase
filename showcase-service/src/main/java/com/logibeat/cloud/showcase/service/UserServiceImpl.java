package com.logibeat.cloud.showcase.service;

import com.logibeat.cloud.common.model.DateRange;
import com.logibeat.cloud.common.utils.DateTimes;
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
        Date start = DateTimes.COMMON_DATE.parse("2017-01-01");
        Date end = DateTimes.COMMON_DATE.parse("2018-01-01");
        UserCriteria criteria = new UserCriteria();
        DateRange range = DateRange.closedOpen(start, end);
        criteria.setUpdateRange(range);
        criteria.setOrderBy("login_id desc");
        criteria.setLoginId("ADMIN");
        return userDao.paging(1, 10, criteria);
    }
}
