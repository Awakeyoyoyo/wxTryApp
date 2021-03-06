package com.awakeyoyoyo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Long orderNo;

    private Integer shippingId;

    private Integer status;

    private Date acceptTime;

    private Date endTime;

    private Date createTime;

    private Date successTime;

    private String openId;

    private Date overTime;

    private String duserId;

    private BigDecimal price;

    private String orderMxg;

    private String takeAddress;

    private String orderType;

    public Order(Long orderNo, Integer shippingId, Integer status, Date acceptTime, Date endTime, Date createTime, Date successTime, String openId, Date overTime, String duserId, BigDecimal price, String orderMxg, String takeAddress, String orderType) {
        this.orderNo = orderNo;
        this.shippingId = shippingId;
        this.status = status;
        this.acceptTime = acceptTime;
        this.endTime = endTime;
        this.createTime = createTime;
        this.successTime = successTime;
        this.openId = openId;
        this.overTime = overTime;
        this.duserId = duserId;
        this.price = price;
        this.orderMxg = orderMxg;
        this.takeAddress = takeAddress;
        this.orderType = orderType;
    }

    public Order() {
        super();
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getShippingId() {
        return shippingId;
    }

    public void setShippingId(Integer shippingId) {
        this.shippingId = shippingId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(Date acceptTime) {
        this.acceptTime = acceptTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Date getOverTime() {
        return overTime;
    }

    public void setOverTime(Date overTime) {
        this.overTime = overTime;
    }

    public String getDuserId() {
        return duserId;
    }

    public void setDuserId(String duserId) {
        this.duserId = duserId == null ? null : duserId.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getOrderMxg() {
        return orderMxg;
    }

    public void setOrderMxg(String orderMxg) {
        this.orderMxg = orderMxg == null ? null : orderMxg.trim();
    }

    public String getTakeAddress() {
        return takeAddress;
    }

    public void setTakeAddress(String takeAddress) {
        this.takeAddress = takeAddress == null ? null : takeAddress.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }
}