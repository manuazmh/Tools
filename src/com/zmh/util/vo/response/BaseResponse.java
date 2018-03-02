package com.zmh.util.vo.response;

import java.io.Serializable;

/**
 * Base Response
 *
 * @author zengminghua
 * @date 2018-02-13 11:51
 */
public class BaseResponse implements Serializable{

    private static final long serialVersionUID = 4857680785804970391L;

    /**
     * requestId
     */
    private Long requestId;

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }
}
