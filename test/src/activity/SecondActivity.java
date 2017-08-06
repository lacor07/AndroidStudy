package activity;

import com.example.test.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

public class SecondActivity extends Activity {
    private ListView mListView;
    private ImageView mImageView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		initView();
	}
	
	private void initView() {
		mListView = (ListView)findViewById(R.id.listview);
		//mImageView = (ImageView) findViewById(R.id.info1);
	}
	
	@Override
	protected void onDestroy() {
		// TODO 自动生成的方法存根
		super.onDestroy();
		
	}
}
