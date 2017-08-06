package activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test.R;

public class MainActivity extends Activity {
	// ---------------------0 视图声明--------------------------
	private TextView mInfoTv;
	private Button mInfoBt;
	private EditText mInfoEt;
	private ImageView mImageView;
	// ---------------------消息传递---------------------------
	private Intent mIntent = new Intent();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		initView();
		initListener();
		
		initText();
		initListener1();
	
	}

	// ----------------------1 视图绑定-------------------------
	private void initView() {
		mImageView = (ImageView) findViewById(R.id.imageview1);
	}

	private void initText() {
		mInfoTv = (TextView) findViewById(R.id.item1);
	}

	// -----------------------2 视图点击事件------------------
	private void initListener() {
		mImageView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				mIntent.setClass(MainActivity.this, DeviceActivity.class);
				startActivity(mIntent);
				// startService(mIntent);
			}
		});
	}
	private void initListener1() {
		mInfoTv.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				mIntent.setClass(MainActivity.this, SecondActivity.class);
				startActivity(mIntent);
				// startService(mIntent);
			}
		});
	}

}