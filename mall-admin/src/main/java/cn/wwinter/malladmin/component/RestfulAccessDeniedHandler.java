package cn.wwinter.malladmin.component;

import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.util.JsonUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Description: 没有权限时返回
 * @Date: 2023/12/13
 * @Author: zhangdd
 */
@Component
public class RestfulAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        String forbiddenResp = JsonUtils.objectToJson(CommonResponse.forbidden(accessDeniedException.getMessage()));

        // 设置响应的内容类型和字符编码
        response.setContentType("application/json;charset=UTF-8");
        // 设置HTTP状态码和响应内容
        response.setStatus(HttpStatus.OK.value());
        response.getWriter().write(forbiddenResp);
    }
}
