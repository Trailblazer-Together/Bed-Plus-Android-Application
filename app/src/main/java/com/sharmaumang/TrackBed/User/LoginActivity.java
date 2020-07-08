package com.sharmaumang.TrackBed.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.sharmaumang.TrackBed.Hospital.HospitalLogin;
import com.sharmaumang.TrackBed.R;

public class LoginActivity extends AppCompatActivity {

    TextInputEditText mPhoneNumber,mTextOtp;
    Button mSendOtp;
    ImageView mNextScreen;
    TextView mHospital;
    String mNumber, mOtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mPhoneNumber = findViewById(R.id.userPhoneNumber);
        mTextOtp = findViewById(R.id.otpid);
        mSendOtp = findViewById(R.id.sendOtpButton);
        mNextScreen = findViewById(R.id.nextPage);
        mHospital = findViewById(R.id.hospital_text);


        mNumber ="+91"+ mPhoneNumber.getText().toString();
        mOtp = mTextOtp.getText().toString();









        mHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NextToHospital();
            }
        });

        mNextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NextToHospital();
            }
        });

    }

    public void NextToHospital(){
        Intent mIntent = new Intent(LoginActivity.this, HospitalLogin.class);
        startActivity(mIntent);

    }



}