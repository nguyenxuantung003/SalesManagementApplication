package com.example.salesmanagementapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.salesmanagementapplication.R;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase firebaseDatabase ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}