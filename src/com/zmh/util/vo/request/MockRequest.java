package com.zmh.util.vo.request;

/**
 * mock request class
 *
 * @Author ZengMinghua
 * @Date 2018-03-02 16:53
 */
public class MockRequest extends BaseRequest {
    private static final long serialVersionUID = -6715188312659161105L;

    private String stringValue;

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
}
