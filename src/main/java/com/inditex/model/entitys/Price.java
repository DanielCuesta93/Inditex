package com.inditex.model.entitys;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="prices")
public class Price implements Serializable{

	@Column(name="BRAND_ID")
	private Long brand_id;
	@Column(name="START_DATE")
	private Timestamp start_date;
	@Column(name="END_DATE")
	private Timestamp end_date;
	@Column(name="PRICE_LIT")
	private Integer price_list;
	@Column(name="PRODUCT_ID")
	private Long product_id;
	@Column(name="PRIORITY")
	private Integer priority;
	@Column(name="PRICE")
	private Double price;
	@Column(name="CURR")
	private String curr;
	
	
	public Long getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(Long brand_id) {
		this.brand_id = brand_id;
	}
	public Timestamp getStart_date() {
		return start_date;
	}
	public void setStart_date(Timestamp start_date) {
		this.start_date = start_date;
	}
	public Timestamp getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Timestamp end_date) {
		this.end_date = end_date;
	}
	public Integer getPrice_list() {
		return price_list;
	}
	public void setPrice_list(Integer price_list) {
		this.price_list = price_list;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCurr() {
		return curr;
	}
	public void setCurr(String curr) {
		this.curr = curr;
	}
	
}
