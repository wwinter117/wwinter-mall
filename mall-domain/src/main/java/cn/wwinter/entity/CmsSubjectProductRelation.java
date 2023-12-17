package cn.wwinter.entity;

import cn.wwinter.common.CommonProductInfo;
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
public class CmsSubjectProductRelation extends CommonProductInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = -5279550288706390110L;

    private Long subjectId;
}
