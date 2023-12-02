package cn.wwinter.malladmin.dao;/**
 * ClassName: PmsMemberPriceDao
 * Package: cn.wwinter.malladmin.dao
 * Description:
 * Datetime: 2023/12/2
 * Author: zhangdd
 */


import cn.wwinter.model.PmsMemberPrice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
public interface PmsMemberPriceDao {

    int insertList(@Param("pmsMemberPriceList") List<PmsMemberPrice> pmsMemberPriceList);
}
