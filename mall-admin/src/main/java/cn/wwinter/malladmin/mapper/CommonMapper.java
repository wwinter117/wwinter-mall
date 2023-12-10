package cn.wwinter.malladmin.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2023/12/2
 * @Author: zhangdd
 */
public interface CommonMapper<T> extends BaseMapper<T> {
    int insertList(List<T> list);
}
