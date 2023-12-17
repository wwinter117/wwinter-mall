package cn.wwinter.malladmin.service.action.sqlAction;

import cn.wwinter.mapper.PmsProductFullReductionMapper;
import cn.wwinter.entity.PmsProductFullReduction;
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
public class PmsProductFullReductionSqlAction implements CommonSqlAction<PmsProductFullReduction> {
    private final PmsProductFullReductionMapper pmsProductFullReductionMapper;

    @Override
    public PmsProductFullReduction getIterm(Long id) {
        try {
            return pmsProductFullReductionMapper.selectById(id);
        } catch (Exception e) {
            log.error("商品满减价格数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<PmsProductFullReduction> getList() {
        try {
            return pmsProductFullReductionMapper.selectList(null);
        } catch (Exception e) {
            log.error("商品满减价格数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public PageInfo<PmsProductFullReduction> getListPage(Integer pageNum, Integer pageSize) {
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<PmsProductFullReduction> cmsPreferenceAreaProductRelationList = pmsProductFullReductionMapper.selectList(null);
            return new PageInfo<>(cmsPreferenceAreaProductRelationList);
        } catch (Exception e) {
            log.error("商品满减价格分页数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }


    @Override
    public int insertIterm(PmsProductFullReduction cmsPreferenceAreaProductRelation) {
        try {
            return pmsProductFullReductionMapper.insert(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("商品满减价格表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insertList(List<PmsProductFullReduction> cmsPreferenceAreaProductRelations) {
        try {
            return pmsProductFullReductionMapper.insertList(cmsPreferenceAreaProductRelations);
        } catch (Exception e) {
            log.error("商品满减价格表批次插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updateIterm(PmsProductFullReduction cmsPreferenceAreaProductRelation) {
        try {
            return pmsProductFullReductionMapper.updateById(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("商品满减价格表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteIterm(Long id) {
        try {
            return pmsProductFullReductionMapper.deleteById(id);
        } catch (Exception e) {
            log.error("商品满减价格数据删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteList(List<Long> ids) {
        try {
            return pmsProductFullReductionMapper.deleteBatchIds(ids);
        } catch (Exception e) {
            log.error("商品满减价格数据批次删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
