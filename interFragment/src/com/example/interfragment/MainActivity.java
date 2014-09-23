package com.example.interfragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity implements Communicator{

	private FragmentManager fm;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public void respond(String data) {
		// TODO Auto-generated method stub
		 fm = getFragmentManager();
		Fragment_B f2 = (Fragment_B)fm.findFragmentById(R.id.fragment2);
		f2.ChangeText(data);
		
	}
	
	
	
}
