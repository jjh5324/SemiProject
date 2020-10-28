package com.lec.beans;

public class CustomerDTO {

	int cus_num;
	String cus_name;
	String cus_pw;
	String cus_id;
	String cus_email;
	String cus_phone;
	int cus_money;
	
	
	
	public int getCus_num() {
		return cus_num;
	}
	public void setCus_num(int cus_num) {
		this.cus_num = cus_num;
	}
	public String getCus_name() {
		return cus_name;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	public String getCus_pw() {
		return cus_pw;
	}
	public void setCus_pw(String cus_pw) {
		this.cus_pw = cus_pw;
	}
	public String getCus_id() {
		return cus_id;
	}
	public void setCus_id(String cus_id) {
		this.cus_id = cus_id;
	}
	public String getCus_email() {
		return cus_email;
	}
	public void setCus_email(String cus_email) {
		this.cus_email = cus_email;
	}
	public String getCus_phone() {
		return cus_phone;
	}
	public void setCus_phone(String cus_phone) {
		this.cus_phone = cus_phone;
	}
	public int getCus_money() {
		return cus_money;
	}
	public void setCus_money(int cus_money) {
		this.cus_money = cus_money;
	}
	
	
	@Override
	public String toString() {
		return "CustomerDTO [cus_num=" + cus_num + ", cus_name=" + cus_name + ", cus_pw=" + cus_pw + ", cus_id="
				+ cus_id + ", cus_email=" + cus_email + ", cus_phone=" + cus_phone + ", cus_money=" + cus_money + "]";
	}
	
	
	
}
