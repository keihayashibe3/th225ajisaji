package com.example.th225ajisaji;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.th225ajisaji.ui.search.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.th225ajisaji.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each(各メニューIDをIDとセットとして渡す)
        // menu should be considered as top level destinations.(メニューはトップレベルの宛先となる)
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_setting, R.id.navigation_favorite, R.id.navigation_search)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

    public void onClickOniku(View v) {
        Intent intent = new Intent(this,Oniku.class);

        startActivity(intent);
    }
    public void onClickYasai(View v) {
        Intent intent = new Intent(this,yasai.class);

        startActivity(intent);
    }

    public void onClickBack(View v) {
        Intent intent = new Intent(this, SearchFragment.class);

        startActivity(intent);
    }

    public void onClickButaniku(View v) {
        Intent intent = new Intent(this, Butaniku.class);

        startActivity(intent);
    }

    public void onClickFavorite_fav(View v) {
        Intent intent = new Intent(this, Favorite_fav.class);

        startActivity(intent);
    }
}



    //matsue hayashibe
