package com.sumon.photoeditor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {

    private ImageView imageViewPreView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        imageViewPreView = findViewById(R.id.img_result);
        imageViewPreView.setImageURI(getIntent().getData());
    }
}