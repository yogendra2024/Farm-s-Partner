package com.example.farms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.farms.R;

public class GovtActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_govt);
    }

        public void Gov1 (View view)
        {
            Intent gov1intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.resultuniraj.co.in/pm-kisan-samman-nidhi/"));
            startActivity(gov1intent);
        }

        public void Gov2 (View view)
        {
            Intent gov2intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cropnutrition.com/nutrient-management/micronutrients"));
            startActivity(gov2intent);
        }

    public void Gov3 (View view)
    {
        Intent gov3intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://upagripardarshi.gov.in/staticpages/AgriculturalUsefulInstrument.aspx"));
        startActivity(gov3intent);
    }

    public void Gov4 (View view)
    {
        Intent gov4intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.indiamart.com/kr-group/insecticides-from-krishi-rasayan.html"));
        startActivity(gov4intent);

    }

    public void Gov5 (View view)
    {
        Intent gov5intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.livehindustan.com/uttarakhand/roorki/story-under-seed-gram-yojana-farmers-will-get-grant-on-seeds-2834846.html"));
        startActivity(gov5intent);
    }


    public void Gov6 (View view)
    {
        Intent gov6intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.resultuniraj.co.in/pm-kisan-mandhan-yojana-pmkmy-gov-in/"));
        startActivity(gov6intent);
    }

    public void Gov7 (View view)
    {
        Intent gov7intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.agriwatch.com"));
        startActivity(gov7intent);
    }

    public void Gov8 (View view)
    {
        Intent gov8intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.agriwatch.com"));
        startActivity(gov8intent);
    }
}
