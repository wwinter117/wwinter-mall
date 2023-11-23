package cn.wwinter.mapper;

import cn.wwinter.model.InnodbForeign;
import cn.wwinter.model.InnodbForeignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbForeignMapper {
    int countByExample(InnodbForeignExample example);

    int deleteByExample(InnodbForeignExample example);

    int insert(InnodbForeign record);

    int insertSelective(InnodbForeign record);

    List<InnodbForeign> selectByExample(InnodbForeignExample example);

    int updateByExampleSelective(@Param("record") InnodbForeign record, @Param("example") InnodbForeignExample example);

    int updateByExample(@Param("record") InnodbForeign record, @Param("example") InnodbForeignExample example);
}