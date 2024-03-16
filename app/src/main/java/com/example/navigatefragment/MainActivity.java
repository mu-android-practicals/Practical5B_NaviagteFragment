package com.example.navigatefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        if (findViewById(R.id.container)!=null)
        {
            if (savedInstanceState!=null){
                return;
            }
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            First_Fragment ff =new First_Fragment();
            fragmentTransaction.add(R.id.container,ff,null);
            fragmentTransaction.commit();
        }


    }
}