package com.example.custom_alert_dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Dialog dialog;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.button);
        dialog=new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.customdialogbox);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.bgfordialog));

        Button No=dialog.findViewById(R.id.button1);
        Button Yes=dialog.findViewById(R.id.button2);

        Yes.setOnClickListener(v -> dialog.dismiss());
        No.setOnClickListener(v -> Toast.makeText(MainActivity.this, "You clicked no", Toast.LENGTH_SHORT).show());

        btn.setOnClickListener(v -> dialog.show());
    }
}