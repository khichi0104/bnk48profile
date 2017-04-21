package com.suki.bnk48profile;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestHandle;
import com.suki.bnk48profile.adapter.IndexListAdapter;
import com.suki.bnk48profile.adapter.ProfileItem;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class Main2Activity extends AppCompatActivity {

    ListView profileList;
    IndexListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        profileList = (ListView) findViewById(R.id.profileList);

        adapter = new IndexListAdapter(this, 0);
       // adapter.add(new ProfileItem("Cherprang", "Cherprang", "AREEKUL", "http://www.bnk48.com/data/image-member/1/l/20170213022927903591.jpg"));
        //adapter.add(new ProfileItem("Cherprang", "Cherprang", "AREEKUL", "http://www.bnk48.com/data/image-member/2/l/20170213022942376874.jpg"));
        //adapter.add(new ProfileItem("Cherprang", "Cherprang", "AREEKUL", "http://www.bnk48.com/data/image-member/3/l/20170213023002768535.jpg"));
        //adapter.add(new ProfileItem("Cherprang", "Cherprang", "AREEKUL", "http://www.bnk48.com/data/image-member/4/l/20170214150858665474.jpg"));
        profileList.setAdapter(adapter);

        loadProfileFromServer();

        profileList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                Log.d("position",position+"");
                ProfileItem oneitem = (ProfileItem)profileList.getItemAtPosition(itemPosition);
                Log.d("position","GET");

                Toast.makeText(getApplicationContext(),"ID:"+itemPosition+" Name:"+oneitem.getNickname(),Toast.LENGTH_SHORT).show();

                Uri uri = Uri.parse("http://google.com");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

    }

    private void loadProfileFromServer() {
        AsyncHttpClient client = new AsyncHttpClient();
        Log.d( "con" , "true" );
        client.get("http://demo4991538.mockable.io/bnk48_profile", new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {

                try {
                    JSONArray profileArray = response.getJSONArray("profile");

                    for (int i = 0; i < profileArray.length(); i++) {
                        JSONObject profile = profileArray.getJSONObject(i);
                        String nickname = profile.getString("nickname");
                        String name = profile.getString("name");
                        String surname = profile.getString("surname");
                        String image = profile.getString("image");
                        String birthday = profile.getString("birthdate");
                        int height = profile.getInt("height");
                        String bloodtype = profile.getString("bloodtype");
                        String birthplace = profile.getString("birthplace");
                        String like = profile.getString("like");
                        String hobby = profile.getString("hobby");

                        adapter.add(new ProfileItem(nickname, name, surname, image,birthday,height,bloodtype,birthplace,like,hobby));
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

    }

}