package cn.wwinter.malladmin.model.common;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Description:
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
@Data
public class CommonProductInfoDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 691241648175674333L;

    private Long productId;
}
