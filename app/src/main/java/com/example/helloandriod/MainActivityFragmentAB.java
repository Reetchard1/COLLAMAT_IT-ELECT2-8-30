package com.example.helloandriod;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityFragmentAB extends AppCompatActivity {

    Button Fragment_A, Fragment_B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment_ab);

        Fragment_A = (Button) findViewById(R.id.FragmentA);
        Fragment_B = (Button) findViewById(R.id.FragmentB);



        Fragment_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { loadFragment(new Fragment_A()); }
        });

        Fragment_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { loadFragment(new Fragment_B()); }
        });

    }
    private void loadFragment(com.example.helloandriod.Fragment_A fragment_a) {
    }
    private void loadFragment(com.example.helloandriod.Fragment_B fragment_b) {
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.constraintLayout, fragment);
        fragmentTransaction.commit();
    }


}