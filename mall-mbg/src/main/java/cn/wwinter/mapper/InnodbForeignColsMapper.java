package cn.wwinter.mapper;

import cn.wwinter.model.InnodbForeignCols;
import cn.wwinter.model.InnodbForeignColsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbForeignColsMapper {
    int countByExample(InnodbForeignColsExample example);

    int deleteByExample(InnodbForeignColsExample example);

    int insert(InnodbForeignCols record);

    int insertSelective(InnodbForeignCols record);

    List<InnodbForeignCols> selectByExample(InnodbForeignColsExample example);

    int updateByExampleSelective(@Param("record") InnodbForeignCols record, @Param("example") InnodbForeignColsExample example);

    int updateByExample(@Param("record") InnodbForeignCols record, @Param("example") InnodbForeignColsExample example);
}