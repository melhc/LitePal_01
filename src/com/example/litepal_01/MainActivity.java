package com.example.litepal_01;

import java.util.Date;

import org.litepal.tablemanager.Connector;

import android.os.Bundle;
import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		SQLiteDatabase db = Connector.getDatabase();  
		
		News news=new News();
		news.setTitle("新闻");
		news.setContent("林泓成");
		news.setPublishDate(new Date());
		Log.i("TAG", "------------->"+news.getId());
		news.save();
		Log.i("TAG", "------------->"+news.getId());
		Comment comment1 = new Comment();  
		comment1.setContent("好评！");  
		comment1.setPublishDate(new Date());  
		comment1.save();  
		Comment comment2 = new Comment();  
		comment2.setContent("赞一个");  
		comment2.setPublishDate(new Date());  
		comment2.save();  
		News news2 = new News();  
		news2.getComList().add(comment1);  
		news2.getComList().add(comment2);  
		news2.setTitle("第二条新闻标题");  
		news2.setContent("第二条新闻内容");  
		news2.setPublishDate(new Date());  
		news2.setCommentCount(news2.getComList().size());  
		news2.save();  
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
