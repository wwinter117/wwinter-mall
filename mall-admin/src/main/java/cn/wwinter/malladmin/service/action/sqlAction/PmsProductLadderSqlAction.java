package cn.wwinter.malladmin.service.action.sqlAction;

import cn.wwinter.mapper.PmsProductLadderMapper;
import cn.wwinter.entity.PmsProductLadder;
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
public class PmsProductLadderSqlAction implements CommonSqlAction<PmsProductLadder> {
    private final PmsProductLadderMapper pmsProductLadderMapper;

    @Override
    public PmsProductLadder getIterm(Long id) {
        try {
            return pmsProductLadderMapper.selectById(id);
        } catch (Exception e) {
            log.error("商品阶梯价格数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<PmsProductLadder> getList() {
        try {
            return pmsProductLadderMapper.selectList(null);
        } catch (Exception e) {
            log.error("商品阶梯价格数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public PageInfo<PmsProductLadder> getListPage(Integer pageNum, Integer pageSize) {
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<PmsProductLadder> cmsPreferenceAreaProductRelationList = pmsProductLadderMapper.selectList(null);
            return new PageInfo<>(cmsPreferenceAreaProductRelationList);
        } catch (Exception e) {
            log.error("商品阶梯价格分页数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }


    @Override
    public int insertIterm(PmsProductLadder cmsPreferenceAreaProductRelation) {
        try {
            return pmsProductLadderMapper.insert(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("商品阶梯价格表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insertList(List<PmsProductLadder> cmsPreferenceAreaProductRelations) {
        try {
            return pmsProductLadderMapper.insertList(cmsPreferenceAreaProductRelations);
        } catch (Exception e) {
            log.error("商品阶梯价格表批次插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updateIterm(PmsProductLadder cmsPreferenceAreaProductRelation) {
        try {
            return pmsProductLadderMapper.updateById(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("商品阶梯价格表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteIterm(Long id) {
        try {
            return pmsProductLadderMapper.deleteById(id);
        } catch (Exception e) {
            log.error("商品阶梯价格数据删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteList(List<Long> ids) {
        try {
            return pmsProductLadderMapper.deleteBatchIds(ids);
        } catch (Exception e) {
            log.error("商品阶梯价格数据批次删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
