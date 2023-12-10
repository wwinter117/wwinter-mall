package cn.wwinter.malladmin.action.sqlAction.product;

import cn.wwinter.malladmin.action.sqlAction.common.CommonSqlAction;
import cn.wwinter.malladmin.mapper.CmsPreferenceAreaProductRelationMapper;
import cn.wwinter.malladmin.model.entity.product.CmsPreferenceAreaProductRelation;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description: 优选专区和商品的关系
 * @Date: 2023/12/3
 * @Author: zhangdd
 */
@Component
@AllArgsConstructor
@Slf4j
public class CmsPreferenceAreaProductRelationSqlAction implements CommonSqlAction<CmsPreferenceAreaProductRelation> {
    private final CmsPreferenceAreaProductRelationMapper cmsPreferenceAreaProductRelationMapper;

    @Override
    public CmsPreferenceAreaProductRelation getIterm(Long id) {
        try {
            return cmsPreferenceAreaProductRelationMapper.selectById(id);
        } catch (Exception e) {
            log.error("优选专区和商品的关系数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<CmsPreferenceAreaProductRelation> getList() {
        try {
            return cmsPreferenceAreaProductRelationMapper.selectList(null);
        } catch (Exception e) {
            log.error("优选专区和商品的关系数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public PageInfo<CmsPreferenceAreaProductRelation> getListPage(Integer pageNum, Integer pageSize) {
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<CmsPreferenceAreaProductRelation> cmsPreferenceAreaProductRelationList = cmsPreferenceAreaProductRelationMapper.selectList(null);
            return new PageInfo<>(cmsPreferenceAreaProductRelationList);
        } catch (Exception e) {
            log.error("优选专区和商品的关系分页数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }


    @Override
    public int insertIterm(CmsPreferenceAreaProductRelation cmsPreferenceAreaProductRelation) {
        try {
            return cmsPreferenceAreaProductRelationMapper.insert(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("优选专区和商品的关系表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insertList(List<CmsPreferenceAreaProductRelation> cmsPreferenceAreaProductRelations) {
        try {
            return cmsPreferenceAreaProductRelationMapper.insertList(cmsPreferenceAreaProductRelations);
        } catch (Exception e) {
            log.error("优选专区和商品的关系表批次插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updateIterm(CmsPreferenceAreaProductRelation cmsPreferenceAreaProductRelation) {
        try {
            return cmsPreferenceAreaProductRelationMapper.updateById(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("优选专区和商品的关系表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteIterm(Long id) {
        try {
            return cmsPreferenceAreaProductRelationMapper.deleteById(id);
        } catch (Exception e) {
            log.error("优选专区和商品的关系数据删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteList(List<Long> ids) {
        try {
            return cmsPreferenceAreaProductRelationMapper.deleteBatchIds(ids);
        } catch (Exception e) {
            log.error("优选专区和商品的关系数据批次删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
