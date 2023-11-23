package cn.wwinter.mapper;

import cn.wwinter.model.InnodbSessionTempTablespaces;
import cn.wwinter.model.InnodbSessionTempTablespacesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbSessionTempTablespacesMapper {
    int countByExample(InnodbSessionTempTablespacesExample example);

    int deleteByExample(InnodbSessionTempTablespacesExample example);

    int insert(InnodbSessionTempTablespaces record);

    int insertSelective(InnodbSessionTempTablespaces record);

    List<InnodbSessionTempTablespaces> selectByExample(InnodbSessionTempTablespacesExample example);

    int updateByExampleSelective(@Param("record") InnodbSessionTempTablespaces record, @Param("example") InnodbSessionTempTablespacesExample example);

    int updateByExample(@Param("record") InnodbSessionTempTablespaces record, @Param("example") InnodbSessionTempTablespacesExample example);
}