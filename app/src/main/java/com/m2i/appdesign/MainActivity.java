package com.m2i.appdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("AppDesign");
        Button btnSend=findViewById(R.id.btnSend);
        btnSend.setOnClickListener((evt)->{
            Uri uri=Uri.parse("https://i.ibb.co/y8LKS7H/Lighthouse.jpg");
            Intent intent=new Intent(MainActivity.this,HomeActivity.class);
            intent.putExtra("imgUrl","https://i.ibb.co/y8LKS7H/Lighthouse.jpg");
            intent.setData(uri);
            startActivity(intent);
        });

    }

    public void sendData(View view) {
        Intent intent=new Intent(MainActivity.this,HomeActivity.class);
        intent.putExtra("imgUrl","https://i.ibb.co/y8LKS7H/Lighthouse.jpg");
        startActivity(intent);
    }

    public void getMenu(View view) {
        startActivity(new Intent(MainActivity.this,MenuActivity.class));
    }

    public void getNavigator(View view) {
        startActivity(new Intent(MainActivity.this,NavigatorActivity.class));
    }

    public void getDrawer(View view) {
        startActivity(new Intent(MainActivity.this,DrawerActivity.class));
    }
}