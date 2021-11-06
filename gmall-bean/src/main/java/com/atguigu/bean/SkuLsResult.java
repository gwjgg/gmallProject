package com.atguigu.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/*
接收分类条件查询出的sku商品List的实体类
 */
@Data
public class SkuLsResult implements Serializable {

    List<SkuLsInfo> skuLsInfoList;

    //分页数据
    long total;

    long totalPages;

    //平台属性Id用来在sku_attr_value表中查询出平台属性
    List<String> attrValueIdList;
}
