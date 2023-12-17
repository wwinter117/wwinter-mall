package cn.wwinter.malladmin.service.impl;

import cn.wwinter.malladmin.service.PmsProductAttributeCategoryService;
import cn.wwinter.malladmin.service.action.sqlAction.PmsProductAttributeCategorySqlAction;
import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.entity.PmsProductAttributeCategory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: PmsProductAttributeCategoryServiceImpl
 * Package: cnn.wwinter.malladmin.service.impl
 * Description:
 * Datetime: 2023/11/29
 * Author: zhangdd
 */
@Service
@AllArgsConstructor
public class PmsProductAttributeCategoryServiceImpl implements PmsProductAttributeCategoryService {
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
