package com.example.th225ajisaji;



import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Ebichan extends AppCompatActivity {


    public void onClickEbi2(View v) {
int i =1;
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
        setContentView(R.layout.activity_yasai);
        setTitle( "選択エビ" );
    }

}