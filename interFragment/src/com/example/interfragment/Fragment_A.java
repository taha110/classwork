package com.example.interfragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment_A extends Fragment {

	private View view;
	private Button btn;
	Communicator comm;
	public int counter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.frag_a, container, false);
		return view;
		
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		if (savedInstanceState==null) {
			
		}
		savedInstanceState.getInt("String", 0);

		
		btn = (Button)view.findViewById(R.id.button1);
		
		comm = (Communicator)getActivity();
		
		btn.setOnClickListener(new View.OnClickListener() {
			
			

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter++;
				comm.respond("You Clicked " + counter + " times");
			}
		} );
		

		FragmentManager fm = getFragmentManager();
		Fragment_B f2 = (Fragment_B)fm.findFragmentById(R.id.fragment2);
		
		f2.ChangeText("clicked times  " + counter);
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
		outState.putInt("String", counter);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	
	
}
