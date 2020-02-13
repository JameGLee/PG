package com.pg.ljh.entity;

import java.util.Date;

/**
 * 图书实体
 */
public class Book {

	private long bid;
	private String bcover;//书籍封面
	private String bname;//书名
	private String bauthor;//作者
	private String roughly;//书籍大致分类id
	private String types;//书籍详细类型id
	private String bbrief;//书籍简介
	private boolean	bstatus;//书籍状态（是否完结）
	private boolean bispay;//是否付费
	private long bwords;//字数
	private Date bupdatetime;//该书籍创建时间
	private Date bcreateTime;//该书籍更新时间
	private long cid;//书籍点击量id
	private Click click;
	private ReadNum readNum;

	public Book(long bid, String bcover, String bname, String bauthor, String roughly, String types, String bbrief, boolean bstatus, boolean bispay, long lid, long bwords, Date bupdatetime, Date bcreateTime, long cid, Click click, ReadNum readNum) {
		this.bid = bid;
		this.bcover = bcover;
		this.bname = bname;
		this.bauthor = bauthor;
		this.roughly = roughly;
		this.types = types;
		this.bbrief = bbrief;
		this.bstatus = bstatus;
		this.bispay = bispay;
		this.bwords = bwords;
		this.bupdatetime = bupdatetime;
		this.bcreateTime = bcreateTime;
		this.cid = cid;
		this.click = click;
		this.readNum = readNum;
	}

	public long getBid() {
		return bid;
	}

	public void setBid(long bid) {
		this.bid = bid;
	}

	public String getBcover() {
		return bcover;
	}

	public void setBcover(String bcover) {
		this.bcover = bcover;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public String getRoughly() {
		return roughly;
	}

	public void setRoughly(String roughly) {
		this.roughly = roughly;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getBbrief() {
		return bbrief;
	}

	public void setBbrief(String bbrief) {
		this.bbrief = bbrief;
	}

	public boolean isBstatus() {
		return bstatus;
	}

	public void setBstatus(boolean bstatus) {
		this.bstatus = bstatus;
	}

	public boolean isBispay() {
		return bispay;
	}

	public void setBispay(boolean bispay) {
		this.bispay = bispay;
	}

	public long getBwords() {
		return bwords;
	}

	public void setBwords(long bwords) {
		this.bwords = bwords;
	}

	public Date getBupdatetime() {
		return bupdatetime;
	}

	public void setBupdatetime(Date bupdatetime) {
		this.bupdatetime = bupdatetime;
	}

	public Date getBcreateTime() {
		return bcreateTime;
	}

	public void setBcreateTime(Date bcreateTime) {
		this.bcreateTime = bcreateTime;
	}

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public Click getClick() {
		return click;
	}

	public void setClick(Click click) {
		this.click = click;
	}

	public ReadNum getReadNum() {
		return readNum;
	}

	public void setReadNum(ReadNum readNum) {
		this.readNum = readNum;
	}

	@Override
	public String toString() {
		return "Book{" +
				"bid=" + bid +
				", bcover='" + bcover + '\'' +
				", bname='" + bname + '\'' +
				", bauthor='" + bauthor + '\'' +
				", roughly='" + roughly + '\'' +
				", types='" + types + '\'' +
				", bbrief='" + bbrief + '\'' +
				", bstatus=" + bstatus +
				", bispay=" + bispay +
				", bwords=" + bwords +
				", bupdatetime=" + bupdatetime +
				", bcreateTime=" + bcreateTime +
				", cid=" + cid +
				", click=" + click +
				", readNum=" + readNum +
				'}';
	}
}
