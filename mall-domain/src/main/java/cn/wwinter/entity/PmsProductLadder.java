package cn.wwinter.entity;

import cn.wwinter.common.CommonProductInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description: 商品阶梯价格
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PmsProductLadder extends CommonProductInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = 8711055570143032983L;

    /**
     * 满足的商品数量
     */
    private Integer count;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 折后价格
     */
    private BigDecimal price;
}
