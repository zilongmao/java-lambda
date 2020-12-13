package com.idol;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2020/12/14 02:26
 */
public class LocalDateTest {
    public static void main(String[] args) {
//        temporalAdjustersTest();
//        localDateTest();
        zoneDateTimeTest();
    }

    public static void zoneDateTimeTest() {
        // 获取当前时间日期
        ZonedDateTime date1 = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
        System.out.println("date1: " + date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("当期时区: " + currentZone);
    }

    public static void localDateTest() {
        // 获取当前的日期时间
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("当前时间: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("月: " + month +", 日: " + day +", 秒: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

        // 12 december 2014
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3: " + date3);

        // 22 小时 15 分钟
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);

        // 解析字符串
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);
    }

    public static void temporalAdjustersTest() {
        LocalDate date = LocalDate.parse("2020-12-12");
        // 获取这个月的第一个周末的时间
        System.out.println(date.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.SUNDAY))); // 2020-12-06
        // 获取上个月的最后一周
        System.out.println(date.with(TemporalAdjusters.dayOfWeekInMonth(0, DayOfWeek.SUNDAY))); // 2020-11-29
        // 获取这个月的倒数第一个周末的时间
        System.out.println(date.with(TemporalAdjusters.dayOfWeekInMonth(-1, DayOfWeek.SUNDAY))); // 2020-12-27

        // 获取这个月的第一个周末的时间,上面的dayOfWeekInMonth更灵活,可以定义第几周
        System.out.println(date.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY))); // 2020-12-06

        // 其底层调用的是
//		  return TemporalAdjusters.dayOfWeekInMonth(1, dayOfWeek);

        // 明年的第一天
        System.out.println(date.with(TemporalAdjusters.firstDayOfNextYear())); // 2021-01-01
        // 获取下周5的时间
        System.out.println(date.with(TemporalAdjusters.next(DayOfWeek.FRIDAY))); // 2020-12-18
        System.out.println(date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY))); // 2020-12-15,始终返回下周的某个时间
        // 获取周一时间
        System.out.println(date.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY))); // 2020-12-14,如果当前时间刚好是星期一,那么就返回当前时间

        // 获取本月最后一天
        System.out.println(date.with(TemporalAdjusters.lastDayOfMonth())); // 2020-12-31
    }
}
