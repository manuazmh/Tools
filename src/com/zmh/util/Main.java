package com.zmh.util;

import com.zmh.util.tools.Randomkey;

/**
 * common tools for zmh
 * @version v0.0.1
 * @since 20171226
 */
public class Main {

    public static void main(String[] args) {

        String result = Randomkey.generate();

        System.out.println(result);

    }
}
