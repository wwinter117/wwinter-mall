package cn.wwinter.malladmin.service;


import cn.wwinter.malladmin.model.common.CommonResponse;

/**
 * ClassName: ProductAttributeCategoryService
 * Package: cnn.wwinter.malladmin.service
 * Description:
 * Datetime: 2023/11/29
 * Author: zhangdd
 */
public interface ProductAttributeCategoryService {
    CommonResponse create(String name);

    CommonResponse getList(Integer pageNum, Integer pageSize);
}
