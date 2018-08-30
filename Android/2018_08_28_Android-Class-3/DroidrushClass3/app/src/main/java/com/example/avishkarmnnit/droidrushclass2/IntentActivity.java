package com.example.avishkarmnnit.droidrushclass2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {

    Button back;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        back = (Button) findViewById(R.id.back);
        textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        String value1 = intent.getStringExtra("key_1");
        String value2 = intent.getStringExtra("key_2");
        textView.setText(value1 + " : " + value2 );

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(IntentActivity.this,MainActivity.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}
