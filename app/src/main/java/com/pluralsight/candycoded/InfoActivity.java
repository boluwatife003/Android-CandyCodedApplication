package com.pluralsight.candycoded;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Uri uri = Uri.parse("android.resource://com.codeschool.candycoded/" + R.drawable.store_front);
        ImageView candyStoreImageView = (ImageView)findViewById(R.id.image_view_candy_store);
        Picasso.with(this).
                load(uri).
                into(candyStoreImageView);


    }

    public void createPhoneIntent(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        startActivity(intent);
    }

    public void createMapIntent(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW).setPackage("com.google.android.apps.maps");
        Uri uri = Uri.parse("geo:0,0?q=618 E South St Orlando, FL 32801");
        intent.setData(uri);


        intent.resolveActivity(getPackageManager());
        startActivity(intent);
//        }else{
//            Toast.makeText(this, "No Map client is available", Toast.LENGTH_SHORT).show();
//        }

    }



    // ***
    // TODO - Task 3 - Launch the Phone Activity
    // ***
}
