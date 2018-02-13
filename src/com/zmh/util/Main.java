package com.zmh.util;

import com.zmh.util.tools.RandomNumber;

/**
 * common tools
 *
 * @author zengminghua
 * @version v1.0.0
 * @date 20180213
 * @since 20171226
 */
public class Main {

    /**
     * the value of for(xxx){} counts
     */
    private static final int CIRCLE_COUNT = 1;

    public static void main(String[] args) {

        for (int i = 0; i < CIRCLE_COUNT; i++) {

            String result = RandomNumber.generateLong();

            System.out.println(result);
        }

    }
}


