package com.domain;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_customer")
public class Tb_customer {

	@Id
	private Integer cust_id;
	private String cust_name;
	private String phone;
	private String mobile;
	private String email;
	private String fax;
	private String address;
	@Override
	public String toString() {
		return "Tb_customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", phone=" + phone + ", mobile="
				+ mobile + ", email=" + email + ", fax=" + fax + ", address=" + address + "]";
	}
	public Tb_customer() {
		super();
	}
	public Tb_customer(Integer cust_id, String cust_name, String phone, String mobile, String email, String fax,
			String address) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
		this.fax = fax;
		this.address = address;
	}
	public Integer getCust_id() {
		return cust_id;
	}
	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
