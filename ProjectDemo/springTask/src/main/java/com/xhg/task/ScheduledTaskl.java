package com.xhg.task;

import org.apache.commons.lang.StringUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by xhg
 */

@Component
public class ScheduledTaskl {
    private static final SimpleDateFormat dateformart = new SimpleDateFormat("HH:mm:ss");

    @Async
    @Scheduled(fixedDelayString = "${jobs.fixedDelay}")
    //@Scheduled(cron = "5/* * * * * ?")
    public void task1() {
        System.out.println("任务1:" + dateformart.format(new Date()));
    }

    @Async
    @Scheduled(cron = "5/* * * * * ?")
    public void task2() {
        System.out.println("任务2:" + dateformart.format(new Date()));
    }


    public static void main(String[] args) {

        /**
         * 输入 This is a dog , 输出 sihT si a god   不使用库函数
         */
        String str = "This is a dog";
        //new ScheduledTaskl().getstr2(str);
        int[] arr = {2, 67, 43, 44, 12, 9};
        new ScheduledTaskl().sort(arr);

    }

    /**
     * 冒泡算法
     */
    void sort(int[] list) {
        if (null == list && list.length <= 0) {
            return;
        }
        int temp = 0;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = temp;
                }
            }
        }
        for (int i : list) {
            System.out.print(i + "  ");
        }
    }


    public void getstr2(String str) {

        if (StringUtils.isEmpty(str)) {
            return;
        }

        String[] s = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= s.length - 1; i++) {
            char[] chars = s[i].toCharArray();
            for (int j = chars.length - 1; j >= 0; j--) {
                sb.append(chars[j] + "");
            }
            sb.append(" ");
        }
        System.out.println(sb.toString());

    }


    public void getstr(String str) {
        int strLength = str.length();//字符长度
        int wordLength = 0;//每个单词的长度
        int stStrIndex = 0;//结果字符集下标
        char[] strs = str.toCharArray();
        char[] rtStr = new char[strLength];
        for (int i = 0; i < strLength; i++) {
            if (strs[i] == ' ') {
                for (int j = 0; j < wordLength; j++) {
                    rtStr[stStrIndex] = strs[i - j - 1];
                    stStrIndex++;
                }
                rtStr[i] = ' ';
                stStrIndex++;
                wordLength = 0;
            } else if (i == strLength - 1) {
                for (int j = 0; j < wordLength + 1; j++) {
                    rtStr[stStrIndex] = strs[i - j];
                    stStrIndex++;
                }
            } else {
                wordLength++;
            }
        }
        StringBuffer sb = new StringBuffer();
        for (char s : rtStr) {
            sb.append(Character.toString(s));
        }
        System.out.println(sb);


    }


    public String getStr(String input) {
        if (StringUtils.isEmpty(input)) {
            return null;
        }
        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            list.add(chars[i]);
            if (chars[i] == ' ') {
                ArrayList<Object> list1 = new ArrayList<>();
                continue;
            }
        }

        return null;

    }

}
