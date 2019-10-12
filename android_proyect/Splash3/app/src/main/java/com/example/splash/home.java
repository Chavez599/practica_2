package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.splash.Fragments.Fragment2;
import com.example.splash.Fragments.Fragment3;
import com.example.splash.Fragments.FragmentQr;

public class home extends AppCompatActivity implements FragmentQr.OnFragmentInteractionListener, Fragment2.OnFragmentInteractionListener, Fragment3.OnFragmentInteractionListener, View.OnClickListener {

    FragmentQr qr;
    Fragment2 dos;
    Fragment3 tres;
    ImageView op1,
              op2,
              op3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        qr = new FragmentQr();
        dos = new Fragment2();
        tres = new Fragment3();

        op1 = findViewById(R.id.Qr);
        op2 = findViewById(R.id.Qr2);
        op3 = findViewById(R.id.Qr3);

        op1.setOnClickListener(this);
        op2.setOnClickListener(this);
        op3.setOnClickListener(this);

        getSupportFragmentManager().beginTransaction().add( R.id.FragmentContainer,qr).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onClick(View view) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId()) {

            case R.id.Qr: transaction.replace(R.id.FragmentContainer,qr); break;
            case R.id.Qr2: transaction.replace(R.id.FragmentContainer,dos); break;
            case R.id.Qr3: transaction.replace(R.id.FragmentContainer,tres); break;
        }
        transaction.commit();
    }
}
