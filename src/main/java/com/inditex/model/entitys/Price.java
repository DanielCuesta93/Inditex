package com.inditex.model.entitys;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PRICES")
public class Price implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name="BRAND_ID")
	private Integer brand_id;
	@Column(name="START_DATE")
	private LocalDateTime  start_date;
	@Column(name="END_DATE")
	private LocalDateTime  end_date;
	@Column(name="PRICE_LIT")
	private Integer price_list;
	@Column(name="PRODUCT_ID")
	private Integer product_id;
	@Column(name="PRIORITY")
	private Integer priority;
	@Column(name="PRICE")
	private BigDecimal price;
	@Column(name="CURR")
	private String curr;
	
	
	public Integer getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(Integer brand_id) {
		this.brand_id = brand_id;
	}
	public LocalDateTime getStart_date() {
		return start_date;
	}
	public void setStart_date(LocalDateTime start_date) {
		this.start_date = start_date;
	}
	public LocalDateTime getEnd_date() {
		return end_date;
	}
	public void setEnd_date(LocalDateTime end_date) {
		this.end_date = end_date;
	}
	public Integer getPrice_list() {
		return price_list;
	}
	public void setPrice_list(Integer price_list) {
		this.price_list = price_list;
	}
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getCurr() {
		return curr;
	}
	public void setCurr(String curr) {
		this.curr = curr;
	}
	
}
