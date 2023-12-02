package cn.wwinter.malladmin.model.common;

import com.github.pagehelper.PageInfo;
import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;

import java.util.List;
import java.util.Objects;

/**
 * @Description: 通用返回类
 * @Author: zhangdd
 * @Date: 2023/12/2
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommonResponse<T> {
    private int code;
    private String message;
    private T data;

    /**
     * 成功
     */
    public static <T> CommonResponse<T> success(T data) {
        return new CommonResponse<>(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), data);
    }

    /**
     * 成功，返回分页数据
     */
    public static <T> CommonResponse<PageResult<T>> pageSuccess(List<T> data) {
        return new CommonResponse<>(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), new PageResult<T>(data));
    }

    /**
     * 失败
     */
    public static <T> CommonResponse<T> failed(String message) {
        return new CommonResponse<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase() + ": " + message, null);
    }

    /**
     * 参数校验失败
     */
    public static <T> CommonResponse<T> validateFailed(@Nonnull BindingResult bindingResult) {
        return new CommonResponse<>(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase() + ": " + Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage(), null);
    }

    /**
     * 认证失败
     */
    public static <T> CommonResponse<T> authFailed() {
        return new CommonResponse<>(HttpStatus.UNAUTHORIZED.value(), HttpStatus.UNAUTHORIZED.getReasonPhrase() + ": 用户名或密码错误", null);
    }

//    public static <T> ResponseEntity<T> authFailed(T responseBody) {
//        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(responseBody);
//    }

//    public static <T> ResponseEntity<T> success(T responseBody) {
//        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
//    }


    /**
     * 分页数据结构
     */
    @Data
    public static class PageResult<T> {
        int pageSize;
        int totalPage;
        int pageNum;
        List<T> list;

        public PageResult() {
        }

        public PageResult(int pageSize, int totalPage, int pageNum, List<T> list) {
            this.pageSize = pageSize;
            this.totalPage = totalPage;
            this.pageNum = pageNum;
            this.list = list;
        }

        public PageResult(List<T> data) {
            PageInfo<T> pageInfo = new PageInfo<>(data);
            this.pageSize = pageInfo.getPageSize();
            this.totalPage = pageInfo.getPages();
            this.pageNum = pageInfo.getPageNum();
            this.list = data;
        }
    }

}
