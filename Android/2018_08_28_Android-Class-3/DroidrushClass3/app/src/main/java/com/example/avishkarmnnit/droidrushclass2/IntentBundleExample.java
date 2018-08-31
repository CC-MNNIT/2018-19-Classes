package com.example.avishkarmnnit.droidrushclass2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class IntentBundleExample extends AppCompatActivity {

    Button go_back;
    TextView text_string, text_int;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_bundle_example);

        go_back = (Button) findViewById(R.id.go_back);
        text_string = (TextView) findViewById(R.id.text_string);
        text_int = (TextView) findViewById(R.id.text_int);

        Bundle bundle = getIntent().getExtras();
        String string_val = bundle.getString("key_1", "Default string");
        int num = bundle.getInt("key_2", 0);

        text_string.setText(string_val);
        text_int.setText("" + num);

        go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(IntentBundleExample.this,MainActivity.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}
