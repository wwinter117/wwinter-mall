package cn.wwinter.malldemo.service;

import cn.wwinter.malldemo.model.dto.PmsBrandDto;
import cn.wwinter.model.PmsBrand;

import java.util.List;

/**
 * ClassName: BrandService
 * Package: cn.wwinter.malldemo.service
 * Description:
 * Datetime: 2023/11/27
 * Author: zhangdd
 */
public interface BrandService {

    List<PmsBrand> listBrands();

    List<PmsBrand> listBrands(Integer pageNum, Integer pageSize);

    int createBrand(PmsBrandDto pmsBrandDto);

    int updateBrand(Long id, PmsBrandDto pmsBrandDto);

    int deleteBrand(Long id);

    PmsBrand getBrand(Long id);
}
