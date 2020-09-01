package org.wilis;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class MainUtama extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menuutama);
		
	}
	
	public void onrsClick (View theButton)
	{
		Intent rs=new Intent (this,rsjava.class);
		startActivity(rs);
		
	}
}
