package com.example.interfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_B extends Fragment {
	private View view;
	private TextView tv;
	String data;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.frag_b, container, false);
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		tv = (TextView)view.findViewById(R.id.textView1);
		if (savedInstanceState==null) {
			
		}else{
		String data = 	savedInstanceState.getString("String");
			tv.setText(data);
		}
	}


	@Override
	public void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
		
		outState.putString("String", data);
	}

	public void ChangeText(String d){
		this.data=d;
		tv.setText(" yuo clicked " + d + " times ");
	}
}
