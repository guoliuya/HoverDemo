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
		 * textView.getPaint().setFlags(Paint. UNDERLINE_TEXT_FLAG ); //�»���

          textView.getPaint().setAntiAlias(true);//�����

          textview.getPaint().setFlags(Paint. STRIKE_THRU_TEXT_FLAG); //�л���

          setFlags(Paint. STRIKE_THRU_TEXT_FLAG|Paint.ANTI_ALIAS_FLAG);  // �����л��߲������� 

          textView.getPaint().setFlags(0);  // ȡ�����õĵĻ���
		 */
		
		
		//hahahahaha
		bt=(Button) findViewById(R.id.bt);
		tv=(TextView) findViewById(R.id.tv);
		tv.getPaint().setFlags(Paint. STRIKE_THRU_TEXT_FLAG);
		bt.setText(Html.fromHtml("<u>"+"���ǵ�è"+"</u>"));
		bt.setOnHoverListener(new OnHoverListener() {
			
			@Override
			public boolean onHover(View arg0, MotionEvent event) {
				// TODO Auto-generated method stub
				 int what = event.getAction();  
	                switch(what){  
	                 case MotionEvent.ACTION_HOVER_ENTER:  //������view  
	                    Log.e("ACTION_HOVER_ENTER", "������view "); 
	                    Toast.makeText(MainActivity.this, "������view", Toast.LENGTH_SHORT).show();
	                     break;  
	                 case MotionEvent.ACTION_HOVER_MOVE:  //�����view��  
	                	 Log.e("ACTION_HOVER_MOVE", "�����view�� "); 
	                	 Toast.makeText(MainActivity.this, "�����view��", Toast.LENGTH_SHORT).show();
	                     break;  
	                 case MotionEvent.ACTION_HOVER_EXIT:  //����뿪view  
	                	 Log.e("ACTION_HOVER_EXIT", "����뿪view   ");  
	                	 Toast.makeText(MainActivity.this, "����뿪view", Toast.LENGTH_SHORT).show();
	                     break;  
	                }  
	                return false; 
			}
		});
	}

	

}
