package cn.wwinter.malladmin.model.domain;

import cn.wwinter.malladmin.model.common.CommonProductInfo;
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
public class CmsPreferenceAreaProductRelation extends CommonProductInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = -549851836607101088L;
    private Long preferenceAreaId;
}
