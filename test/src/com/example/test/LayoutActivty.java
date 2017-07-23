package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class LayoutActivty extends Activity {
	// ---------------------视图声明--------------------------
	private TextView mInfoTv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_layout);
		initView();
		initListener();
	}

	// ----------------------视图绑定-------------------------
	private void initView() {
		mInfoTv = (TextView) findViewById(R.id.textView1);
	}

	// -----------------------视图点击事件------------------
	private void initListener() {

	}

}