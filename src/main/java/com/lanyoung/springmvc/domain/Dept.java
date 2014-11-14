/*   
 * Copyright (c) 2013-2023 LanYoung tech co., LTD. All Rights Reserved.   
 *   
 * This software is the confidential and proprietary information of   
 * LanYoung tech. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with LanYoung tech.   
 *   
 */     
package com.lanyoung.springmvc.domain;    
    
public class Dept {
	private Long id;
	private String deptName;
	private Address address;
	/**
	 * @return id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id 要设置的 id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return deptName
	 */
	public String getDeptName() {
		return deptName;
	}
	/**
	 * @param deptName 要设置的 deptName 
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	/**
	 * @return address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address 要设置的 address 
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/* (非 Javadoc) 
	 * <p>Title: toString</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "Dept [id=" + id + ", deptName=" + deptName + ", address=" + address + "]";
	}

	

}
  