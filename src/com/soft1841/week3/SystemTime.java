package com.soft1841.week3;

import javax.xml.crypto.Data;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 和系统同步的时间，到秒的级别
 *
 * @author ytker
 */
public class SystemTime {
    public static void main(String[] args) throws InterruptedException {
//如何通过time的api指定一个未来的时间
        LocalDateTime endTime = LocalDateTime.of(2018,10,25,8,49,10);
        while (true) {
            //如何使用jdk8的api,获取当前系统时间,去掉毫秒
            LocalDateTime currentTime = LocalDateTime.now().withNano(0);
            System.out.println(currentTime);
            Thread.sleep(1*60*60*1000);
            if (currentTime.isAfter(endTime)) {
                break;
            }
        }
        System.out.println("时间到");
    }
}