package cn.wwinter.mapper;

import cn.wwinter.model.XInnodbBufferStatsByTable;
import cn.wwinter.model.XInnodbBufferStatsByTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XInnodbBufferStatsByTableMapper {
    int countByExample(XInnodbBufferStatsByTableExample example);

    int deleteByExample(XInnodbBufferStatsByTableExample example);

    int insert(XInnodbBufferStatsByTable record);

    int insertSelective(XInnodbBufferStatsByTable record);

    List<XInnodbBufferStatsByTable> selectByExampleWithBLOBs(XInnodbBufferStatsByTableExample example);

    List<XInnodbBufferStatsByTable> selectByExample(XInnodbBufferStatsByTableExample example);

    int updateByExampleSelective(@Param("record") XInnodbBufferStatsByTable record, @Param("example") XInnodbBufferStatsByTableExample example);

    int updateByExampleWithBLOBs(@Param("record") XInnodbBufferStatsByTable record, @Param("example") XInnodbBufferStatsByTableExample example);

    int updateByExample(@Param("record") XInnodbBufferStatsByTable record, @Param("example") XInnodbBufferStatsByTableExample example);
}