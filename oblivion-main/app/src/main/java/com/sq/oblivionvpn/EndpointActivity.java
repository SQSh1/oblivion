package com.sq.oblivionvpn;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EndpointActivity extends Activity {

    private static final String PREFS_NAME = "OblivionPrefs";
    private static final String KEY_ENDPOINT = "endpoint";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endpoint);

        EditText endpointInput = findViewById(R.id.endpointInput);
        Button connectBtn = findViewById(R.id.connectBtn);

        // بارگذاری خودکار
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        String savedEndpoint = prefs.getString(KEY_ENDPOINT, "");
        endpointInput.setText(savedEndpoint);

        connectBtn.setOnClickListener(v -> {
            String endpoint = endpointInput.getText().toString().trim();
            if (endpoint.isEmpty()) {
                Toast.makeText(this, getString(R.string.please_enter_endpoint), Toast.LENGTH_SHORT).show();
            } else {
                // ذخیره در SharedPreferences
                prefs.edit().putString(KEY_ENDPOINT, endpoint).apply();

                Toast.makeText(this, getString(R.string.connecting_to) + " " + endpoint, Toast.LENGTH_SHORT).show();

                // اینجا بعداً می‌تونی اتصال واقعی رو هندل کنی
            }
        });
    }
}
