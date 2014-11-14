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
    
public class Address {
	private String tel;
	private String zoneCode;
	/**
	 * @return tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * @param tel 要设置的 tel 
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * @return zoneCode
	 */
	public String getZoneCode() {
		return zoneCode;
	}
	/**
	 * @param zoneCode 要设置的 zoneCode 
	 */
	public void setZoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
	}
	/* (非 Javadoc) 
	 * <p>Title: toString</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "Address [tel=" + tel + ", zoneCode=" + zoneCode + "]";
	}
	
	

}
  