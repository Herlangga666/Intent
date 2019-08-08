package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
Button implicitintent;
Button explicitintent;
Button intent2;
Button intent3;
Button intent4;
Button intent5;
Button btnhome1;
Button btnhome2;
Button btnhome3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitintent = (Button)findViewById(R.id.explicitintent);
        explicitintent.setOnClickListener(this);
        implicitintent = (Button)findViewById(R.id.implicitintent);
        implicitintent.setOnClickListener(this);
        intent2 = (Button)findViewById(R.id.intent2);
        intent2.setOnClickListener(this);
        intent3 = (Button)findViewById(R.id.intent3);
        intent3.setOnClickListener(this);
        intent4 = (Button)findViewById(R.id.intent4);
        intent4.setOnClickListener(this);
        intent5 = (Button)findViewById(R.id.intent5);
        intent5.setOnClickListener(this);
        btnhome1 = (Button)findViewById(R.id.intent4);
        intent4.setOnClickListener(this);


    }
    @Override
public void onClick(View v){
        switch (v.getId()){
            case R.id.explicitintent:
                Intent explicit = new Intent(MainActivity.this, IntenActivity.class );
                startActivity(explicit);
                break;
            case R.id.implicitintent:
                Intent implicitintent = new Intent( Intent.ACTION_VIEW, Uri.parse("http://instagram.com") );
                startActivity(implicitintent);
                break;
            case R.id.intent2:
                Intent intent2 = new Intent(MainActivity.this,activity_intent2.class);
                startActivity(intent2);
                break;
            case R.id.intent3:
                Intent intent3 = new Intent(MainActivity.this,activity_intent3.class);
                startActivity(intent3);
                break;
            case R.id.intent4:
                Intent intent4 = new Intent(MainActivity.this,activity_intent4.class);
                startActivity(intent4);
                break;
            case R.id.intent5:
                Intent intent5 = new Intent(MainActivity.this,activity_intent5.class);
                startActivity(intent5);
                break;
            case R.id.btnhome1:
                Intent btnhome1 = new Intent(MainActivity.this,MainActivity.class);
                startActivity(btnhome1);
                break;
            case R.id.btnhome2:
                Intent btnhome2 = new Intent(MainActivity.this,MainActivity.class);
                startActivity(btnhome2);
                break;
            case R.id.btnhome3:
                Intent btnhome3 = new Intent(MainActivity.this,MainActivity.class);
                startActivity(btnhome3);
                break;
            case R.id.btnhome4:
                Intent btnhome4 = new Intent(MainActivity.this,MainActivity.class);
                startActivity(btnhome4);
                break;
            case R.id.btnhome5:
                Intent btnhome5 = new Intent(MainActivity.this,MainActivity.class);
                startActivity(btnhome5);
                break;
            default:
                 break;
        }
}

}
