package com.zmh.util.tools;

import com.zmh.util.vo.response.BaseResponse;

import java.util.Random;
import java.util.UUID;

/**
 * Random Number tool
 *
 * @author zengminghua
 * @date 20171229
 */
public class RandomNumber extends BaseResponse {

    private static final int RANDOM_LENGTH = 19;

    /**
     * make a Long random num
     *
     * @return String 19
     */
    public static String generateLong() {

        Random random = new Random();
        long randomNu = random.nextLong();
        StringBuilder randomStr = new StringBuilder(String.valueOf(Math.abs(randomNu)));

        // if the randomStr's length < 19, add num.
        while (randomStr.length() < RANDOM_LENGTH) {
            randomStr.append(random.nextInt(10));
        }

        System.out.println(randomStr);
        return randomStr.toString();
    }

    /**
     * make a UUID
     *
     * @return String 36
     */
    public static String generateUuid() {

        UUID uuid = UUID.randomUUID();

        System.out.println(uuid.toString());

        return uuid.toString();
    }

}
