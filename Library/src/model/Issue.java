package model;

import java.time.LocalDate;

public class Issue {
	private int isid = 1;
	private int bid;
	private int sid;
	private LocalDate isDate, expDate, actRetDate;
	public Issue(int bid, int sid) {
		super();
		//this.isid = isid;
		this.bid = bid;
		this.sid = sid;
		this.isDate = LocalDate.now();
		this.expDate = LocalDate.now().plusDays(7);
	}
	public int getIsid() {
		return isid;
	}
	public void setIsid(int isid) {
		this.isid = isid;
	}
	@Override
	public String toString() {
		return "Issue [isid=" + isid + ", bid=" + bid + ", sid=" + sid + ", isDate=" + isDate + ", expDate=" + expDate
				+ ", actRetDate=" + actRetDate + "]";
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public LocalDate getIsDate() {
		return isDate;
	}
	public void setIsDate(LocalDate isDate) {
		this.isDate = isDate;
	}
	public LocalDate getExpDate() {
		return expDate;
	}
	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	public LocalDate getActRetDate() {
		return actRetDate;
	}
	public void setActRetDate(LocalDate actRetDate) {
		this.actRetDate = actRetDate;
	}
	
}
