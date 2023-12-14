package cn.wwinter.malladmin.component;

import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.util.JsonUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Description: 验证失败返回
 * @Date: 2023/12/13
 * @Author: zhangdd
 */
@Component
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        String authFailedResp = JsonUtils.objectToJson(CommonResponse.authFailed(authException.getMessage()));

        // 设置响应的内容类型和字符编码
        response.setContentType("application/json;charset=UTF-8");
        // 设置HTTP状态码和响应内容
        response.setStatus(HttpStatus.OK.value());
        response.getWriter().write(authFailedResp);
    }
}
