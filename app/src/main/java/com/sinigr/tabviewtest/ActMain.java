package com.sinigr.tabviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.Toast;

public class ActMain extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);
        tabHost.setup();
        
        TabHost.TabSpec tabSpec;
        
        tabSpec = tabHost.newTabSpec("tag1");
        View v = getLayoutInflater().inflate(R.layout.tab_header, null);
        ((ImageView)v.findViewById(R.id.tab_img)).setImageDrawable(getResources().getDrawable(R.drawable.capt1));
        tabSpec.setIndicator(v);
        tabSpec.setContent(R.id.tvTab1);
        tabHost.addTab(tabSpec);
     
        tabSpec = tabHost.newTabSpec("tag2");
        v = getLayoutInflater().inflate(R.layout.tab_header, null);
        ((ImageView)v.findViewById(R.id.tab_img)).setImageDrawable(getResources().getDrawable(R.drawable.capt2));
        tabSpec.setIndicator(v);
        tabSpec.setContent(R.id.tvTab2);        
        tabHost.addTab(tabSpec);
        
        tabSpec = tabHost.newTabSpec("tag3");
        v = getLayoutInflater().inflate(R.layout.tab_header, null);
        ((ImageView)v.findViewById(R.id.tab_img)).setImageDrawable(getResources().getDrawable(R.drawable.capt3));
        tabSpec.setIndicator(v);
        tabSpec.setContent(R.id.tvTab3);        
        tabHost.addTab(tabSpec);  
        
        tabHost.setOnTabChangedListener(new OnTabChangeListener() {
	      public void onTabChanged(String tabId) {
	        Toast.makeText(getBaseContext(), "Перешли на вкладку " + tabId, Toast.LENGTH_SHORT).show();
	      }
        });
    }
}