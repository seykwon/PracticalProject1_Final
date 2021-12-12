package com.mycom.myapp.board;

public class BoardVO {
	private int seq;
	private int studentNum;
	private String name;
	private String category;
	private String title;
	private String content;
	private String dueDate;
	private String chatLink;
	private int maxStudent;
	private int cnt;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getChatLink() {
		return chatLink;
	}
	public void setChatLink(String chatLink) {
		this.chatLink = chatLink;
	}
	public int getMaxStudent() {
		return maxStudent;
	}
	public void setMaxStudent(int maxStudent) {
		this.maxStudent = maxStudent;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
