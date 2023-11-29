package cnn.wwinter.malladmin.service;

import cn.wwinter.model.PmsProductCategory;
import cnn.wwinter.malladmin.model.dto.PmsProductCategoryDto;

import java.util.List;

/**
 * ClassName: ProductCategoryService
 * Package: cnn.wwinter.malladmin.service
 * Description:
 * Datetime: 2023/11/28
 * Author: zhangdd
 */
public interface ProductCategoryService {
    int createProductCategory(PmsProductCategoryDto pmsProductCategoryDto);

    int updateProductCategory(Long id, PmsProductCategoryDto pmsProductCategoryDto);

    List<PmsProductCategory> listProductCategory(Long parentId, Integer pageNum, Integer pageSize);

    List<PmsProductCategory> listProductCategory();

    int deleteProductCategory(Long id);

    Object getProductCategory(Long id);
}
