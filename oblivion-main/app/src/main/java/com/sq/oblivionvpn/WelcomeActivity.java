package com.sq.oblivionvpn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WelcomeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        new Handler().postDelayed(() -> {
            startActivity(new Intent(WelcomeActivity.this, EndpointActivity.class));
            finish();
        }, 3000); // 3 ثانیه تأخیر برای نمایش لوگو و متن
    }
}
