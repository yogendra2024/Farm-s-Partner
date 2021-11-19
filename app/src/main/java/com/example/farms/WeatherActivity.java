package com.example.farms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.farms.R;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
    }
    public void weather1 (View view)
    {
        Intent weather1intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.Intellicast.com/"));
        startActivity(weather1intent);
    }

    public void weather2 (View view)
    {
        Intent weather2intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.timeanddate.com/weather/india/lucknow/ext"));
        startActivity(weather2intent);
    }

    public void weather3 (View view)
    {
        Intent weather3intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.Weather.gov/"));
        startActivity(weather3intent);
    }

    public void weather4 (View view)
    {
        Intent weather4intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.Wunderground.com/"));
        startActivity(weather4intent);
    }


    public void weather5 (View view)
    {
        Intent weather5intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.Accuweather.com/"));
        startActivity(weather5intent);
    }

    public void weather6 (View view)
    {
        Intent weather6intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.Weather.com"));
        startActivity(weather6intent);
    }
}
