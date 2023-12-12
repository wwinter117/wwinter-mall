package cn.wwinter.malladmin.service.impl;

import cn.wwinter.malladmin.service.action.sqlAction.product.PmsProductAttributeCategorySqlAction;
import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.domain.PmsProductAttributeCategory;
import cn.wwinter.malladmin.service.ProductAttributeCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: ProductAttributeCategoryServiceImpl
 * Package: cnn.wwinter.malladmin.service.impl
 * Description:
 * Datetime: 2023/11/29
 * Author: zhangdd
 */
@Service
@AllArgsConstructor
public class ProductAttributeCategoryServiceImpl implements ProductAttributeCategoryService {
    private final PmsProductAttributeCategorySqlAction pmsProductAttributeCategorySqlAction;

    @Override
    public CommonResponse create(String name) {
        PmsProductAttributeCategory productAttributeCategory = new PmsProductAttributeCategory();
        productAttributeCategory.setName(name);
        pmsProductAttributeCategorySqlAction.insertIterm(productAttributeCategory);
        return CommonResponse.success(productAttributeCategory);
    }

    @Override
    public CommonResponse getList(Integer pageNum, Integer pageSize) {
        List<PmsProductAttributeCategory> pmsProductAttributeCategoryList = pmsProductAttributeCategorySqlAction.getList();
        return CommonResponse.success(pmsProductAttributeCategoryList);
    }

}
