package com.triumphxx.util;

import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

/**
 * @author:triumphxx
 * @Date:2020/5/16
 * @Time:2:24 下午
 * @微信公众号：北漂码农有话说
 * @desc:时间获取转换类
 **/
@Component
public class DateUtil {

      //获取当天的0点时间的毫秒数
      public  Long initDateByDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime().getTime();
    }

}
