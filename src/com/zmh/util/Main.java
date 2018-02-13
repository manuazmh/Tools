package com.zmh.util;

import com.zmh.util.tools.RandomNumber;

/**
 * common tools for zmh
 *
 * @version v0.0.1
 * @since 20171226
 */
public class Main {

    /**
     * the value of for(xxx){} counts
     */
    private static final int CIRCLE_COUNT = 1;

    public static void main(String[] args) {

        for (int i = 0; i < CIRCLE_COUNT; i++) {
            // String result = Randomkey.generate();

            String result = RandomNumber.generate();
            // String result = SerialUtils.generateTraceNo(24);

            // System.out.println(result);
        }

    }
}


