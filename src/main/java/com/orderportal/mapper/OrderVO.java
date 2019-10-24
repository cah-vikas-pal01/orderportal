package com.orderportal.mapper;

public class OrderVO {
	
	private long customerId;
	private long itemId;
	private int itemquantity;
	  
	public OrderVO() {
		super();
	}
	
	public OrderVO(long customerId, long itemId, int itemquantity) {
		super();
		this.customerId = customerId;
		this.itemId = itemId;
		this.itemquantity=itemquantity;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public long getItemquantity() {
		return itemquantity;
	}

	public void setItemquantity(int itemquantity) {
		this.itemquantity = itemquantity;
	}
	

}
