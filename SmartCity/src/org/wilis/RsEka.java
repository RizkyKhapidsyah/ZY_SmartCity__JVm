package org.wilis;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class RsEka extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ekahospital);
		
		WebView browser = (WebView) findViewById (R.id.ekahospital);
		browser.getSettings().setJavaScriptEnabled(true);
		browser.loadUrl("file:///android_asset/RsEka.html");
	}
}
