package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String age = intent.getStringExtra("age");
        String gender = intent.getStringExtra("gender");
        String city = intent.getStringExtra("city");
        String email = intent.getStringExtra("mail");
        String mobile = intent.getStringExtra("contact");

        TextView nameText = findViewById(R.id.txtname);
        nameText.setText("Name : " + name);

        TextView ageText = findViewById(R.id.txtage);
        ageText.setText("Age : " + age);

        TextView genderText = findViewById(R.id.txtgender);
        genderText.setText("Gender : " + gender);

        TextView cityText = findViewById(R.id.txtcity);
        cityText.setText("City : " + city);

        TextView emailText = findViewById(R.id.txtemail);
        emailText.setText("E-mail : " + email);

        TextView mobileText = findViewById(R.id.txtmobile);
        mobileText.setText("Mobile : " + mobile);

        emailText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email));
                startActivity(emailIntent);
            }
        });

        mobileText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("Tel:" + mobile));
                startActivity(dialIntent);
            }
        });

    }
}