package com.example.farms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.farms.R;

public class OrganivActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organiv);
    }

    public void Organic1 (View view)
    {
        Intent gov1intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.slideshare.net/sreenivasReddy131/jute-cultivationconstraints-and-strategies-for-enhancing-yield-in-jutejute-in-india"));
        startActivity(gov1intent);
    }

    public void Organic2 (View view)
    {
        Intent gov2intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.krishisewa.com/articles/organic-agriculture/279-org_radish.html"));
        startActivity(gov2intent);
    }

    public void Organic3 (View view)
    {
        Intent gov3intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.krishisewa.com/articles/organic-agriculture/330-organic-vegetables.html"));
        startActivity(gov3intent);
    }

    public void Organic4 (View view)
    {
        Intent gov4intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://krishijagran.com/news/sahaja-seeds-a-mysuru-based-startup-encourages-farmers-to-produce-indigenous-and-patent-free-seeds-of-a-variety-of-crops/"));
        startActivity(gov4intent);

    }

    public void Organic5 (View view)
    {
        Intent gov5intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tarladalal.com/article-benefits-of-sprouts-354"));
        startActivity(gov5intent);
    }


    public void Organic6 (View view)
    {
        Intent gov6intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://timesofindia.indiatimes.com/city/amritsar/from-natural-farming-to-hand-spinning-and-weaving-5k-benefit-from-return-to-tradition/articleshow/74533001.cms"));
        startActivity(gov6intent);
    }

}
