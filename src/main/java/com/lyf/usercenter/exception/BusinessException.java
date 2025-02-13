package com.lyf.usercenter.exception;

import com.lyf.usercenter.common.ErrorCode;
import lombok.Data;

import java.awt.print.PrinterJob;

/**
 * ClassName:BusinessException
 * Package: com.lyf.usercenter.exception
 * Description:
 *  自定义异常类
 * @Author 黎云锋
 * @Create 2025/1/18 16:11
 */
public class BusinessException extends RuntimeException{
    /**
     * 异常码
     */
    private final int code;

    /**
     * 描述
     */
    private final String description;
    public BusinessException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }
    public BusinessException(ErrorCode errorCode){
        super(errorCode.getMessage());
        this.code=errorCode.getCode();
        this.description=errorCode.getDescription();
    }
    public BusinessException(ErrorCode errorCode,String description){
        super(errorCode.getMessage());
        this.code=errorCode.getCode();
        this.description=description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
