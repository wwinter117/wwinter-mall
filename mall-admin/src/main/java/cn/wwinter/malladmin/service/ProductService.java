package cn.wwinter.malladmin.service;/**
 * ClassName: ProductService
 * Package: cn.wwinter.malladmin.service
 * Description:
 * Datetime: 2023/12/2
 * Author: zhangdd
 */

import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.dto.product.PmsProductCombinationDto;

/**
 * @Description:
 * @Datetime: 2023/12/2
 * @Author: zhangdd
 */
public interface ProductService {
    CommonResponse create(PmsProductCombinationDto pmsProductCombinationDto);
}
