package cn.wwinter.malladmin.model.dto.brand;

import cn.wwinter.malladmin.validator.FlagValidator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


/**
 * 品牌传递参数
 */
@Data
@ApiModel(value = "PmsBrandDto")
public class PmsBrandDto {
    @ApiModelProperty(value = "品牌首字母", required = true)
    @NotNull(message = "首字母不能为空")
    private String firstLetter;
    @ApiModelProperty(value = "品牌名称", required = true)
    @NotNull(message = "名称不能为空")
    private String name;
    @ApiModelProperty(value = "排序字段")
    @Min(value = 0, message = "排序最小为0")
    private Integer sort;
    @ApiModelProperty(value = "是否为厂家制造商")
    @FlagValidator(values = {"0","1"}, message = "厂家状态不正确")
    private Integer factoryStatus;
    @ApiModelProperty(value = "是否进行显示")
    @FlagValidator(values = {"0","1"}, message = "显示状态不正确")
    private Integer showStatus;
    @ApiModelProperty(value = "品牌logo")
    private String logo;
    @ApiModelProperty(value = "品牌大图")
    private String bigPic;
    @ApiModelProperty(value = "品牌故事")
    private String brandStory;
}

