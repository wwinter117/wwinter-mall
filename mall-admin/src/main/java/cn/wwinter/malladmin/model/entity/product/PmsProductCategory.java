package cn.wwinter.malladmin.model.entity.product;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Description: 商品类别
 * @Date: 2023/12/3
 * @Author: zhangdd
 */
@Data
public class PmsProductCategory implements Serializable {
    @Serial
    private static final long serialVersionUID = 6120201802727913280L;
    private Long id;

    /**
     * 上机分类的编号：0表示一级分类
     */
    private Long parentId;

    private String name;

    /**
     * 分类级别：0->1级；1->2级
     */
    private Integer level;

    private Integer productCount;

    private String productUnit;

    /**
     * 是否显示在导航栏：0->不显示；1->显示
     */
    private Integer navStatus;

    /**
     * 显示状态：0->不显示；1->显示
     */
    private Integer showStatus;

    private Integer sort;

    /**
     * 图标
     */
    private String icon;

    private String keywords;

    /**
     * 描述
     */
    private String description;
}
