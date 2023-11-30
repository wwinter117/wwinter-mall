package cnn.wwinter.malladmin.util;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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

}
