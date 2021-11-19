package com.example.farms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class CropsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crops);
    }

    public void Crop1 (View view)
    {
        Intent gov1intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.agrifarming.in/wheat-farming-information"));
        startActivity(gov1intent);
    }

    public void Crop2 (View view)
    {
        Intent gov2intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.agrifarming.in/grape-farming-information"));
        startActivity(gov2intent);
    }

    public void Crop3 (View view)
    {
        Intent gov3intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.agrifarming.in/potato-farming"));
        startActivity(gov3intent);
    }

    public void Crop4 (View view)
    {
        Intent gov4intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.agrifarming.in/toor-dal-farming"));
        startActivity(gov4intent);

    }

    public void Crop5 (View view)
    {
        Intent gov5intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.farmingindia.in/tomato-cultivation/"));
        startActivity(gov5intent);
    }


    public void Crop6 (View view)
    {
        Intent gov6intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.farmingindia.in/watermelon-cultivation/"));
        startActivity(gov6intent);
    }
}
