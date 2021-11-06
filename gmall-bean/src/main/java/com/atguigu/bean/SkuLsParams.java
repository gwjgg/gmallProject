package com.atguigu.bean;

import lombok.Data;

import java.io.Serializable;

/*
接收用户在首页搜索条件的参数实体类
 */
@Data
public class SkuLsParams implements Serializable {

    //skuName
    String  keyword;

    String catalog3Id;

    String[] valueId;

    //分页条件
    int pageNo=1;

    int pageSize=20;
}
