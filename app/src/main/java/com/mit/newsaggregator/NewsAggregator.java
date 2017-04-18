package com.mit.newsaggregator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NewsAggregator extends AppCompatActivity {
    ListView listView;
    ArrayList<NewsObjects> list;
    NewsAdapter adapter;

    void initViews(){
        listView=(ListView)findViewById(R.id.listview);
        list=new ArrayList<>();

        list.add(new NewsObjects(R.drawable.tribune,"English","The Tribune","http://www.tribuneindia.com/mobi/"));
        list.add(new NewsObjects(R.drawable.dainikbhaskar,"Hindi","Dainik Bhaskar","http://m.bhaskar.com"));
        list.add(new NewsObjects(R.drawable.kerelaexpress,"Malayalam","Kerala Express","http://www.keralax.com"));
        list.add(new NewsObjects(R.drawable.lokmatmarathi,"Marathi","Lokmat","http://www.lokmat.com"));
        list.add(new NewsObjects(R.drawable.kannadaprabha,"Kannada","Kannada Prabha","http://www.kannadaprabha.com"));
        list.add(new NewsObjects(R.drawable.anandatamil,"Tamil","Ananda Vikatan","http://www.vikatan.com"));
        list.add(new NewsObjects(R.drawable.jagbanipunjabi,"Punjabi","Jagbani","http://m.jagbani.punjabkesari.in"));
        list.add(new NewsObjects(R.drawable.anandabengali,"Bengali","Ananda Bazar Patrika","http://www.anandabazar.com"));
        list.add(new NewsObjects(R.drawable.asomiyaassam,"Assamese","Asomiya Pratidin","http://asomiyapratidin.in"));
        list.add(new NewsObjects(R.drawable.divyagujarati,"Gujarati","Divya Bhaskar","http://m.divyabhaskar.co.in"));
        list.add(new NewsObjects(R.drawable.sambadorissa, "Oriya", "Orissa Sambad", "http://sambadepaper.com/epapermain.aspx"));
        list.add(new NewsObjects(R.drawable.andhratelugu,"Telugu","Andhra Bhoomi","http://www.andhrabhoomi.net"));

        adapter=new NewsAdapter(NewsAggregator.this,R.layout.list_item,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                NewsObjects ob=list.get(position);
                String url=ob.getUrl();
                String newspaper=ob.getNewspaper();

                Intent i=new Intent(NewsAggregator.this,ActivityTwo.class);
                i.putExtra("keyUrl",url);
                i.putExtra("keyNewspaper",newspaper);
                startActivity(i);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_aggregator);
        initViews();
    }
}
