package cn.wwinter.malladmin.service.impl;

import cn.wwinter.malladmin.action.sqlAction.product.PmsMemberPriceSqlAction;
import cn.wwinter.malladmin.action.sqlAction.product.PmsProductSqlAction;
import cn.wwinter.malladmin.action.sqlAction.common.CommonSqlAction;
import cn.wwinter.malladmin.action.sqlAction.product.*;
import cn.wwinter.malladmin.assember.PmsProductAssembler;
import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.dto.product.*;
import cn.wwinter.malladmin.model.entity.product.*;
import cn.wwinter.malladmin.model.entity.product.common.CommonProductInfo;
import cn.wwinter.malladmin.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.function.Function;

/**
 * @Description:
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
@Service
@AllArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    /**
     * 商品bean转换
     */
    private final PmsProductAssembler productMapper;
    /**
     * productSqlAction
     */
    private final PmsProductSqlAction productSqlAction;
    /**
     * 会员价格
     */
    private final PmsMemberPriceSqlAction pmsMemberPriceSqlAction;
    /**
     * 添加商品参数
     */
    private final PmsProductAttributeValueSqlAction pmsProductAttributeValueSqlAction;
    /**
     * 满减价格
     */
    private final PmsProductFullReductionSqlAction pmsProductFullReductionSqlAction;
    /**
     * 商品阶梯价格设置
     */
    private final PmsProductLadderSqlAction pmsProductLadderSqlAction;
    /**
     * 添加sku库存信息
     */
    private final PmsSkuStockSqlAction pmsSkuStockSqlAction;
    /**
     * 添加商品参数
     */
    private final CmsSubjectProductRelationSqlAction cmsSubjectProductRelationSqlAction;

    /**
     * 关联专题
     */
    private final CmsPreferenceAreaProductRelationSqlAction cmsPreferenceAreaProductRelationSqlAction;


    @Override
    public CommonResponse create(PmsProductCombinationDto pmsProductCombinationDto) {
        try {
            PmsProductDto productDto = pmsProductCombinationDto.getProduct();
            PmsProduct product = productMapper.pmsProductDtoToEntity(productDto);
            productSqlAction.insertIterm(product);

            Long productId = product.getId();
            // 插入会员价格
            List<PmsMemberPriceDto> pmsMemberPriceDtoList = pmsProductCombinationDto.getPmsMemberPriceList();
            insertList(pmsMemberPriceSqlAction, pmsMemberPriceDtoList, productMapper::pmsMemberPriceListDtoToEntity, productId);
            // 插入商品参数及自定义规格属性
            List<PmsProductAttributeValueDto> pmsProductAttributeValueDtoList = pmsProductCombinationDto.getPmsProductAttributeValueList();
            insertList(pmsProductAttributeValueSqlAction, pmsProductAttributeValueDtoList, productMapper::pmsProductAttributeValueListDtoToEntity, productId);
            // 插入商品满减价格设置
            List<PmsProductFullReductionDto> pmsProductFullReductionDtoList = pmsProductCombinationDto.getPmsProductFullReductionList();
            insertList(pmsProductFullReductionSqlAction, pmsProductFullReductionDtoList, productMapper::pmsProductFullReductionListDtoToEntity, productId);
            // 插入商品阶梯价格设置
            List<PmsProductLadderDto> pmsProductLadderDtoList = pmsProductCombinationDto.getProductLadderList();
            insertList(pmsProductLadderSqlAction, pmsProductLadderDtoList, productMapper::pmsProductLadderListDtoToEntity, productId);
            // 插入商品的sku库存信息
            List<PmsSkuStockDto> pmsSkuStockDtoList = pmsProductCombinationDto.getSkuStockList();
            insertList(pmsSkuStockSqlAction, pmsSkuStockDtoList, productMapper::pmsSkuStockListDtoToEntity, productId);
            // 插入专题和商品关系
            List<CmsSubjectProductRelationDto> cmsSubjectProductRelationDtoList = pmsProductCombinationDto.getSubjectProductRelationList();
            insertList(cmsSubjectProductRelationSqlAction, cmsSubjectProductRelationDtoList, productMapper::cmsSubjectProductRelationListDtoToEntity, productId);
            // 插入优选专区和商品的关系
            List<CmsPreferenceAreaProductRelationDto> cmsPreferenceAreaProductRelationDtoList = pmsProductCombinationDto.getPrefrenceAreaProductRelationList();
            insertList(cmsPreferenceAreaProductRelationSqlAction, cmsPreferenceAreaProductRelationDtoList, productMapper::cmsPreferenceAreaProductRelationListDtoToEntity, productId);
        } catch (Exception e) {
            log.error("商品创建失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
        return CommonResponse.success("");
    }

    /**
     * 通用插入商品相关信息列表
     *
     * @param commonSqlAction 执行数据库
     * @param daoList         需要插入的list
     * @param mapper          dao->entity
     * @param productId       所关联的商品id
     */
    private <DAO, ENTITY extends CommonProductInfo> void insertList(
            CommonSqlAction<ENTITY> commonSqlAction,
            List<DAO> daoList,
            Function<List<DAO>, List<ENTITY>> mapper,
            long productId) {
        if (!CollectionUtils.isEmpty(daoList)) {
            List<ENTITY> entityList = mapper.apply(daoList);
            entityList.forEach(s -> s.setProductId(productId));
            commonSqlAction.insertList(entityList);
        }
    }

}
