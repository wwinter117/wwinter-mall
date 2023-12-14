package cn.wwinter.malladmin.service;


import cn.wwinter.malladmin.model.common.CommonResponse;

/**
 * ClassName: PmsProductAttributeCategoryService
 * Package: cnn.wwinter.malladmin.service
 * Description:
 * Datetime: 2023/11/29
 * Author: zhangdd
 */
public interface PmsProductAttributeCategoryService {
    CommonResponse create(String name);

    CommonResponse getList(Integer pageNum, Integer pageSize);
}
