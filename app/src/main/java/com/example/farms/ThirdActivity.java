package com.example.farms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button Home = (Button)findViewById(R.id.btnHome);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });

        Button Govt = (Button)findViewById(R.id.btnGovernment);

        Govt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this,GovtActivity.class);
                startActivity(intent);
            }
        });

        Button Crops = (Button)findViewById(R.id.btnCrops);

        Crops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, CropsActivity.class);
                startActivity(intent);
            }
        });

        Button Weather = (Button)findViewById(R.id.btnWeather);

        Weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this,WeatherActivity.class);
                startActivity(intent);
            }
        });
        Button Oraganic = (Button)findViewById(R.id.btnOrganic);

        Oraganic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this,OrganivActivity.class);
                startActivity(intent);
            }
        });
        Button Help = (Button)findViewById(R.id.btnHelp);

        Help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, Help_Activity.class);
                startActivity(intent);
            }
        });
    }
}
