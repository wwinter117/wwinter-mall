package cn.wwinter.common;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Description: 关联商品公共信息
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
@Data
public class CommonProductInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = 3164235363580939849L;
    /**
     * 主键id
     */
    private Long id;

    /**
     * 所属商品id
     */
    private Long productId;

}
