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
    int create(PmsProductCategoryDto pmsProductCategoryDto);

    int update(Long id, PmsProductCategoryDto pmsProductCategoryDto);

    List<PmsProductCategory> getList(Long parentId, Integer pageNum, Integer pageSize);

    List<PmsProductCategory> getList();

    int delete(Long id);

    Object getItem(Long id);
}
