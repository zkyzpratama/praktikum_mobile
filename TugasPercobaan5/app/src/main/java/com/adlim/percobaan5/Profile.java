package com.adlim.percobaan5;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        int photoResource = getIntent().getIntExtra("hero_photo", 0);
        String name = getIntent().getStringExtra("hero_name");
        String description = getIntent().getStringExtra("hero_description");

        ImageView imageview = findViewById(R.id.img_item_photo);
        TextView nameTextView = findViewById(R.id.tv_item_name);
        TextView descTextView = findViewById(R.id.tv_item_description);

        imageview.setImageResource(photoResource);
        nameTextView.setText(name);
        descTextView.setText(description);
    }
}
