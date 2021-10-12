package com.example.lifecycleandroid.studiCase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import com.example.lifecycleandroid.databinding.ActivityStudyCaseImplicitBinding;

public class StudyCaseImplicitActivity extends AppCompatActivity {

    ActivityStudyCaseImplicitBinding binding;

    static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityStudyCaseImplicitBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.btnGoToDialNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = String.format("tel: 085866042336");
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse(phoneNumber));
                startActivity(i);
            }
        });
        binding.btnGoToGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//                startActivity(intent);
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_APP_GALLERY);
                startActivity(intent);
            }
        });
        binding.btnGoToCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(camera);
            }
        });
        binding.btnGoToSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_MAIN);
//                intent.addCategory(Intent.CATEGORY_APP_MESSAGING);
//                startActivity(intent);
                Intent sms = new Intent();
                sms.setAction(Intent.ACTION_SEND);
                sms.putExtra(Intent.EXTRA_TEXT, "Hallo Yahya Wildan");
                sms.setType("text/plain");
                startActivity(sms);
            }
        });
    }
}