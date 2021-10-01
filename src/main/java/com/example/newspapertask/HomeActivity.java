package com.example.newspapertask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    ListView news ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        news = (ListView) findViewById(R.id.list);
        List<News> newsList = new ArrayList<News>();

        int [] newsImages = {R.drawable.new0 , R.drawable.new1,R.drawable.new2,
                R.drawable.new3,R.drawable.new4,R.drawable.new5,R.drawable.new6};

        int [] newsIntros = {R.string.intro0,R.string.intro1,R.string.intro2,
                R.string.intro3,R.string.intro4,R.string.intro5,R.string.intro6};

        int [] newsAuthor = {R.string.author0,R.string.author1,R.string.author2,
                R.string.author3,R.string.author4,R.string.author5,R.string.author6};

        int [] newsDate = {R.string.date_time0,R.string.date_time1,R.string.date_time2,
                R.string.date_time3,R.string.date_time4,R.string.date_time5,R.string.date_time6};

        for (int i = 0 ; i<newsImages.length ; i++){
            newsList.add(new News(newsImages[i],newsIntros[i],newsAuthor[i],newsDate[i]));
        }
        NewsAdapter adapter = new NewsAdapter(newsList,HomeActivity.this);
        news.setAdapter(adapter);
        news.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(HomeActivity.this , NewsActivity.class);
                int newPos = position;
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });

    }

}
