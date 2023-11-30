package cn.wwinter.malladmin.service;

import cn.wwinter.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * ClassName: ProductAttributeCategoryService
 * Package: cnn.wwinter.malladmin.service
 * Description:
 * Datetime: 2023/11/29
 * Author: zhangdd
 */
public interface ProductAttributeCategoryService {
    int create(String name);

    List<PmsProductAttributeCategory> getList(Integer pageNum, Integer pageSize);
}
