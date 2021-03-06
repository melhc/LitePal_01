package com.example.litepal_01;

import java.util.Date;
import java.util.List;

import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		SQLiteDatabase db = Connector.getDatabase();
		// ���һ����ͨ���
		// News news=new News();
		// news.setTitle("����");
		// news.setContent("�����");
		// news.setPublishDate(new Date());
		// Log.i("TAG", "------------->"+news.getId());
		// news.save();
		// Log.i("TAG", "------------->"+news.getId());
		// �����������
		// Comment comment1 = new Comment();
		// comment1.setContent("������");
		// comment1.setPublishDate(new Date());
		// comment1.save();
		// Comment comment2 = new Comment();
		// comment2.setContent("��һ��");
		// comment2.setPublishDate(new Date());
		// comment2.save();
		// News news2 = new News();
		// news2.getComList().add(comment1);
		// news2.getComList().add(comment2);
		// news2.setTitle("�ڶ������ű���");
		// news2.setContent("�ڶ�����������");
		// news2.setPublishDate(new Date());
		// news2.setCommentCount(news2.getComList().size());
		// news2.save();
		// ͨ��contentVaules�޸����
		// ContentValues values=new ContentValues();
		// values.put("title", "今日Iphone6发布");
		// DataSupport.update(News.class, values, 1);
		// 修改所有数据
		// ContentValues values = new ContentValues();
		// values.put("title", "今日iPhone6 Plus发布");
		// DataSupport.updateAll(News.class, values, "title = ?",
		// "今日iPhone6发布");
		// ContentValues values2 = new ContentValues();
		// values2.put("title", "今日iPhone6 Plus发布");
		// DataSupport.updateAll(News.class, values2,
		// "title = ? and commentcount > ?", "今日iPhone6发布", "0");
		// News updateNews = new News();
		// updateNews.setTitle("今日iPhone6发布");
		// updateNews.update(2);
		// News updateNews2 = new News();
		// updateNews2.setTitle("今日iPhone6发布");
		// updateNews2.updateAll("title = ? and commentcount > ?",
		// "今日iPhone6发布", "0");
		// change default value
		/*
		 * News updateNews = new News();
		 * updateNews.setToDefault("commentCount"); updateNews.updateAll();
		 */
		// 删除数据
		// DataSupport.delete(News.class, 3);
		DataSupport.deleteAll(News.class, "title = ? and commentcount = ?",
				"新闻", "0");
		// DataSupport.deleteAll(News.class);
		// 只有News对象的数据持久化了也就是save过了，才能删除
		// query id 1 date
		// News news = DataSupport.find(News.class, 1);
		// News firstNews = DataSupport.findFirst(News.class);
		// News lastNews=DataSupport.findLast(News.class);
		// List<News> newsList = DataSupport.findAll(News.class, 1, 3, 5, 7);
		// List<News> newsList = DataSupport.findAll(News.class, 1);
		//
		// Log.i("TAG", "-------------->"+newsList.get(0).getTitle());
		// Log.i("TAG", "-------------->"+newsList.get(1).getTitle());
		// Log.i("TAG", "-------------->"+newsList.get(2).getTitle());
//		List<News> newsList = DataSupport.select("title", "content")
//				.where("commentcount > ?", "0").order("publishdate desc")
//				.limit(10).find(News.class);
		//从第11条-20条数据
		List<News> newsList = DataSupport.select("title", "content")
				.where("commentcount > ?", "0").order("publishdate desc")
				.limit(10).offset(10).find(News.class);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();

	}

}
