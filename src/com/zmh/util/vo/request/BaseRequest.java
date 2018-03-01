package com.zmh.util.vo.request;

import java.io.Serializable;

/**
 * Base Request
 *
 * @author zengminghua
 * @date 20171227
 */
public class BaseRequest implements Serializable {

    private static final long serialVersionUID = 8608984702069486233L;

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
