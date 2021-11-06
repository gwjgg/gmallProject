package com.atguigu.bean;

import lombok.Data;
import sun.java2d.loops.GeneralRenderer;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
public class BaseAttrInfo implements Serializable {
    @Id
    @Column
    //自动生成主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String attrName;
    @Column
    private String catalog3Id;
    //不是表中的数据
    @Transient
    private List<BaseAttrValue> attrValueList;
}
