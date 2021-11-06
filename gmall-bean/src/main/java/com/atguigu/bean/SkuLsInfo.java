package com.atguigu.bean;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class SkuLsInfo implements Serializable {

    //skuId=id
    String id;

    BigDecimal price;

    String skuName;

    String catalog3Id;

    String skuDefaultImg;
    //es热度值
    Long hotScore=0L;

    List<SkuLsAttrValue> skuAttrValueList;
}
