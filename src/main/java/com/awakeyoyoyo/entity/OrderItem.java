package com.awakeyoyoyo.entity;

public class OrderItem {
    private Integer id;

    private String openId;

    private Long orderNo;

    private String expressSize;

    private String expressName;

    private String expressPhone;

    private String expressPwd;

    private String productMxg;

    public OrderItem(Integer id, String openId, Long orderNo, String expressSize, String expressName, String expressPhone, String expressPwd, String productMxg) {
        this.id = id;
        this.openId = openId;
        this.orderNo = orderNo;
        this.expressSize = expressSize;
        this.expressName = expressName;
        this.expressPhone = expressPhone;
        this.expressPwd = expressPwd;
        this.productMxg = productMxg;
    }

    public OrderItem() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public String getExpressSize() {
        return expressSize;
    }

    public void setExpressSize(String expressSize) {
        this.expressSize = expressSize == null ? null : expressSize.trim();
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName == null ? null : expressName.trim();
    }

    public String getExpressPhone() {
        return expressPhone;
    }

    public void setExpressPhone(String expressPhone) {
        this.expressPhone = expressPhone == null ? null : expressPhone.trim();
    }

    public String getExpressPwd() {
        return expressPwd;
    }

    public void setExpressPwd(String expressPwd) {
        this.expressPwd = expressPwd == null ? null : expressPwd.trim();
    }

    public String getProductMxg() {
        return productMxg;
    }

    public void setProductMxg(String productMxg) {
        this.productMxg = productMxg == null ? null : productMxg.trim();
    }
}