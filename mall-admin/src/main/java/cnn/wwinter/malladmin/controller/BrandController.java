package cnn.wwinter.malladmin.controller;

import cnn.wwinter.malladmin.model.dto.CommonResult;
import cnn.wwinter.malladmin.model.dto.PmsBrandDto;
import cnn.wwinter.malladmin.service.BrandService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: DemoController
 * Package: cn.wwinter.malldemo.controller
 * Description:
 * Datetime: 2023/11/27
 * Author: zhangdd
 */
@RestController
@RequestMapping("/brand")
@AllArgsConstructor
@Slf4j
public class BrandController {

    private final BrandService brandService;

    @ApiOperation("根据编号查询品牌信息")
    @GetMapping("/{id}")
    public Object getBrand(@PathVariable(value = "id") Long id) {
        return new CommonResult().success(brandService.getBrand(id));
    }

    @ApiOperation("分页获取品牌信息")
    @GetMapping("/list")
    public Object listBrands(@RequestParam(value = "keyword", required = false) String keyword,
                             @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                             @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
        return new CommonResult().pageSuccess(brandService.listBrands(keyword, pageNum, pageSize));
    }

    @ApiOperation("获取全部品牌信息")
    @GetMapping("/listAll")
    public Object getBrandList() {
        return new CommonResult().success(brandService.listBrands());
    }

    @ApiOperation("添加品牌")
    @PostMapping("/create")
    public Object createBrand(@Validated @RequestBody PmsBrandDto pmsBrandDto, BindingResult result) {
        if (result.hasErrors()) {
            return new CommonResult().validateFailed(result.getFieldError().getDefaultMessage());
        }
        CommonResult commonResult;
        int count = brandService.createBrand(pmsBrandDto);
        if (count == 1) {
            commonResult = new CommonResult().success(pmsBrandDto);
            log.debug("添加成功: {}", pmsBrandDto);
        } else {
            commonResult = new CommonResult().failed();
            log.debug("添加失败: {}", pmsBrandDto);
        }
        return commonResult;
    }

    @ApiOperation("更新品牌")
    @PostMapping("/update/{id}")
    public Object updateBrand(@PathVariable("id") Long id, @Validated @RequestBody PmsBrandDto pmsBrandDto, BindingResult result) {
        if (result.hasErrors()) {
            return new CommonResult().validateFailed(result.getFieldError().getDefaultMessage());
        }
        CommonResult commonResult;
        int count = brandService.updateBrand(id, pmsBrandDto);
        if (count == 1) {
            commonResult = new CommonResult().success(pmsBrandDto);
            log.debug("更新成功: {}", pmsBrandDto);
        } else {
            commonResult = new CommonResult().failed();
            log.debug("更新失败: {}", pmsBrandDto);
        }
        return commonResult;
    }

    @ApiOperation("批量更新品牌显示状态")
    @PostMapping("/update/showStatus")
    public Object updateShowStatusBatch(@RequestParam("ids") List<Long> ids, @RequestParam("showStatus") Integer showStatus) {
        int count = brandService.updateShowStatusBatch(ids, showStatus);
        CommonResult commonResult;
        if (count > 0) {
            log.debug("品牌显示状态更新成功: ids={}", ids);
            commonResult = new CommonResult().success(count);
        } else {
            log.error("品牌显示状态更新失败: ids={}", ids);
            commonResult = new CommonResult().failed();
        }
        return commonResult;
    }

    @ApiOperation("批量更新厂家制造商状态")
    @PostMapping("/update/factoryStatus")
    public Object updateFactoryStatusBatch(@RequestParam("ids") List<Long> ids, @RequestParam("factoryStatus") Integer factoryStatus) {
        int count = brandService.updateFactoryStatusBatch(ids, factoryStatus);
        CommonResult commonResult;
        if (count > 0) {
            log.debug("厂家制造商状态更新成功: ids={}", ids);
            commonResult = new CommonResult().success(count);
        } else {
            log.error("厂家制造商状态更新失败: ids={}", ids);
            commonResult = new CommonResult().failed();
        }
        return commonResult;
    }

    @ApiOperation("删除品牌")
    @PostMapping("/delete/{id}")
    public Object deleteBrand(@PathVariable("id") Long id) {
        int count = brandService.deleteBrand(id);
        CommonResult commonResult;
        if (count == 1) {
            commonResult = new CommonResult().success(null);
            log.debug("删除成功: id={}", id);
        } else {
            commonResult = new CommonResult().failed();
            log.debug("删除成功: id={}", id);
        }
        return commonResult;
    }

    @ApiOperation("批量删除品牌")
    @PostMapping("/delete/batch")
    public Object deleteBrandBatch(@RequestParam("ids") List<Long> ids) {
        int count = brandService.deleteBrandBatch(ids);
        CommonResult commonResult;
        if (count > 0) {
            log.debug("删除成功: ids={}", ids);
            commonResult = new CommonResult().success(count);
        } else {
            log.debug("删除成功: ids={}", ids);
            commonResult = new CommonResult().failed();
        }
        return commonResult;
    }
}
