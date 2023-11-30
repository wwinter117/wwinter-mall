package cnn.wwinter.malladmin.service;

import cn.wwinter.model.PmsBrand;
import cnn.wwinter.malladmin.model.dto.PmsBrandDto;

import java.util.List;

/**
 * ClassName: BrandService
 * Package: cn.wwinter.malldemo.service
 * Description:
 * Datetime: 2023/11/27
 * Author: zhangdd
 */
public interface BrandService {

    PmsBrand getItem(Long id);

    List<PmsBrand> getList();

    List<PmsBrand> getList(String keyword, Integer pageNum, Integer pageSize);

    int create(PmsBrandDto pmsBrandDto);

    int update(Long id, PmsBrandDto pmsBrandDto);

    int updateShowStatusBatch(List<Long> ids, Integer showStatus);

    int updateFactoryStatusBatch(List<Long> ids, Integer factoryStatus);

    int delete(Long id);

    int deleteBatch(List<Long> ids);
}
