package cn.wwinter.malladmin.model.dto.product;

import cn.wwinter.malladmin.model.dto.product.common.CommonProductInfoDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Description: 专题和商品关系
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CmsSubjectProductRelationDto extends CommonProductInfoDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 54034630995118554L;
    private Long subjectId;
}
