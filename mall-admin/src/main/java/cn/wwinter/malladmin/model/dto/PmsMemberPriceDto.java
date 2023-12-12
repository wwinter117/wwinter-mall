package cn.wwinter.malladmin.model.dto;

import cn.wwinter.malladmin.model.common.CommonProductInfoDto;
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
public class PmsMemberPriceDto extends CommonProductInfoDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 3194005795801806878L;

    private Long memberLevelId;
    /**
     * 会员价格
     */
    private BigDecimal memberPrice;
}
