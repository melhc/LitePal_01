package com.example.litepal_01;

import java.util.ArrayList;
import java.util.List;

public class Category {
	private int id;

	private String name;
	private List<News> news = new ArrayList<News>();

	public List<News> getNews() {
		return news;
	}

	public void setNews(List<News> news) {
		this.news = news;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
