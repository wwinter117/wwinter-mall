package cn.wwinter.malladmin.model.dto;

import cn.wwinter.malladmin.model.common.CommonProductInfoDto;
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
public class PmsProductLadderDto extends CommonProductInfoDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1398463435886255392L;

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
