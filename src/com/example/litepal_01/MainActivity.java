package com.example.litepal_01;

import java.util.Date;

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
//		���һ����ͨ���
//		News news=new News();
//		news.setTitle("����");
//		news.setContent("�����");
//		news.setPublishDate(new Date());
//		Log.i("TAG", "------------->"+news.getId());
//		news.save();
//		Log.i("TAG", "------------->"+news.getId());
		//�����������
//		Comment comment1 = new Comment();  
//		comment1.setContent("������");  
//		comment1.setPublishDate(new Date());  
//		comment1.save();  
//		Comment comment2 = new Comment();  
//		comment2.setContent("��һ��");  
//		comment2.setPublishDate(new Date());  
//		comment2.save();  
//		News news2 = new News();  
//		news2.getComList().add(comment1);  
//		news2.getComList().add(comment2);  
//		news2.setTitle("�ڶ������ű���");  
//		news2.setContent("�ڶ�����������");  
//		news2.setPublishDate(new Date());  
//		news2.setCommentCount(news2.getComList().size());  
//		news2.save();  
		//ͨ��contentVaules�޸����
//		ContentValues values=new ContentValues();
//		values.put("title", "今日Iphone6发布");
//		DataSupport.update(News.class, values, 1);
		//修改所有数据
//		ContentValues values = new ContentValues();  
//		values.put("title", "今日iPhone6 Plus发布");  
//		DataSupport.updateAll(News.class, values, "title = ?", "今日iPhone6发布");
//		ContentValues values2 = new ContentValues();  
//		values2.put("title", "今日iPhone6 Plus发布");  
//		DataSupport.updateAll(News.class, values2, "title = ? and commentcount > ?", "今日iPhone6发布", "0");  
//		News updateNews = new News();  
//		updateNews.setTitle("今日iPhone6发布");  
//		updateNews.update(2);  
//		News updateNews2 = new News();  
//		updateNews2.setTitle("今日iPhone6发布");  
//		updateNews2.updateAll("title = ? and commentcount > ?", "今日iPhone6发布", "0");  
		News updateNews = new News();  
		updateNews.setToDefault("no comment");  
		updateNews.updateAll(); 
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
