package com.acxie.learnthread.threadlocal.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description：线程不安全使用示例
 * @Author：oscar
 * @CreateTime：2021/2/5 5:34 下午
 */
public class SimpleDateFormatDemo {



}


class DateFormatUitls {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String format(int milSecond){
        Date date = new Date(milSecond * 50000);
        return sdf.format(date);
    }
}
