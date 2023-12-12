package cn.wwinter.malladmin.service.impl;

import cn.wwinter.malladmin.service.action.sqlAction.product.PmsProductCategorySqlAction;
import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.dto.PmsProductCategoryDto;
import cn.wwinter.malladmin.model.domain.PmsProductCategory;
import cn.wwinter.malladmin.service.ProductCategoryService;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: ProductCategoryServiceImpl
 * Package: cnn.wwinter.malladmin.service.impl
 * Description:
 * Datetime: 2023/11/28
 * Author: zhangdd
 */
@Service
@AllArgsConstructor
public class ProductCategoryServiceImpl implements ProductCategoryService {

    private final PmsProductCategorySqlAction pmsProductCategorySqlAction;

    @Override
    public CommonResponse getItem(Long id) {
        PmsProductCategory pmsProductCategory = pmsProductCategorySqlAction.getIterm(id);
        return CommonResponse.success(pmsProductCategory);
    }

    @Override
    public CommonResponse create(PmsProductCategoryDto pmsProductCategoryDto) {
        PmsProductCategory productCategory = new PmsProductCategory();
        BeanUtils.copyProperties(pmsProductCategoryDto, productCategory);
        pmsProductCategorySqlAction.insertIterm(productCategory);
        return CommonResponse.success(productCategory);
    }

    @Override
    public CommonResponse update(Long id, PmsProductCategoryDto pmsProductCategoryDto) {
        PmsProductCategory productCategory = new PmsProductCategory();
        BeanUtils.copyProperties(pmsProductCategoryDto, productCategory);
        productCategory.setId(id);
        pmsProductCategorySqlAction.updateIterm(productCategory);
        return CommonResponse.success(productCategory);
    }

    @Override
    public CommonResponse getList(Long parentId, Integer pageNum, Integer pageSize) {
        PageInfo<PmsProductCategory> pmsProductCategoryIPage = pmsProductCategorySqlAction.selectByParentId(parentId, pageNum, pageSize);
        return CommonResponse.success(pmsProductCategoryIPage);
    }

    @Override
    public CommonResponse getList() {
        List<PmsProductCategory> pmsProductCategoryList = pmsProductCategorySqlAction.getList();
        return CommonResponse.success(pmsProductCategoryList);
    }

    @Override
    public CommonResponse delete(Long id) {
        pmsProductCategorySqlAction.deleteIterm(id);
        return CommonResponse.success(id);
    }


}
