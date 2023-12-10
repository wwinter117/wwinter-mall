package cn.wwinter.malladmin.service.impl;

import cn.wwinter.malladmin.action.sqlAction.brand.PmsBrandSqlAction;
import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.dto.brand.PmsBrandDto;
import cn.wwinter.malladmin.model.entity.brand.PmsBrand;
import cn.wwinter.malladmin.service.BrandService;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * ClassName: BrandServiceImpl
 * Package: cn.wwinter.malldemo.service.impl
 * Description:
 * Datetime: 2023/11/27
 * Author: zhangdd
 */
@Service
@AllArgsConstructor
@Slf4j
public class BrandServiceImpl implements BrandService {

    private final PmsBrandSqlAction pmsBrandSqlAction;

    @Override
    public CommonResponse getItem(Long id) {
        PmsBrand pmsBrand = pmsBrandSqlAction.getIterm(id);
        return CommonResponse.success(pmsBrand);
    }

    @Override
    public CommonResponse getList() {
        List<PmsBrand> pmsBrandList = pmsBrandSqlAction.getList();
        return CommonResponse.success(pmsBrandList);
    }

    @Override
    public CommonResponse getList(String keyword, Integer pageNum, Integer pageSize) {
        PageInfo<PmsBrand> pmsBrandPageInfo = pmsBrandSqlAction.selectByKeyword(keyword, pageNum, pageSize);
        return CommonResponse.success(pmsBrandPageInfo);
    }

    @Override
    public CommonResponse create(PmsBrandDto pmsBrandDto) {
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtils.copyProperties(pmsBrandDto, pmsBrand);
        if (StringUtils.hasLength(pmsBrand.getFirstLetter())) {
            pmsBrand.setFirstLetter(pmsBrandDto.getName().substring(0, 1));
        }
        pmsBrandSqlAction.insertIterm(pmsBrand);
        return CommonResponse.success(pmsBrand);
    }

    @Override
    public CommonResponse update(Long id, PmsBrandDto pmsBrandDto) {
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtils.copyProperties(pmsBrandDto, pmsBrand);
        pmsBrand.setId(id);
        if (StringUtils.hasLength(pmsBrand.getFirstLetter())) {
            pmsBrand.setFirstLetter(pmsBrandDto.getName().substring(0, 1));
        }
        pmsBrandSqlAction.updateIterm(pmsBrand);
        return CommonResponse.success(pmsBrand);
    }

    @Override
    public CommonResponse updateShowStatusBatch(List<Long> ids, Integer showStatus) {
        pmsBrandSqlAction.updateShowStatusBatchById(ids, showStatus);
        return CommonResponse.success(ids);
    }

    @Override
    public CommonResponse updateFactoryStatusBatch(List<Long> ids, Integer factoryStatus) {
        pmsBrandSqlAction.updateFactoryStatusBatch(ids, factoryStatus);
        return CommonResponse.success(ids);
    }

    @Override
    public CommonResponse delete(Long id) {
        pmsBrandSqlAction.deleteIterm(id);
        return CommonResponse.success(id);
    }

    @Override
    public CommonResponse deleteBatch(List<Long> ids) {
        pmsBrandSqlAction.deleteList(ids);
        return CommonResponse.success("批量删除成功");
    }

}
