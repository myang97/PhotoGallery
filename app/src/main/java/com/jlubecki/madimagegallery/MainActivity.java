package com.jlubecki.madimagegallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Jacob on 3/25/16.
 */
public class MainActivity extends AppCompatActivity {
    //RETROFIT


    @Bind(R.id.search) EditText search;
    @Bind(R.id.image) ImageView image;
    //@Bind(R.id.button) Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        ButterKnife.bind(this);

        // Get photos off of the Stock Photo API
        //image.setImageResource(R.drawable.dino);

        /*
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String input = search.getText().toString().trim();
                Picasso.with(getApplicationContext()).load(input).into(image);
            }
        });
        */


        // Load an image into the main image view without Picasso

        // Load an image into the main image view with Picasso
    }

    @OnClick(R.id.button) void onSearchButtonClick(){
        String input = search.getText().toString().trim();
        Picasso.with(getApplicationContext()).load(input).into(image);
    }
}
