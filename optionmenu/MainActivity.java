package com.example.optionmenu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView fimage;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.omenu, menu);
		fimage = (ImageView)findViewById(R.id.imageView1);
		return true;
	}

	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) 
	{
		switch(item.getItemId())
		{
		case R.id.germany:
			fimage.setImageResource(R.drawable.germany);
			break;
		case R.id.indian:
			fimage.setImageResource(R.drawable.indian);
			break;
		case R.id.sweden:
			fimage.setImageResource(R.drawable.sweden);
			break;
		case R.id.uk:
			fimage.setImageResource(R.drawable.uk);
			break;
		}
		return super.onMenuItemSelected(featureId, item);
	}

}
