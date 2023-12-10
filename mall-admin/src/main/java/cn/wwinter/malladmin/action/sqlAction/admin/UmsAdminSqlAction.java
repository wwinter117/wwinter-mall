package cn.wwinter.malladmin.action.sqlAction.admin;

import cn.wwinter.malladmin.action.sqlAction.common.CommonSqlAction;
import cn.wwinter.malladmin.mapper.UmsAdminMapper;
import cn.wwinter.malladmin.model.entity.admin.UmsAdmin;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description:
 * @Date: 2023/12/3
 * @Author: zhangdd
 */
@Component
@AllArgsConstructor
@Slf4j
public class UmsAdminSqlAction implements CommonSqlAction<UmsAdmin> {

    private final UmsAdminMapper umsAdminMapper;

    public List<UmsAdmin> selectByUsername(String username) {
        List<UmsAdmin> umsAdmins = Collections.emptyList();
        try {
            umsAdmins =  umsAdminMapper.selectByUsername(username);
        } catch (Exception e) {
            log.error("根据用户名查找用户信息数据失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
        return umsAdmins;
    }


    @Override
    public UmsAdmin getIterm(Long id) {
        try {
            return umsAdminMapper.selectById(id);
        } catch (Exception e) {
            log.error("用户信息数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<UmsAdmin> getList() {
        try {
            return umsAdminMapper.selectList(null);
        } catch (Exception e) {
            log.error("用户信息数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public PageInfo<UmsAdmin> getListPage(Integer pageNum, Integer pageSize) {
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<UmsAdmin> cmsPreferenceAreaProductRelationList = umsAdminMapper.selectList(null);
            return new PageInfo<>(cmsPreferenceAreaProductRelationList);
        } catch (Exception e) {
            log.error("用户信息分页数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }


    @Override
    public int insertIterm(UmsAdmin cmsPreferenceAreaProductRelation) {
        try {
            return umsAdminMapper.insert(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("用户信息表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insertList(List<UmsAdmin> cmsPreferenceAreaProductRelations) {
        try {
            return umsAdminMapper.insertList(cmsPreferenceAreaProductRelations);
        } catch (Exception e) {
            log.error("用户信息表批次插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updateIterm(UmsAdmin cmsPreferenceAreaProductRelation) {
        try {
            return umsAdminMapper.updateById(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("用户信息表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteIterm(Long id) {
        try {
            return umsAdminMapper.deleteById(id);
        } catch (Exception e) {
            log.error("用户信息数据删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteList(List<Long> ids) {
        try {
            return umsAdminMapper.deleteBatchIds(ids);
        } catch (Exception e) {
            log.error("用户信息数据批次删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
