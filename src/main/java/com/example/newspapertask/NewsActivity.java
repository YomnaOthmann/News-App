package com.example.newspapertask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {
    ImageView newsImg;
    TextView newsAuthor , newsIntro , newsDate , newsContent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        newsImg = findViewById(R.id.news_img);
        newsIntro = findViewById(R.id.intro);
        newsDate = findViewById(R.id.date_time);
        newsAuthor = findViewById(R.id.author);
        newsContent = findViewById(R.id.content);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            int position = (int) bundle.get("position");
            switch (position) {
                case 0: {
                    setContentView(R.layout.news_layout);
                    break;
                }
                case 1: {
                    setContentView(R.layout.news_layout2);
                    break;
                }
                case 2: {
                    setContentView(R.layout.news_layout3);
                    break;
                }
                case 3: {
                    setContentView(R.layout.news_layout4);
                    break;
                }
                case 4: {
                    setContentView(R.layout.news_layout5);
                    break;
                }
                case 5: {
                    setContentView(R.layout.news_layout6);
                    break;
                }
                case 6: {
                    setContentView(R.layout.news_layout7);
                    break;
                }
                default: {
                    setContentView(R.layout.not_found);
                    break;
                }
            }
        }
    }


}