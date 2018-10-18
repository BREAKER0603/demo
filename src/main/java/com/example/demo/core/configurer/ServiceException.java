package com.example.demo.core.configurer;

import java.io.Serializable;

/**
 * @Author:SHIGS
 * @Description 业务类异常
 * @Date Created in 16:38 2018/6/7
 * @modified By
 */
public class ServiceException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1213855733833039552L;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
