package com.suki.bnk48profile;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.suki.bnk48profile.adapter.IndexListAdapter;

public class MainIndexActivity extends AppCompatActivity {

    ImageView imgProfile;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_index);

        context = this;
        imgProfile = (ImageView)findViewById(R.id.profile_pic);
        //Picasso.with(this).load("http://www.bnk48.com/data/image-member/1/l/20170213022927903591.jpg").into(imgProfile);


    }
}
