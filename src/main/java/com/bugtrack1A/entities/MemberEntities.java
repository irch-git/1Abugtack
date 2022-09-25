package com.bugtrack1A.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberEntities {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long memberId;
	
	private String memberFirstName;
	private String memberLastName;
	private String memberEmail;
	private String memberTitle;
	
	public MemberEntities() {
		
	}
	
	public MemberEntities(String memberFirstName, String memberLastName, String memberEmail, String memberTitle) {
		super();
		this.memberFirstName = memberFirstName;
		this.memberLastName = memberLastName;
		this.memberEmail = memberEmail;
		this.memberTitle = memberTitle;
	}
	
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public String getMemberFirstName() {
		return memberFirstName;
	}
	public void setMemberFirstName(String memberFirstName) {
		this.memberFirstName = memberFirstName;
	}
	public String getMemberLastName() {
		return memberLastName;
	}
	public void setMemberLastName(String memberLastName) {
		this.memberLastName = memberLastName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberTitle() {
		return memberTitle;
	}
	public void setMemberTitle(String memberTitle) {
		this.memberTitle = memberTitle;
	}
	
	
}
