package com.zmh.util.tools;

import com.zmh.util.vo.request.MockRequest;
import com.zmh.util.vo.response.MockResponse;

import java.util.Date;

/**
 * xxx
 *
 * @Author ZengMinghua
 * @Date 2018-03-02 16:47
 */
public class MockService {

    public static MockResponse mock(MockRequest request){

        System.out.println("[>>>] MockService: receive mock request.");

        MockResponse response = new MockResponse();

        response.setStringValue(request.getStringValue());

        response.setDateValue(new Date());

        System.out.println("[<<<] done.");

        return response;
    }
}
