package cn.wwinter.malladmin.model.entity.product;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Description:
 * @Date: 2023/12/3
 * @Author: zhangdd
 */
@Data
public class PmsProductAttributeCategory implements Serializable {
    @Serial
    private static final long serialVersionUID = -6037550509231602710L;
    private Long id;

    private String name;

    /**
     * 属性数量
     */
    private Integer attributeCount;

    /**
     * 参数数量
     */
    private Integer paramCount;}
