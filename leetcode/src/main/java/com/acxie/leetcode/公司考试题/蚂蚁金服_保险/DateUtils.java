package com.acxie.leetcode.公司考试题.蚂蚁金服_保险;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @description: 日期工具类
 * @create: 2021/02/05 21:12
 */
public class DateUtils extends org.apache.commons.lang3.time.DateUtils {

    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final Integer ONE_DAY = 24 * 60 * 60 * 1000;

    private static ThreadLocal<DateFormat> threadLocal = ThreadLocal.withInitial(() -> new SimpleDateFormat(DATE_FORMAT));

    /**
     * @description: 自定义日期格式 String -> Date
     * 使用threadLocal解决SimpleDateFormat线程不安全的问题
     */
    public static Date parse(String dateStr) throws Exception {
        try {
            return threadLocal.get().parse(dateStr);
        } catch (ParseException e) {
            throw new Exception("date parse error. date[" + dateStr + "]" + ",fmt[" + DATE_FORMAT + "]");
        }
    }

    /**
     * @description: String -> Date
     * 通过继承直接使用 org.apache.commons.lang3.StringUtils
     */
    public static Date parse1(String dateStr) throws Exception {
        try {
            return parseDate(dateStr, new String[]{DATE_FORMAT});
        } catch (ParseException e) {
            throw new Exception("date parse error. date[" + dateStr + "]" + ",fmt[" + DATE_FORMAT + "]");
        }
    }

    /**
     * @description: 计算两个日期相差的天数: 非自然日
     * 使用LocalDateTime
     */
    public static int diffDays(Date stratDate, Date endDate) {
        return (int) ((stratDate.getTime() - endDate.getTime()) / ONE_DAY);
    }

    /**
     * @description: 计算两个日期相差的天数: 自然日
     * 使用LocalDateTime 和 Period 进行比较
     */
    public static int diffDays1(Date stratDate, Date endDate) {
        LocalDate stratLocalDate = stratDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate endLocalDate = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return Period.between(stratLocalDate, endLocalDate).getDays();
    }

    public static void main(String[] args) throws Exception {
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_FORMAT));
        String hoursLater = LocalDateTime.now().plusHours(6).format(DateTimeFormatter.ofPattern(DATE_FORMAT));
        Date hoursLaterDate = DateUtils.parse(hoursLater);

        Date date = DateUtils.parse(now);
        System.out.println(date);

        Date date1 = DateUtils.parse1(now);
        System.out.println(date1);

        // 测试实际时间
        int diffDays = DateUtils.diffDays(date, hoursLaterDate);
        System.out.println(diffDays);

        // 测试自然日
        int diffDays1 = DateUtils.diffDays1(date, hoursLaterDate);
        System.out.println(diffDays1);
    }

}