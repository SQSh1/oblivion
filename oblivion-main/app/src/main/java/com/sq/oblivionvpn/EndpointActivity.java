package com.sq.oblivionvpn;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EndpointActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endpoint);

        EditText endpointInput = findViewById(R.id.endpointInput);
        Button connectBtn = findViewById(R.id.connectBtn);

        connectBtn.setOnClickListener(v -> {
            String endpoint = endpointInput.getText().toString().trim();
            if (endpoint.isEmpty()) {
                Toast.makeText(this, getString(R.string.please_enter_endpoint), Toast.LENGTH_SHORT).show();
            } else {
                // اینجا می‌تونی ذخیره‌سازی یا ارسال رو انجام بدی
                Toast.makeText(this, getString(R.string.connecting_to) + " " + endpoint, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
