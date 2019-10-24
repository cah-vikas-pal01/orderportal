package com.orderportal.mapper;
import java.io.Serializable;
import java.util.Date;

public class Search implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long customerId;
	private Date fromDate;
	private Date toDate;
	
	public Search() {
		super();
	
	}
	
	public Search(Long customerId, Date fromDate, Date toDate) {
		super();
		this.customerId = customerId;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	

}
