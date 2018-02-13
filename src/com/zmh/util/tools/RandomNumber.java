package com.zmh.util.tools;

import java.util.Random;

/**
 * Random Number tool
 *
 * @author zengminghua
 * @date 20171229
 */
public class RandomNumber {

    private static final int RANDOM_LENGTH = 19;

    /**
     * make a Long random num
     *
     * @return String 19
     */
    public static String generateLong() {

        Random random = new Random();
        long randomNu = random.nextLong();
        String randomStr = String.valueOf(Math.abs(randomNu));

        // if the randomStr's length < 19, add num.
        while (randomStr.length() < RANDOM_LENGTH) {
            randomStr += random.nextInt(10);
        }

        return randomStr;
    }
}
