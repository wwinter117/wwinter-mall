package cnn.wwinter.malladmin.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * ClassName: JsonUtils
 * Package: cnn.wwinter.malladmin.util
 * Description:
 * Datetime: 2023/11/29
 * Author: zhangdd
 */
public class JsonUtils {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static String objectToJson(Object data) {
        String json = null;
        try {
            json = OBJECT_MAPPER.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return json;
    }

    public static <T> T jsonToPoJo(String json, Class<T> type) {
        T t = null;
        try {
            t = OBJECT_MAPPER.readValue(json, type);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return t;
    }


}
