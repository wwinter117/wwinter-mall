package cn.wwinter.malladmin.service.impl;/**
 * ClassName: ProductServiceImpl
 * Package: cn.wwinter.malladmin.service.impl
 * Description:
 * Datetime: 2023/12/2
 * Author: zhangdd
 */

import cn.wwinter.malladmin.dao.PmsMemberPriceDao;
import cn.wwinter.malladmin.model.dto.PmsProductDto;
import cn.wwinter.malladmin.service.ProductService;
import cn.wwinter.mapper.PmsMemberPriceMapper;
import cn.wwinter.mapper.PmsProductMapper;
import cn.wwinter.mapper.UmsMemberMapper;
import cn.wwinter.model.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Description:
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final PmsProductMapper productMapper;
    private final PmsMemberPriceDao memberPriceDao;

    @Override
    public int create(PmsProductDto pmsProductDto) {
        int count;
        PmsProduct product = pmsProductDto.getProduct();
        product.setId(null);
        productMapper.insert(product);

        Integer promotionType = product.getPromotionType();
        Long productId = product.getId();
        if (promotionType == 2) {
            List<PmsMemberPrice> memberPriceList = pmsProductDto.getPmsMemberPriceList();
            if (!CollectionUtils.isEmpty(memberPriceList)) {
                memberPriceList.forEach(s -> {
                    s.setId(null);
                    s.setProductId(productId);
                });
                memberPriceDao.insertList(memberPriceList);
            }
        } else if (promotionType == 3) {
            List<PmsProductLadder> productLadderList = pmsProductDto.getProductLadderList();
            if (!CollectionUtils.isEmpty(productLadderList)) {
                productLadderList.forEach(s -> {
                    s.setId(null);
                    s.setProductId(productId);
                });
            }
        } else if (promotionType == 4) {
            List<PmsProductFullReduction> productFullReductionList = pmsProductDto.getPmsProductFullReductionList();
            if (!CollectionUtils.isEmpty(productFullReductionList)) {
                productFullReductionList.forEach(s->{
                    s.setId(null);
                    s.setProductId(productId);
                });
            }
        }
        //添加sku库存信息
        //添加商品参数
        //添加自定义商品规格
        //关联专题
        //关联优选
        count=1;
        return count;
    }
}
