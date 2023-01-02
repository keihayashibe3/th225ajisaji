package com.example.th225ajisaji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class yasai extends AppCompatActivity {

int i = 0;
    public void onClickEbi2(View v) {

        ImageView Imagefav = (ImageView)this.findViewById(R.id.fav4);
        if(i == 1){
            i = 0;
            Imagefav.setImageResource(R.drawable.ebityahan_sentaku);
        }else {
            i = 1;
            Imagefav.setImageResource(R.drawable.ebityahan);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebi);
        setTitle( "選択：えび" );
    }
}