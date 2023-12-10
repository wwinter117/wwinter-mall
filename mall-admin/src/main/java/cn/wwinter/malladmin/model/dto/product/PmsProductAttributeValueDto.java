package cn.wwinter.malladmin.model.dto.product;

import cn.wwinter.malladmin.model.dto.product.common.CommonProductInfoDto;
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
public class PmsProductAttributeValueDto extends CommonProductInfoDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 3867840882800320153L;

    private Long productAttributeId;

    private String value;

}
