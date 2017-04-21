package com.suki.bnk48profile;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txvLogo;
    Button btnLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvLogo = (TextView)findViewById(R.id.txvLogo);
        btnLogo = (Button)findViewById(R.id.btnLogo);

        final Context context = this;

        btnLogo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                txvLogo.setTextColor(Color.BLACK);
                Intent intent = new Intent(context,Main2Activity.class);
                startActivity(intent);
            }
        });

    }
}
