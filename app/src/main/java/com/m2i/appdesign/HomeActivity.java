package com.m2i.appdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.Objects;

public class HomeActivity extends AppCompatActivity {

    ImageView photo;
    ImageView logo1,logo2;
    TextView appTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        createView();
        this.getSupportActionBar().hide();
        //ireNonNull(this.getSupportActionBar()).setIcon(R.drawable.ic_home_icone2);
        appTitle.setText("Home App");
        Intent intent=getIntent();
        photo=findViewById(R.id.photo);
        String url=intent.getStringExtra("imgUrl");
        Toast.makeText(this, url, Toast.LENGTH_LONG).show();
        //Chager l'image sous ImageView à partir d'un URL
        Picasso.get().load(url).into(photo);
        Picasso.get().load(url).into(logo1);
        logo1.setOnClickListener((evt)->{
            startActivity(new Intent(HomeActivity.this,MainActivity.class));
        });
        logo2.setOnClickListener((evt)->{
            Toast.makeText(this, "Logo 2 Clicked", Toast.LENGTH_LONG).show();
        });

    }
    private void createView(){
        logo1=findViewById(R.id.logo1);
        logo2=findViewById(R.id.logo2);
        appTitle=findViewById(R.id.appTitle);
    }
}