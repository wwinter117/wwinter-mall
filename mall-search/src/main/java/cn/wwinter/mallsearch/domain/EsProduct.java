package cn.wwinter.mallsearch.domain;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Description:
 * @Date: 2023/12/16
 * @Author: zhangdd
 */
@Data
@Document(indexName = "pms_product")
public class EsProduct implements Serializable {
    @Serial
    private static final long serialVersionUID = 3031920712508302882L;

    private Long id;
    private String productSn;
    private Long brandId;
    private String brandName;
    private Long productCategoryId;
    private String productCategoryName;
    private String pic;
    private String name;
    private String subTitle;
    private BigDecimal price;
    private Integer sale;
    private Integer newStatus;
    private Integer recommendStatus;
    private Integer stock;
    private Integer promotionType;
    private Integer sort;
    private List<EsProductAttrValue> attrValueList;

    @Data
    static class EsProductAttrValue {
        private Long id;
        private String value;
    }

}
