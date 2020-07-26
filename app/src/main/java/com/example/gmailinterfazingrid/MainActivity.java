package com.example.gmailinterfazingrid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    FragmentManager fragmenManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout=findViewById(R.id.drawer);
        navigationView=findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);

        actionBarDrawerToggle =new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();

        fragmenManager=getSupportFragmentManager();
        fragmentTransaction=fragmenManager.beginTransaction();
        fragmentTransaction.add(R.id.container_fragment, new PrincipalFragment());
        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.barra_arriba,menu);
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        drawerLayout.closeDrawer(GravityCompat.START);
        if(item.getItemId()==R.id.Principal){
            fragmenManager=getSupportFragmentManager();
            fragmentTransaction=fragmenManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_fragment, new PrincipalFragment());
            fragmentTransaction.commit();
        }

        if(item.getItemId()==R.id.Social){
            fragmenManager=getSupportFragmentManager();
            fragmentTransaction=fragmenManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_fragment, new SocialFragment());
            fragmentTransaction.commit();
        }

        if(item.getItemId()==R.id.Promociones){

        }

        if(item.getItemId()==R.id.Notificaciones){

        }

        if(item.getItemId()==R.id.Foros){

        }

        if(item.getItemId()==R.id.coordiCarrera){

        }

        if(item.getItemId()==R.id.Destacados){

        }

        if(item.getItemId()==R.id.Propuestos){

        }

        return true;
    }
}