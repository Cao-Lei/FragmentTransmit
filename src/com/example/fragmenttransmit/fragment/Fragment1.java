package com.example.fragmenttransmit.fragment;

import com.example.fragmenttransmit.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Fragment1 extends Fragment {

	private String[] arr = new String[] { "程", "序", "虐", "我", "千", "百", "遍",
			"我", "待", "程", "序", "如", "初", "恋" };
	private ListView lv;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		View view = inflater.inflate(R.layout.fragment1, null);

		lv = (ListView) view.findViewById(R.id.lv);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, arr);
		lv.setAdapter(adapter);

		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub

				String name = arr[arg2];
				// 得到FragmentManager
				FragmentActivity context = getActivity();
				FragmentManager manager = context.getSupportFragmentManager();

				// 调用manager里的findFragmentById
				Fragment2 right = (Fragment2) manager
						.findFragmentById(R.id.fright);
				// 调用setContent方法
				right.setContent(name);
			}
		});
		return view;
	}

}
