package cn.wwinter.malladmin.service;

import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.dto.product.PmsProductCategoryDto;
import cn.wwinter.malladmin.model.entity.product.PmsProductCategory;

import java.util.List;

/**
 * ClassName: ProductCategoryService
 * Package: cnn.wwinter.malladmin.service
 * Description:
 * Datetime: 2023/11/28
 * Author: zhangdd
 */
public interface ProductCategoryService {
    CommonResponse create(PmsProductCategoryDto pmsProductCategoryDto);

    CommonResponse update(Long id, PmsProductCategoryDto pmsProductCategoryDto);

    CommonResponse getList(Long parentId, Integer pageNum, Integer pageSize);

    CommonResponse getList();

    CommonResponse delete(Long id);

    CommonResponse getItem(Long id);
}
