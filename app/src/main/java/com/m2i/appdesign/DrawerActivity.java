package com.m2i.appdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class DrawerActivity extends AppCompatActivity {

    private NavigationView navigation;
    Fragment fragment;
    //Test avec Fragement
    EditText n1;
    Button btnFragment;
    //
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private  String result="Start";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);
        drawerLayout=findViewById(R.id.layoutDrawer);
        //Fragement charge au démarrage de l'activité (Fragement par défaut)
        getSupportFragmentManager().beginTransaction().replace(R.id.drawer_frm,new HomeFragment()).commit();
        //cette version délégue la tache de gestion de composants au fragement lui même
        /*n1=findViewById(R.id.nb1);
        btnFragment=findViewById(R.id.btnAdd);
        btnFragment.setOnClickListener((evt)->{
            n1.setText("Test Action Activity");
        });*/
        toggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        //this.getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setHomeButtonEnabled(true);
        navigation=findViewById(R.id.drawer_nav);

        navigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //Cacher le panneau de navigation
                drawerLayout.closeDrawer(GravityCompat.START);
                switch(item.getItemId()){
                    case R.id.drawer_home:fragment=new HomeFragment();
                    break;
                    case R.id.drawer_chat:fragment=new ChatFragment();
                        break;
                    case R.id.drawer_phone:fragment=new PhoneFragment();
                        break;
                    case R.id.drawer_search:fragment=new SearchFragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.drawer_frm,fragment).commit();
                return true;
            }
        });

    }




}