package cn.wwinter.malladmin.exception;

import java.io.Serial;

/**
 * @Description:
 * @Date: 2023/12/10
 * @Author: zhangdd
 */
public class DataBaseException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -7453263042841600063L;

    public DataBaseException(String message) {
        super(message);
    }

    public DataBaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataBaseException(Throwable cause) {
        super(cause);
    }
}
