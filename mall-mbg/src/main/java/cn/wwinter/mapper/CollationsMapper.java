package cn.wwinter.mapper;

import cn.wwinter.model.Collations;
import cn.wwinter.model.CollationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollationsMapper {
    int countByExample(CollationsExample example);

    int deleteByExample(CollationsExample example);

    int insert(Collations record);

    int insertSelective(Collations record);

    List<Collations> selectByExample(CollationsExample example);

    int updateByExampleSelective(@Param("record") Collations record, @Param("example") CollationsExample example);

    int updateByExample(@Param("record") Collations record, @Param("example") CollationsExample example);
}