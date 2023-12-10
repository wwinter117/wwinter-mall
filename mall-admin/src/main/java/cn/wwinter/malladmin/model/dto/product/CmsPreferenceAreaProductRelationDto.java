package cn.wwinter.malladmin.model.dto.product;

import cn.wwinter.malladmin.model.dto.product.common.CommonProductInfoDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Description: 优选专区和商品的关系
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CmsPreferenceAreaProductRelationDto extends CommonProductInfoDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 185971736206375820L;

    private Long preferenceAreaId;

}
