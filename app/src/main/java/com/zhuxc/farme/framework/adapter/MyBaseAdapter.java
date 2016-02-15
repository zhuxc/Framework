package com.zhuxc.farme.framework.adapter;

import java.util.List;


import android.content.Context;
import android.widget.BaseAdapter;

/**
 * 抽象Adapter基类
 * @ClassName: MyBaseAdapter 
 * @Description: TODO
 * @author zhuxc
 * @date modify by 2015-7-6 上午9:17:50 
 * 
 * @param <T>
 * @param <Q>
 */
public abstract class MyBaseAdapter<T, Q> extends BaseAdapter {

	public Context context;
	public List<T> list;//
	public Q view; // 这里不一定是ListView,比如GridView,CustomListView


	public MyBaseAdapter(Context context, List<T> list, Q view) {
		this.context = context;
		this.list = list;
		this.view = view;
	}

	public MyBaseAdapter(Context context, List<T> list) {
		this.context = context;
		this.list = list;
		
	}

	@Override
	public int getCount() {
		if(null==list){
			return 0;
		}
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	


}
