package cn.wwinter.malladmin.model.dto;

import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;


/**
 * 创建和修改商品时使用的参数
 */
@Data
public class PmsProductCombinationDto {
    @ApiModelProperty("商品信息")
    @NotNull(message = "商品信息不能为空")
    private PmsProductDto product;

    @ApiModelProperty("商品会员价格设置")
    private List<PmsMemberPriceDto> pmsMemberPriceList;

    @ApiModelProperty("商品参数及自定义规格属性")
    private List<PmsProductAttributeValueDto> pmsProductAttributeValueList;

    @ApiModelProperty("商品满减价格设置")
    private List<PmsProductFullReductionDto> pmsProductFullReductionList;

    @ApiModelProperty("商品阶梯价格设置")
    private List<PmsProductLadderDto> productLadderList;

    @ApiModelProperty("商品的sku库存信息")
    private List<PmsSkuStockDto> skuStockList;

    @ApiModelProperty("专题和商品关系")
    private List<CmsSubjectProductRelationDto> subjectProductRelationList;

    @ApiModelProperty("优选专区和商品的关系")
    private List<CmsPreferenceAreaProductRelationDto> prefrenceAreaProductRelationList;

}
