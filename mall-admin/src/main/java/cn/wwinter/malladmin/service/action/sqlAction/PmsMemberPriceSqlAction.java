package cn.wwinter.malladmin.service.action.sqlAction;

import cn.wwinter.mapper.PmsMemberPriceMapper;
import cn.wwinter.entity.PmsMemberPrice;
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
public class PmsMemberPriceSqlAction implements CommonSqlAction<PmsMemberPrice> {
    private final PmsMemberPriceMapper pmsMemberPriceMapper;

    @Override
    public PmsMemberPrice getIterm(Long id) {
        try {
            return pmsMemberPriceMapper.selectById(id);
        } catch (Exception e) {
            log.error("商品会员价格数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<PmsMemberPrice> getList() {
        try {
            return pmsMemberPriceMapper.selectList(null);
        } catch (Exception e) {
            log.error("商品会员价格数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public PageInfo<PmsMemberPrice> getListPage(Integer pageNum, Integer pageSize) {
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<PmsMemberPrice> cmsPreferenceAreaProductRelationList = pmsMemberPriceMapper.selectList(null);
            return new PageInfo<>(cmsPreferenceAreaProductRelationList);
        } catch (Exception e) {
            log.error("商品会员价格分页数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }


    @Override
    public int insertIterm(PmsMemberPrice cmsPreferenceAreaProductRelation) {
        try {
            return pmsMemberPriceMapper.insert(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("商品会员价格表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insertList(List<PmsMemberPrice> cmsPreferenceAreaProductRelations) {
        try {
            return pmsMemberPriceMapper.insertList(cmsPreferenceAreaProductRelations);
        } catch (Exception e) {
            log.error("商品会员价格表批次插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updateIterm(PmsMemberPrice cmsPreferenceAreaProductRelation) {
        try {
            return pmsMemberPriceMapper.updateById(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("商品会员价格表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteIterm(Long id) {
        try {
            return pmsMemberPriceMapper.deleteById(id);
        } catch (Exception e) {
            log.error("商品会员价格数据删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteList(List<Long> ids) {
        try {
            return pmsMemberPriceMapper.deleteBatchIds(ids);
        } catch (Exception e) {
            log.error("商品会员价格数据批次删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
