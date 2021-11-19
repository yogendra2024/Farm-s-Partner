package com.example.farms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.farms.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
            public void Home1 (View view)
        {
            Intent Home1intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.india.gov.in/"));
            startActivity(Home1intent);
        }

    public void Home2 (View view)
    {
        Intent Home2intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fert.nic.in/"));
        startActivity(Home2intent);
    }

    public void Home3 (View view)
    {
        Intent Home3intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nationalfertilizers.com/"));
        startActivity(Home3intent);
    }

    public void Home4 (View view)
    {
        Intent Home4intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.agriwatch.com/"));
        startActivity(Home4intent);
    }


    public void Home5 (View view)
    {
        Intent Home5intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.krishijagran.com/"));
        startActivity(Home5intent);
    }

    public void Home6 (View view)
    {
        Intent Home6intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.Accuweather.com/"));
        startActivity(Home6intent);
    }

}