package com.orderportal.entityVO;


public class ItemVO {
	
	private long itemId;
	private String itemName;
	private int itemPrice;
	
	public ItemVO() {
		super();
	}
	
	public ItemVO(long itemId, String itemName, int itemPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

}
