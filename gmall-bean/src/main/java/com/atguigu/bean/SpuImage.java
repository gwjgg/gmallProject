package com.atguigu.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class SpuImage implements Serializable{

    @Column
    @Id
    private String id;
    @Column
    private String spuId;
    @Column
    private String imgName = "黑背.jpg";
    @Column
    private String imgUrl = "http://file.service.com/group1/M00/00/00/wKhDyVrqwyqATxUEAACgV5vFD-g579.jpg";
}
