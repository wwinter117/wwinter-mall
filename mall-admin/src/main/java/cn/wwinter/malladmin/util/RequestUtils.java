package cn.wwinter.malladmin.util;

import jakarta.servlet.http.HttpServletRequest;

/**
 * ClassName: RequestUtils
 * Package: cnn.wwinter.malladmin.util
 * Description:
 * Datetime: 2023/11/30
 * Author: zhangdd
 */
public class RequestUtils {

    /**
     * 获取请求的basePath
     */
    public static String getBasePath(HttpServletRequest request) {
        StringBuilder basePath = new StringBuilder();
        String scheme = request.getScheme();
        String serverName = request.getServerName();
        int port = request.getServerPort();
        basePath.append(scheme).append(':').append("//").append(serverName);
        if ("http".equals(scheme) && port != 80) {
            basePath.append(':').append(port);
        } else if ("https".equals(scheme) && port != 403) {
            basePath.append(':').append(port);
        }
        return basePath.toString();
    }

    public static String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (request.getRemoteAddr() != null) {
            ip = request.getRemoteAddr();
        }
        if (ip == null || ip.isEmpty() || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.isEmpty() || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.isEmpty() || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.isEmpty() || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        return ip;
    }

}
