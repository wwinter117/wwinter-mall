package cn.wwinter.malladmin.model.dto.product;

import cn.wwinter.malladmin.model.dto.product.common.CommonProductInfoDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description: 商品满减价格
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PmsProductFullReductionDto extends CommonProductInfoDto implements Serializable {
    @Serial
    private static final long serialVersionUID = -5708045427606833801L;

    private BigDecimal fullPrice;

    private BigDecimal reducePrice;

}
