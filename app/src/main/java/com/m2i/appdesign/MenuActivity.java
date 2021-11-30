package com.m2i.appdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        //Intégration Du Menu xml
        inflater.inflate(R.menu.menu_design,menu);
        return true;
    }

    //Développement des événements sur les différents items

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.item1:
               startActivity(new Intent(MenuActivity.this,MainActivity.class));
                break;
            case R.id.item2:
                Toast.makeText(this, "Item 2 Selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.item3:
                Toast.makeText(this, "Item 3 Selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.sitem1:
                Toast.makeText(this, "FaceBook", Toast.LENGTH_LONG).show();
                break;
            case R.id.sitem2:
                Toast.makeText(this, "Twitter", Toast.LENGTH_LONG).show();
                break;

        }

        return true;
    }
}