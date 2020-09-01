package org.wilis;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class rsjava extends ListActivity {

	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		
		String[] menulokasi = new String[]{"RS Arifian Achmad","RS Eka","RS Eria Bunda","RS Ibnu Sina","RS Jiwa Tampan"};
		
		this.setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menulokasi));
	}
	
	//defenisi untuk handle array di click
	protected void onListItemClick(ListView l,View v,int position,long id)
	{
		super.onListItemClick(l, v, position, id);
		// menangkap string yang click
		Object o = this.getListAdapter().getItem(position);
		String pilihan = o.toString();
		tampilkanpilihan(pilihan);
		
	}

	private void tampilkanpilihan(String pilihan) {
		// TODO Auto-generated method stub
		try 
		{
			Intent i = null;
			if(pilihan.equals("RS Arifian Achmad")) 
			{
			   i = new Intent (this,RsArifin.class);
			}
			if(pilihan.equals("RS Eka")) 
			{
			   i = new Intent (this,RsEka.class);
			}
			if(pilihan.equals("RS Eria Bunda")) 
			{
			   i = new Intent (this,RsEriaBunda.class);
			}
			if(pilihan.equals("RS Ibnu Sina")) 
			{
			   i = new Intent (this,RsIbnu.class);
			}
			if(pilihan.equals("RS Jiwa Tampan"))
			{
				i = new Intent (this,RsjiwaTampan.class);
			}
			
			startActivity(i);
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
}
