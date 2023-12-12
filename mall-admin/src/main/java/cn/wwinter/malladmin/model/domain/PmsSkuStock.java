package cn.wwinter.malladmin.model.domain;

import cn.wwinter.malladmin.model.common.CommonProductInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description: 商品的sku库存信息
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PmsSkuStock extends CommonProductInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = 3590155203587059700L;
    /**
     * sku编码
     */
    private String skuCode;

    private BigDecimal price;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 预警库存
     */
    private Integer lowStock;

    /**
     * 销售属性1
     */
    private String sp1;

    private String sp2;

    private String sp3;

    /**
     * 展示图片
     */
    private String pic;

    /**
     * 销量
     */
    private Integer sale;
}
