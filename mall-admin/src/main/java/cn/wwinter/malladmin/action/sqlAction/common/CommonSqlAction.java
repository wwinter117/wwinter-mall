package cn.wwinter.malladmin.action.sqlAction.common;

import com.github.pagehelper.PageInfo;

import java.util.Collection;
import java.util.List;

/**
 * @Description: 通用SqlAction
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
public interface CommonSqlAction<ENTITY> {

    /**
     * <---------- SELECT ---------->
     */

    ENTITY getIterm(Long id);

    List<ENTITY> getList();

    PageInfo<ENTITY> getListPage(Integer pageNum, Integer pageSize);


    /**
     * <---------- INSERT ---------->
     */

    int insertIterm(ENTITY entity);

    int insertList(List<ENTITY> entityList);


    /**
     * <---------- UPDATE ---------->
     */

    int updateIterm(ENTITY entity);


    /**
     * <---------- DELETE ---------->
     */

    int deleteIterm(Long id);

    int deleteList(List<Long> ids);

}
