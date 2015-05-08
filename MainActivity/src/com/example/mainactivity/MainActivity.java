package com.example.mainactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends TraceActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button callButton = (Button) findViewById(R.id.callButton);
		callButton = (Button)findViewById(R.id.callButton);
	}
	
	public void onClick(View v) {
		Intent intent = new Intent(this, SecondActivity.class);
		startActivity(intent);
		
			}

}
