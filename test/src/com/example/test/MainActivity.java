package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	// ---------------------视图声明--------------------------
	private TextView mInfoTv;
	private Button mInfoBt;
	private EditText mInfoEt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_layout);
//		initView();
//		initListener();
	}

	// ----------------------视图绑定-------------------------
	private void initView() {
		mInfoTv = (TextView) findViewById(R.id.textView1);
		mInfoBt = (Button) findViewById(R.id.button1);
		mInfoEt = (EditText) findViewById(R.id.editText1);
	}

	// -----------------------视图点击事件------------------
	private void initListener() {
		mInfoBt.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String info = mInfoEt.getText().toString();//获取编辑框文本
				mInfoTv.setText(info);//设置文本内容
			}
		});
	}

}