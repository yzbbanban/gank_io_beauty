package com.example.gank_io_beauty;


import java.io.IOException;
import java.io.InputStream;

import com.example.gank_io_beauty.ui.TouchImageView;
import com.example.gank_io_beauty.util.HttpUtil;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.Menu;
import android.widget.GridView;

public class MainActivity extends Activity {
	private TouchImageView iv;
	private GridView gv;
	private String url="http://gank.io/api/data/%E7%A6%8F%E5%88%A9/10/1";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		initData();
	}
	private void initData() {
		try {
			
			InputStream is=HttpUtil.get(url);
			String json=HttpUtil.isTOString(is);
			Log.i("supergirl", json);
			
			
			//Bitmap bitmap=BitmapFactory.decodeStream(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	private void initView() {
		iv=(TouchImageView) findViewById(R.id.iv_img);
		gv=(GridView) findViewById(R.id.gv_img);
		
	}

	

}
