package cn.wwinter.entity;

import cn.wwinter.common.CommonProductInfo;
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
public class PmsProductFullReduction extends CommonProductInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = 8143948605411079810L;

    private BigDecimal fullPrice;

    private BigDecimal reducePrice;
}
