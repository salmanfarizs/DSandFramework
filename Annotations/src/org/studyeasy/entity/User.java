package org.studyeasy.entity;

public class User {
	
	
	private int userid;
	private String executionenv;
	private int noofcases;
	
	public User(int userid, String executionenv,int noofcases) {
		super();
		this.userid = userid;
		this.executionenv = executionenv;
		this.noofcases = noofcases;
		
	}
	
	
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getExecutionenv() {
		return executionenv;
	}
	public void setExecutionenv(String executionenv) {
		this.executionenv = executionenv;
	}
	public int getNoofcases() {
		return noofcases;
	}
	public void setNoofcases(int noofcases) {
		this.noofcases = noofcases;
	}
	
	

}
