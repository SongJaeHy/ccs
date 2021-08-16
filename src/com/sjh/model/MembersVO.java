package com.sjh.model;

public class MembersVO {
	private String mid;
	private String mpw;
	private String mname;
	private int mno;
	private int mdeptno;
	private String mphone;
	private String memail;
	

public MembersVO() {
	
}


public MembersVO(String mid, String mpw, String mname, int mno, String mdept, int mdeptno, String mphone,
		String memail) {
	super();
	this.mid = mid;
	this.mpw = mpw;
	this.mname = mname;
	this.mno = mno;
	this.mdeptno = mdeptno;
	this.mphone = mphone;
	this.memail = memail;
}


public String getMid() {
	return mid;
}


public void setMid(String mid) {
	this.mid = mid;
}


public String getMpw() {
	return mpw;
}


public void setMpw(String mpw) {
	this.mpw = mpw;
}


public String getMname() {
	return mname;
}


public void setMname(String mname) {
	this.mname = mname;
}


public int getMno() {
	return mno;
}


public void setMno(int mno) {
	this.mno = mno;
}


public int getMdeptno() {
	return mdeptno;
}


public void setMdeptno(int mdeptno) {
	this.mdeptno = mdeptno;
}


public String getMphone() {
	return mphone;
}


public void setMphone(String mphone) {
	this.mphone = mphone;
}


public String getMemail() {
	return memail;
}


public void setMemail(String memail) {
	this.memail = memail;
}


@Override
public String toString() {
	return "MembersVO [mid=" + mid + ", mpw=" + mpw + ", mname=" + mname + ", mno=" + mno + ", mdeptno=" + mdeptno
			+ ", mphone=" + mphone + ", memail=" + memail + "]";
}

}

