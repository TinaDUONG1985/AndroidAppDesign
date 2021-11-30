package com.m2i.appdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class NavigatorActivity extends AppCompatActivity {

    private Fragment fragment=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigator);
        BottomNavigationView btnNav=findViewById(R.id.nav);


        //Au démarrage afficher le fragement home
        getSupportFragmentManager().beginTransaction().replace(R.id.frameNav,new HomeFragment()).commit();
        btnNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.homeItem:
                        fragment=new HomeFragment();break;
                    case R.id.favoriteItem:
                        fragment=new FavoriteFragment();break;
                    case R.id.searchItem:
                        fragment=new SearchFragment();break;

                }
                //De charger le fragement au niveau de Frame
                getSupportFragmentManager().beginTransaction().replace(R.id.frameNav,fragment).commit();
                return true;
            }
        });
    }
}