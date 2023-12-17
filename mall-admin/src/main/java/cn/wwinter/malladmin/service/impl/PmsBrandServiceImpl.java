package cn.wwinter.malladmin.service.impl;

import cn.wwinter.entity.PmsProduct;
import cn.wwinter.malladmin.service.PmsBrandService;
import cn.wwinter.malladmin.service.action.sqlAction.PmsBrandSqlAction;
import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.dto.PmsBrandDto;
import cn.wwinter.entity.PmsBrand;
import cn.wwinter.malladmin.service.action.sqlAction.PmsProductSqlAction;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * ClassName: PmsBrandServiceImpl
 * Package: cn.wwinter.malldemo.service.impl
 * Description:
 * Datetime: 2023/11/27
 * Author: zhangdd
 */
@Service
@AllArgsConstructor
@Slf4j
public class PmsBrandServiceImpl implements PmsBrandService {

    private final PmsBrandSqlAction pmsBrandSqlAction;

    private final PmsProductSqlAction pmsProductSqlAction;


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

        PmsProduct pmsProduct = new PmsProduct();
        pmsProduct.setBrandId(id);
        pmsProduct.setBrandName(pmsBrandDto.getName());
        pmsProductSqlAction.updateIterm(pmsProduct);
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
