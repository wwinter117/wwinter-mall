package cn.wwinter.malladmin.model.dto;

import cn.wwinter.model.*;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;


/**
 * 创建和修改商品时使用的参数
 */
@Data
public class PmsProductDto {
    @ApiModelProperty("商品信息")
    @NotNull(message = "商品信息不能为空")
    private PmsProduct product;
    @ApiModelProperty("商品阶梯价格设置")
    private List<PmsProductLadder> productLadderList;
    @ApiModelProperty("商品满减价格设置")
    private List<PmsProductFullReduction> pmsProductFullReductionList;
    @ApiModelProperty("商品会员价格设置")
    private List<PmsMemberPrice> pmsMemberPriceList;
    @ApiModelProperty("商品的sku库存信息")
    private List<PmsSkuStock> skuStockList;
    @ApiModelProperty("商品参数及自定义规格属性")
    private List<PmsProductAttributeValue> pmsProductAttributeValueList;
    @ApiModelProperty("专题和商品关系")
    private List<CmsSubjectProductRelation> subjectProductRelationList;
    @ApiModelProperty("优选专区和商品的关系")
    private List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList;
}
