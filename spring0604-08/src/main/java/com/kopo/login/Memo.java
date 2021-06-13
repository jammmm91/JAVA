package com.kopo.login;

public class Memo {
	int idx;
	String title;
	String content;
	String created;
	String updated;
	int userIdx;
	
	Memo() {
		
	}
	
	Memo(String title, String content, String created, String updated, int userIdx) {
		this.title = title;
		this.content = content;
		this.created = created;
		this.updated = updated;
		this.userIdx = userIdx;
	}
	
	Memo(int idx, String new_title, String new_content, String first_created, String now) {
		this.idx = idx;
		this.title = new_title;
		this.content = new_content;
		this.created = first_created;
		this.updated = now;
	}
}
