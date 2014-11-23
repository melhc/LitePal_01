package com.example.litepal_01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class News {
	private Introduction introduction;
    private List<Comment>  comList=new ArrayList<Comment>();
    private List<Category> categoryList = new ArrayList<Category>();  
    
	public List<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}

	public List<Comment> getComList() {
		return comList;
	}

	public void setComList(List<Comment> comList) {
		this.comList = comList;
	}

	public Introduction getIntroduction() {
		return introduction;
	}

	public void setIntroduction(Introduction introduction) {
		this.introduction = introduction;
	}

	private int id;

	private String title;

	private String content;

	private Date publishDate;

	private int commentCount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

}
