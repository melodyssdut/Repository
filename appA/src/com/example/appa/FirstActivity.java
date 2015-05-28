package com.example.appa;
import org.w3c.dom.Text;

import com.example.appa.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class FirstActivity extends Activity{

	private TextView text;
	private Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);
		text=(TextView)findViewById(R.id.text);
		btn=(Button)findViewById(R.id.btn);
		text.setText("FirstActivity of appA\n"+"current task is "+this.getTaskId());

	btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);

				startActivity(intent);
			}
		});
	}

}
