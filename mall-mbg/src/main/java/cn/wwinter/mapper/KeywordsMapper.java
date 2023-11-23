package cn.wwinter.mapper;

import cn.wwinter.model.Keywords;
import cn.wwinter.model.KeywordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeywordsMapper {
    int countByExample(KeywordsExample example);

    int deleteByExample(KeywordsExample example);

    int insert(Keywords record);

    int insertSelective(Keywords record);

    List<Keywords> selectByExample(KeywordsExample example);

    int updateByExampleSelective(@Param("record") Keywords record, @Param("example") KeywordsExample example);

    int updateByExample(@Param("record") Keywords record, @Param("example") KeywordsExample example);
}