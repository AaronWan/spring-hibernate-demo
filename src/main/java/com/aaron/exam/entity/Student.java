package com.aaron.exam.entity;

import java.util.Date;

/**
 * 
 * @author Aaron
 * @time 下午10:55:05
 * @TODO
 */
public class Student {
	/**
	 * ID 
	 */
	private String id;
	/**
	 *  身份证
	 */
	private String idCard;
	private String name;
	private int sex;
	/**
	 * 登记时间
	 */
	private Date inTime;
	/**
	 * 最近一次登入时间
	 */
	private Date lastTime;
	/**
	 * 是否在线
	 */
	private boolean isOnline;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public Date getInTime() {
		return inTime;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

}
