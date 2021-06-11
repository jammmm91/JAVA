package com.kopo.memoprogram;

public class Memo {
	int idx;
	String title;
	String content;
	String created;
	String updated;
	String id;
	String pwd;
	
	Memo() {
		
	}
	
	Memo(String new_title, String new_content, String first_created, String now, String userId, String userPwd) {
		this.title = new_title;
		this.content = new_content;
		this.created = first_created;
		this.updated = now;
		this.id = userId;
		this.pwd = userPwd;
	}
	
	Memo(int idx, String new_title, String new_content, String first_created, String now, String userId, String userPwd) {
		this.idx = idx;
		this.title = new_title;
		this.content = new_content;
		this.created = first_created;
		this.updated = now;
		this.id = userId;
		this.pwd = userPwd;
	}
}
