package com.example.mongo_test.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @Description: TODO
 * @Author: liuchang
 * @CreateTime: 2022-08-01  16:51
 */
@Data
@Document(collection = "m_order")
public class Order implements Serializable {

    @Id
    private String id;

    /** 商品uuid **/
    @Field("productUuid")
    private String productUuid;

    /** 商品类型 **/
    @Field("productType")
    private String productType;

    /** 订单用户Uuid **/
    @Field("userUuid")
    private String userUuid;


    /** 订单时间 **/
    @Field("orderTime")
    private LocalDate orderTime;


}
