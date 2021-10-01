package com.example.newspapertask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsAdapter extends BaseAdapter {
    List<News> list;
    Context context;
    public NewsAdapter(List<News> list , Context context){
        this.list = list ;
        this.context = context;
    }
    @Override
    public int getCount() {
        return list.size() ;
    }

    @Override
    public News getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null ){
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView =  inflater.inflate(R.layout.item_layout,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }
        News item = getItem(position);
        holder.newsImg.setImageResource(item.getNewsImage());
        holder.newsIntro.setText(item.getNewsIntro());
        holder.newsAuthor.setText(item.getNewsAuthor());
        holder.newsDate.setText(item.getNewsDate());
        return convertView;
    }
    public class ViewHolder {
        ImageView newsImg ;
        TextView newsIntro;
        TextView newsAuthor;
        TextView newsDate;
        public ViewHolder(View view){
            newsImg = view.findViewById(R.id.news_img);
            newsIntro = view.findViewById(R.id.news_brief);
            newsAuthor = view.findViewById(R.id.author);
            newsDate = view.findViewById(R.id.date_time);
        }
    }
}