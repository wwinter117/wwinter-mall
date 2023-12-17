package cn.wwinter.entity;

import cn.wwinter.common.CommonProductInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description: 商品会员价格
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PmsMemberPrice extends CommonProductInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = -5496349691679880549L;

    private Long memberLevelId;
    /**
     * 会员价格
     */
    private BigDecimal memberPrice;

    private String memberLevelName;
}
