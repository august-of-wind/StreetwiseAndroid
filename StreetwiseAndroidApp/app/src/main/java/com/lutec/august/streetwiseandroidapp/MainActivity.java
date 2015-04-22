package com.lutec.august.streetwiseandroidapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
    public final static String EXTRA_VENDORID = "VENDORID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        View someView = findViewById(R.id.fbButton);

//        // Find the root view
//        View root = someView.getRootView();
//
//        // Set the color
//        root.setBackgroundColor(getResources().getColor(android.R.color.white));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void takeInput(View view) {
        Intent intent = new Intent(this, WebViewActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText2);
        Integer vendorID = Integer.parseInt(editText.getText().toString());
        Bundle bn = new Bundle();
        bn.putInt(EXTRA_VENDORID, vendorID);
        intent.putExtras(bn);

        startActivity(intent);

    }

    public void openStreetwiseMainPage(View view) {
        Intent intent = new Intent(this, StreetwiseMainPageWebView.class);
        startActivity(intent);
    }

    public void openFB(View view) {
        Intent intent = new Intent(this, FacebookView.class);
        startActivity(intent);
    }

    public void openTwitter(View view) {
        Intent intent = new Intent(this, TwitterView.class);
        startActivity(intent);
    }
}
