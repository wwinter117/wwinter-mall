package cn.wwinter.malladmin.service.action.sqlAction.product;

import cn.wwinter.malladmin.service.action.sqlAction.common.CommonSqlAction;
import cn.wwinter.malladmin.mapper.PmsProductCategoryMapper;
import cn.wwinter.malladmin.model.domain.PmsProductCategory;
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
public class PmsProductCategorySqlAction implements CommonSqlAction<PmsProductCategory> {
    private final PmsProductCategoryMapper pmsProductCategoryMapper;

    @Override
    public PmsProductCategory getIterm(Long id) {
        try {
            return pmsProductCategoryMapper.selectById(id);
        } catch (Exception e) {
            log.error("商品类别数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<PmsProductCategory> getList() {
        try {
            return pmsProductCategoryMapper.selectList(null);
        } catch (Exception e) {
            log.error("商品类别数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public PageInfo<PmsProductCategory> getListPage(Integer pageNum, Integer pageSize) {
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<PmsProductCategory> cmsPreferenceAreaProductRelationList = pmsProductCategoryMapper.selectList(null);
            return new PageInfo<>(cmsPreferenceAreaProductRelationList);
        } catch (Exception e) {
            log.error("商品类别分页数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }


    @Override
    public int insertIterm(PmsProductCategory cmsPreferenceAreaProductRelation) {
        try {
            return pmsProductCategoryMapper.insert(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("商品类别表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insertList(List<PmsProductCategory> cmsPreferenceAreaProductRelations) {
        try {
            return pmsProductCategoryMapper.insertList(cmsPreferenceAreaProductRelations);
        } catch (Exception e) {
            log.error("商品类别表批次插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updateIterm(PmsProductCategory cmsPreferenceAreaProductRelation) {
        try {
            return pmsProductCategoryMapper.updateById(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("商品类别表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteIterm(Long id) {
        try {
            return pmsProductCategoryMapper.deleteById(id);
        } catch (Exception e) {
            log.error("商品类别数据删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteList(List<Long> ids) {
        try {
            return pmsProductCategoryMapper.deleteBatchIds(ids);
        } catch (Exception e) {
            log.error("商品类别数据批次删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public PageInfo<PmsProductCategory> selectByParentId(Long parentId, Integer pageNum, Integer pageSize) {
        return null;
    }
}
