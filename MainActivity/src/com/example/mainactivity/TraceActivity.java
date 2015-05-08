package com.example.mainactivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class TraceActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("Trace Activity", "Executed onCreate");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.i("Trace Activity", "Executed onPause");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.i("Trace Activity", "Executed onResume");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.i("Trace Activity", "Executed onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i("Trace Activity", "Executed onDestroy");
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		Log.i("Tracer Activity", "Executed Restore State");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.i("Trace Activity", "Executed Save Sate");
	}

}
