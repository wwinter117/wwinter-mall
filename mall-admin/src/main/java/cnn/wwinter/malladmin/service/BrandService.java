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

    PmsBrand getBrand(Long id);

    List<PmsBrand> listBrands();

    List<PmsBrand> listBrands(String keyword, Integer pageNum, Integer pageSize);

    int createBrand(PmsBrandDto pmsBrandDto);

    int updateBrand(Long id, PmsBrandDto pmsBrandDto);

    int updateShowStatusBatch(List<Long> ids, Integer showStatus);

    int updateFactoryStatusBatch(List<Long> ids, Integer factoryStatus);

    int deleteBrand(Long id);

    int deleteBrandBatch(List<Long> ids);
}
