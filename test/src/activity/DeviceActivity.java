package activity;

import model.FirstDevice;

import com.example.test.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DeviceActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_device);
		initView();
		initListener();
		initData();
	}
	// ----------------------视图绑定-------------------------
	private void initView() {
		// mInfoTv = (TextView) findViewById(R.id.textView1);
	}
	// -----------------------视图点击事件------------------
	private void initListener() {

	}

	private void initData() {
		// TODO 自动生成的方法存根

	}
	
}
