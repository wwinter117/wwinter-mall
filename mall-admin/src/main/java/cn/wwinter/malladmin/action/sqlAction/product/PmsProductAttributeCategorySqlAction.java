package cn.wwinter.malladmin.action.sqlAction.product;

import cn.wwinter.malladmin.action.sqlAction.common.CommonSqlAction;
import cn.wwinter.malladmin.mapper.PmsProductAttributeCategoryMapper;
import cn.wwinter.malladmin.model.entity.product.PmsProductAttributeCategory;
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
@AllArgsConstructor
@Component
@Slf4j
public class PmsProductAttributeCategorySqlAction implements CommonSqlAction<PmsProductAttributeCategory> {
    private final PmsProductAttributeCategoryMapper pmsProductAttributeCategoryMapper;

    @Override
    public PmsProductAttributeCategory getIterm(Long id) {
        try {
            return pmsProductAttributeCategoryMapper.selectById(id);
        } catch (Exception e) {
            log.error("商品属性类别数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<PmsProductAttributeCategory> getList() {
        try {
            return pmsProductAttributeCategoryMapper.selectList(null);
        } catch (Exception e) {
            log.error("商品属性类别数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public PageInfo<PmsProductAttributeCategory> getListPage(Integer pageNum, Integer pageSize) {
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<PmsProductAttributeCategory> cmsPreferenceAreaProductRelationList = pmsProductAttributeCategoryMapper.selectList(null);
            return new PageInfo<>(cmsPreferenceAreaProductRelationList);
        } catch (Exception e) {
            log.error("商品属性类别分页数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }


    @Override
    public int insertIterm(PmsProductAttributeCategory cmsPreferenceAreaProductRelation) {
        try {
            return pmsProductAttributeCategoryMapper.insert(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("商品属性类别表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insertList(List<PmsProductAttributeCategory> cmsPreferenceAreaProductRelations) {
        try {
            return pmsProductAttributeCategoryMapper.insertList(cmsPreferenceAreaProductRelations);
        } catch (Exception e) {
            log.error("商品属性类别表批次插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updateIterm(PmsProductAttributeCategory cmsPreferenceAreaProductRelation) {
        try {
            return pmsProductAttributeCategoryMapper.updateById(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("商品属性类别表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteIterm(Long id) {
        try {
            return pmsProductAttributeCategoryMapper.deleteById(id);
        } catch (Exception e) {
            log.error("商品属性类别数据删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteList(List<Long> ids) {
        try {
            return pmsProductAttributeCategoryMapper.deleteBatchIds(ids);
        } catch (Exception e) {
            log.error("商品属性类别数据批次删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
