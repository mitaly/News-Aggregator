package com.mit.newsaggregator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Mitaly on 7/3/2016.
 */
public class NewsAdapter extends ArrayAdapter<NewsObjects> {
    Context cxt;
    int res;
    ArrayList<NewsObjects> list;
    public NewsAdapter(Context context, int resource, ArrayList<NewsObjects> objects) {
        super(context, resource, objects);
        cxt=context;
        res=resource;
        list=objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item;

        item= LayoutInflater.from(cxt).inflate(res,parent,false);
        ImageView icon=(ImageView)item.findViewById(R.id.imageViewIcon);
        TextView language=(TextView)item.findViewById(R.id.textViewlanguage);
        TextView newspaper=(TextView)item.findViewById(R.id.textViewNewspaper);

        NewsObjects ob=list.get(position);
        icon.setBackgroundResource(ob.getIcon());
        language.setText(ob.getLanguage());
        newspaper.setText(ob.getNewspaper());

        return item;

    }
}
