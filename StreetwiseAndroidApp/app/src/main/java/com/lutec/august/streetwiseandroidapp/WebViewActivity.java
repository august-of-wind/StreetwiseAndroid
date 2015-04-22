package com.lutec.august.streetwiseandroidapp;


import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import java.lang.String;
import android.webkit.WebViewClient;


public class WebViewActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //WebView webView = new WebView(this);
        //setContentView(webView);
        setContentView(R.layout.activity_web_view);
        //String testURL2 = "www.google.com";
        WebView swSite = (WebView) this.findViewById(R.id.webView);
        swSite.getSettings().setJavaScriptEnabled(true);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int vendorID = extras.getInt(MainActivity.EXTRA_VENDORID);
//        String targetURL = "http://streetwise.org/purchase&KEYWORD="+"/"+vendorID+"/";
        String targetURL = "http://streetwise.org/purchase/"+vendorID+"/";
//        Intent intent = getIntent();
//        Bundle extras = intent.getExtras();
//        String vendorID = extras.getString(MainActivity.EXTRA_VENDORID);
//        Integer vendorID = Integer.parseInt(extras.getString(MainActivity.EXTRA_VENDORID));
//        String targetURL = "www.streetwise.org/purchase/";
//        Our testing VendorID is 6574
        String testURL = "http://streetwise.org/purchase/6574/";
//        String totalURL = targetURL+vendorID+"/";

        swSite.loadUrl(targetURL);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_web_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}