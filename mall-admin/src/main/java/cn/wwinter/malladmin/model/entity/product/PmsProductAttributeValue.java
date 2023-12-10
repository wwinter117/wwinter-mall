package cn.wwinter.malladmin.model.entity.product;

import cn.wwinter.malladmin.model.entity.product.common.CommonProductInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Description: 商品参数及自定义规格属性
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PmsProductAttributeValue extends CommonProductInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = 6605438233860393184L;

    private Long productAttributeId;
    /**
     * 存储的值
     */
    private String value;

}
