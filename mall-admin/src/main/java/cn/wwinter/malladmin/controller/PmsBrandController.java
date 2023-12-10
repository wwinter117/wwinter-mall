package cn.wwinter.malladmin.controller;

import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.dto.brand.PmsBrandDto;
import cn.wwinter.malladmin.service.BrandService;
import io.swagger.annotations.Api;
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
@Api(tags = "PmsBrandController")
public class PmsBrandController {

    private final BrandService brandService;

    @ApiOperation("根据编号查询品牌信息")
    @GetMapping("/{id}")
    public CommonResponse getItem(@PathVariable(value = "id") Long id) {
        return brandService.getItem(id);
    }

    @ApiOperation("分页获取品牌信息")
    @GetMapping("/list")
    public CommonResponse getList(@RequestParam(value = "keyword", required = false) String keyword,
                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                          @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
        return brandService.getList(keyword, pageNum, pageSize);
    }

    @ApiOperation("获取全部品牌信息")
    @GetMapping("/listAll")
    public CommonResponse getList() {
        return brandService.getList();
    }

    @ApiOperation("添加品牌")
    @PostMapping("/create")
    public CommonResponse create(@Validated @RequestBody PmsBrandDto pmsBrandDto, BindingResult result) {
        return brandService.create(pmsBrandDto);
    }

    @ApiOperation("更新品牌")
    @PostMapping("/update/{id}")
    public CommonResponse update(@PathVariable("id") Long id, @Validated @RequestBody PmsBrandDto pmsBrandDto, BindingResult result) {
        return brandService.update(id, pmsBrandDto);
    }

    @ApiOperation("批量更新品牌显示状态")
    @PostMapping("/update/showStatus")
    public CommonResponse updateShowStatusBatch(@RequestParam("ids") List<Long> ids, @RequestParam("showStatus") Integer showStatus) {
        return brandService.updateShowStatusBatch(ids, showStatus);
    }

    @ApiOperation("批量更新厂家制造商状态")
    @PostMapping("/update/factoryStatus")
    public CommonResponse updateFactoryStatusBatch(@RequestParam("ids") List<Long> ids, @RequestParam("factoryStatus") Integer factoryStatus) {
        return brandService.updateFactoryStatusBatch(ids, factoryStatus);
    }

    @ApiOperation("删除品牌")
    @PostMapping("/delete/{id}")
    public CommonResponse delete(@PathVariable("id") Long id) {
        return brandService.delete(id);
    }

    @ApiOperation("批量删除品牌")
    @PostMapping("/delete/batch")
    public CommonResponse deleteBatch(@RequestParam("ids") List<Long> ids) {
        return brandService.deleteBatch(ids);
    }

}
