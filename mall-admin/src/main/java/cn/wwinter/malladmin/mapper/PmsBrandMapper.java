package cn.wwinter.malladmin.mapper;

import cn.wwinter.malladmin.model.entity.brand.PmsBrand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2023/12/3
 * @Author: zhangdd
 */
@Mapper
public interface PmsBrandMapper extends CommonMapper<PmsBrand> {
    @Override
    int insertList(@Param("list") List<PmsBrand> list);

    List<PmsBrand> selectByKeyword(@Param("keyword") String keyword);

    int updateShowStatusBatch(@Param("ids") List<Long> ids, @Param("showStatus") Integer showStatus);

    int updateFactoryStatusBatch(@Param("ids") List<Long> ids, @Param("factoryStatus") Integer factoryStatus);
}
