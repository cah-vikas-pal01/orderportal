package com.orderportal.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_detail")
public class Order 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_id")
	private Long orderId;
	
	@Column(name="customer_id")
	private Long customerId;
	
	@Column(name="item_id")
	private Long itemId;
	
	@Column(name="item_quantity")
	private Long itemQuantity;
	
	@Column(name="total_price")
	private Long totalPrice;
	
	@Column(name="date")
	private Date date =new Date();

	public Order() {
		super();
	}
	
	public Order(Long orderId, Long customerId, Long itemId, Long itemQuantity, Long totalPrice, Date date) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.itemId = itemId;
		this.itemQuantity = itemQuantity;
		this.totalPrice = totalPrice;
		this.date = date;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	public Long getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(Long itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
