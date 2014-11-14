package com.lanyoung.springmvc.domain;

import java.io.Serializable;

public class User implements Serializable {

    /**
	 * @Fields serialVersionUID : 
	 */
	
	private static final long serialVersionUID = 1L;

	private long id;

    private String username;

    private String password;
    
    private Dept dept;

    /**
	 * @return dept
	 */
	public Dept getDept() {
		return dept;
	}

	/**
	 * @param dept 要设置的 dept 
	 */
	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	/* (非 Javadoc) 
	 * <p>Title: toString</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", dept=" + dept + "]";
	}


    
    
    
}
