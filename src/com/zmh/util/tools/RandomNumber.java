package com.zmh.util.tools;

import org.apache.commons.lang.math.RandomUtils;
/**
 * Random Number tool
 *
 * @Author ZengMinghua
 * @Date 2017-12-29 11:10
 */
public class RandomNumber {

    public static String generate(){

        long randomNu = RandomUtils.nextLong();

        return String.valueOf(randomNu);
    }
}
