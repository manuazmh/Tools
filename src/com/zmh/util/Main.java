package com.zmh.util;

import com.zmh.util.tools.MockService;
import com.zmh.util.tools.RandomNumber;
import com.zmh.util.tools.RsaKey;
import com.zmh.util.vo.request.MockRequest;
import com.zmh.util.vo.response.MockResponse;

import java.util.Map;

/**
 * common tools
 *
 * @author zengminghua
 * @version v1.0.0
 * @last modified 20180301
 * @since 20171226
 */
public class Main {

    /**
     * the value of function for(xxx){} circle counts
     */
    private static final int CIRCLE_COUNT = 1;

    /**
     * invoke
     *
     * @param args
     */
    public static void main(String[] args) {

        for (int i = 0; i < CIRCLE_COUNT; i++) {

            String rnLongStr = RandomNumber.generateLong();

            String uuidStr = RandomNumber.generateUuid();

            Map<String, String> keyMap = RsaKey.generateKey("RSA", 2048);

            System.out.println("Hello World");

            MockRequest request = new MockRequest();
            request.setStringValue("Hello World");

            MockResponse response = MockService.mock(request);
            System.out.println(response.getStringValue());
            System.out.println(response.getDateValue());

        }

    }
}


