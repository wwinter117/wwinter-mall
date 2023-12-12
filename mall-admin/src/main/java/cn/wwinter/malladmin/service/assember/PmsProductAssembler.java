package cn.wwinter.malladmin.service.assember;

import cn.wwinter.malladmin.model.dto.*;
import cn.wwinter.malladmin.model.domain.*;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2023/12/2
 * @Author: zhangdd
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PmsProductAssembler {
    PmsProduct pmsProductDtoToEntity(PmsProductDto productDto);

    List<PmsMemberPrice> pmsMemberPriceListDtoToEntity(List<PmsMemberPriceDto> pmsMemberPriceList);

    PmsMemberPrice PmsMemberPriceDtoToEntity(PmsMemberPriceDto pmsMemberPriceDto);

    List<PmsProductAttributeValue> pmsProductAttributeValueListDtoToEntity(List<PmsProductAttributeValueDto> pmsProductAttributeValueList);

    PmsProductAttributeValue pmsProductAttributeValueDtoToEntity(PmsProductAttributeValueDto pmsProductAttributeValueDto);

    List<PmsProductFullReduction> pmsProductFullReductionListDtoToEntity(List<PmsProductFullReductionDto> pmsProductFullReductionList);

    PmsProductFullReduction pmsProductFullReductionDtoToEntity(PmsProductFullReductionDto pmsProductFullReductionDto);

    List<PmsProductLadder> pmsProductLadderListDtoToEntity(List<PmsProductLadderDto> pmsProductLadderDtoList);

    PmsProductLadder PmsProductLadderDtoToEntity(PmsProductLadderDto pmsProductLadderDto);


    List<PmsSkuStock> pmsSkuStockListDtoToEntity(List<PmsSkuStockDto> pmsSkuStockDtoList);

    PmsSkuStock pmsSkuStockDtoToEntity(PmsSkuStockDto pmsSkuStockDto);

    List<CmsSubjectProductRelation> cmsSubjectProductRelationListDtoToEntity(List<CmsSubjectProductRelationDto> cmsSubjectProductRelationDtoList);

    CmsSubjectProductRelation cmsSubjectProductRelationDtoToEntity(CmsSubjectProductRelationDto cmsSubjectProductRelationDto);

    List<CmsPreferenceAreaProductRelation> cmsPreferenceAreaProductRelationListDtoToEntity(List<CmsPreferenceAreaProductRelationDto> cmsPreferenceAreaProductRelationDtoList);

    CmsPreferenceAreaProductRelation cmsPreferenceAreaProductRelationDtoToEntity(CmsPreferenceAreaProductRelationDto cmsPreferenceAreaProductRelationDto);


}
