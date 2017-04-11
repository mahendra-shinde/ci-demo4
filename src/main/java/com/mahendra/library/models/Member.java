package com.mahendra.library.models;

import java.io.Serializable;

/** Entity class for 'members' table
 * @author mahendra shinde
 *
 */
public class Member implements Serializable {
	
	public Member(Integer memberId, String name, String phone, Character status) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.phone = phone;
		this.status = status;
	}
	private Integer memberId;
	private String name;
	private String phone;
	private Character status;
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	
	
}
