package cn.wwinter.malladmin.model.dto.product;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description: 商品信息
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
@Data
public class PmsProductDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 47380792438649046L;

    /**
     * 所属品牌id
     */
    private Long brandId;
    /**
     * 所属商品类别id
     */
    private Long productCategoryId;
    /**
     * 所属记重模板id
     */
    private Long weightTemplateId;
    /**
     * 所属商品属性类别id
     */
    private Long productAttributeCategoryId;

    /**
     * 限时购id
     */
    private Integer flashPromotionId;

    private String name;

    private String pic;

    /**
     * 货号
     */
    private String productSn;

    /**
     * 删除状态：0->未删除；1->已删除
     */
    private Integer deleteStatus;

    /**
     * 上架状态：0->下架；1->上架
     */
    private Integer publishStatus;

    /**
     * 新品状态:0->不是新品；1->新品
     */
    private Integer newStatus;

    /**
     * 推荐状态；0->不推荐；1->推荐
     */
    private Integer recommendStatus;

    /**
     * 审核状态：0->未审核；1->审核通过
     */
    private Integer verifyStatus;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 销量
     */
    private Integer sale;

    private BigDecimal price;

    /**
     * 促销价格
     */
    private BigDecimal promotionPrice;

    /**
     * 赠送的积分
     */
    private Integer giftPoint;

    /**
     * 限制使用的积分数
     */
    private Integer usePointLimit;

    /**
     * 副标题
     */
    private String subTitle;

    /**
     * 市场价
     */
    private BigDecimal originalPrice;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 库存预警值
     */
    private Integer lowStock;

    /**
     * 单位
     */
    private String unit;

    /**
     * 商品重量，默认为克
     */
    private BigDecimal weight;

    /**
     * 是否为预告商品：0->不是；1->是
     */
    private Integer previewStatus;

    /**
     * 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     */
    private String serviceIds;

    private String keywords;

    private String note;

    /**
     * 画册图片，连产品图片限制为5张，以逗号分割
     */
    private String albumPics;

    private String detailTitle;

    /**
     * 限时购价格
     */
    private BigDecimal flashPromotionPrice;

    /**
     * 限时购数量
     */
    private Integer flashPromotionCount;

    /**
     * 限时购排序
     */
    private Integer flashPromotionSort;

    /**
     * 促销开始时间
     */
    private Date promotionStartTime;

    /**
     * 促销结束时间
     */
    private Date promotionEndTime;

    /**
     * 活动限购数量
     */
    private Integer promotionPerLimit;

    /**
     * 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格
     */
    private Integer promotionType;

    /**
     * 商品描述
     */
    private String description;

    private String detailDesc;

    /**
     * 产品详情网页内容
     */
    private String detailHtml;

    /**
     * 移动端网页详情
     */
    private String detailMobileHtml;
}