package cn.wwinter.malladmin.service;/**
 * ClassName: PmsProductService
 * Package: cn.wwinter.malladmin.service
 * Description:
 * Datetime: 2023/12/2
 * Author: zhangdd
 */

import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.dto.PmsProductCombinationDto;

/**
 * @Description:
 * @Datetime: 2023/12/2
 * @Author: zhangdd
 */
public interface PmsProductService {
    CommonResponse create(PmsProductCombinationDto pmsProductCombinationDto);
}
