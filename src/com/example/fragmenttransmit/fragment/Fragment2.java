package com.example.fragmenttransmit.fragment;

import com.example.fragmenttransmit.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment{
	
	private TextView fragment2;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment2, null);
		
		fragment2 = (TextView) view.findViewById(R.id.fragment2);
		return view;
	}
	public void setContent(String text){
		
		fragment2.setText(text);
	}

}
