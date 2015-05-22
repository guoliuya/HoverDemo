package com.example.hoverdemo;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Paint;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnHoverListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
private Button bt;
private TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		/*
		 * textView.getPaint().setFlags(Paint. UNDERLINE_TEXT_FLAG ); //下划线

          textView.getPaint().setAntiAlias(true);//抗锯齿

          textview.getPaint().setFlags(Paint. STRIKE_THRU_TEXT_FLAG); //中划线

          setFlags(Paint. STRIKE_THRU_TEXT_FLAG|Paint.ANTI_ALIAS_FLAG);  // 设置中划线并加清晰 

          textView.getPaint().setFlags(0);  // 取消设置的的划线
		 */
		
		
		//hahahahaha
		bt=(Button) findViewById(R.id.bt);
		tv=(TextView) findViewById(R.id.tv);
		tv.getPaint().setFlags(Paint. STRIKE_THRU_TEXT_FLAG);
		bt.setText(Html.fromHtml("<u>"+"星星的猫"+"</u>"));
		bt.setOnHoverListener(new OnHoverListener() {
			
			@Override
			public boolean onHover(View arg0, MotionEvent event) {
				// TODO Auto-generated method stub
				 int what = event.getAction();  
	                switch(what){  
	                 case MotionEvent.ACTION_HOVER_ENTER:  //鼠标进入view  
	                    Log.e("ACTION_HOVER_ENTER", "鼠标进入view "); 
	                    Toast.makeText(MainActivity.this, "鼠标进入view", Toast.LENGTH_SHORT).show();
	                     break;  
	                 case MotionEvent.ACTION_HOVER_MOVE:  //鼠标在view上  
	                	 Log.e("ACTION_HOVER_MOVE", "鼠标在view上 "); 
	                	 Toast.makeText(MainActivity.this, "鼠标在view上", Toast.LENGTH_SHORT).show();
	                     break;  
	                 case MotionEvent.ACTION_HOVER_EXIT:  //鼠标离开view  
	                	 Log.e("ACTION_HOVER_EXIT", "鼠标离开view   ");  
	                	 Toast.makeText(MainActivity.this, "鼠标离开view", Toast.LENGTH_SHORT).show();
	                     break;  
	                }  
	                return false; 
			}
		});
	}

	

}
