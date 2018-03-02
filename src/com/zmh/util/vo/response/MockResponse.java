package com.zmh.util.vo.response;

import java.util.Date;

/**
 * mock response class
 *
 * @author ZengMinghua
 * @Date 2018-03-02 16:48
 */
public class MockResponse extends BaseResponse {

    private static final long serialVersionUID = -6715188312659161105L;

    private String stringValue;

    private Date dateValue;

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Date getDateValue() {
        return dateValue;
    }

    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }
}
