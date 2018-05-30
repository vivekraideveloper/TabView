package com.vijayjaidewan01vivekrai.tabview_github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    private TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("First Tab");
        tab1.setIndicator("First");
        tab1.setContent(R.id.tab1);
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2 = tabHost.newTabSpec("SecondTab");
        tab2.setIndicator("Second");
        tab2.setContent(R.id.tab2);
        tabHost.addTab(tab2);

        TabHost.TabSpec tab3 = tabHost.newTabSpec("ThirdTab");
        tab3.setIndicator("Third");
        tab3.setContent(R.id.tab3);
        tabHost.addTab(tab3);
    }
}
