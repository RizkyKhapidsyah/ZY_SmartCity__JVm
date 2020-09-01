package org.wilis;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class RsIbnu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ibnusina);
		
		WebView browser = (WebView) findViewById (R.id.ibnusina);
		browser.getSettings().setJavaScriptEnabled(true);
		browser.loadUrl("file:///android_asset/RsIbnusina.html");
	}
}
