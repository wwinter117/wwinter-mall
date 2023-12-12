package cn.wwinter.malladmin.service;

import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.dto.PmsBrandDto;

import java.util.List;

/**
 * ClassName: BrandService
 * Package: cn.wwinter.malldemo.service
 * Description:
 * Datetime: 2023/11/27
 * Author: zhangdd
 */
public interface BrandService {

    CommonResponse getItem(Long id);

    CommonResponse getList(String keyword, Integer pageNum, Integer pageSize);

    CommonResponse getList();

    CommonResponse create(PmsBrandDto pmsBrandDto);

    CommonResponse update(Long id, PmsBrandDto pmsBrandDto);

    CommonResponse updateShowStatusBatch(List<Long> ids, Integer showStatus);

    CommonResponse updateFactoryStatusBatch(List<Long> ids, Integer factoryStatus);

    CommonResponse delete(Long id);

    CommonResponse deleteBatch(List<Long> ids);
}
