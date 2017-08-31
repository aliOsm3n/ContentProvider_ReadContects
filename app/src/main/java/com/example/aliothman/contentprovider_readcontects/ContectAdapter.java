package com.example.aliothman.contentprovider_readcontects;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by AliOthman on 8/30/2017.
 */

public class ContectAdapter extends BaseAdapter {

     public  ArrayList<ContectItems>list ;
    Context context;

    public ContectAdapter(ArrayList<ContectItems> list , Context context) {
        this.context=context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position , View view, ViewGroup viewGroup) {
        LayoutInflater  layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = layoutInflater.inflate(R.layout.ticket , null);

        ContectItems s= list.get(position);
        TextView textView2 = (TextView)v.findViewById(R.id.Nametv);
        textView2.setText(s.name);

        TextView textView3 = (TextView)v.findViewById(R.id.Numbertv);
        textView3.setText(s.phone);
        return v;
    }
}

