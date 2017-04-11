package com.mahendra.library.models;

import java.io.Serializable;
import java.util.Date;

/** Entity class for 'issues' table
 * @author mahendra shinde
 *
 */
public class Issue implements Serializable {
	
	private Integer issueId;
	private Book book;
	private Member member;
	private Date issueDate;
	private Character status;
	public Integer getIssueId() {
		return issueId;
	}
	public void setIssueId(Integer issueId) {
		this.issueId = issueId;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	
}
