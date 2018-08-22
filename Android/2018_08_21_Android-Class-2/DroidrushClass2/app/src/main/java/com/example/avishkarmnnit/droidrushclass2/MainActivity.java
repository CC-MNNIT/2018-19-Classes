package com.example.avishkarmnnit.droidrushclass2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button normalIntent, clickMe, clickBundle, intentResult, sharedPref;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        normalIntent = (Button) findViewById(R.id.normal_intent);
        clickMe = (Button) findViewById(R.id.clickMe);
        clickBundle = (Button) findViewById(R.id.bunleButton);
        intentResult = (Button) findViewById(R.id.intentResultButton);
        resultText = (TextView) findViewById(R.id.resultText);
        sharedPref = (Button) findViewById(R.id.sharedPrefBut);

        normalIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NormalIntent.class);
                startActivity(intent);
            }
        });
        // Key Value - putextra way
        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Key : Value within intent
                Intent intent = new Intent(MainActivity.this,IntentActivity.class);
                intent.putExtra("key_1", "This value one for ActivityTwo ");
                intent.putExtra("key_2", "This value two for ActivityTwo");
                startActivity(intent);
            }
        });

        // Bundle way
        clickBundle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,IntentBundleExample.class);
                Bundle bundle = new Bundle();
                bundle.putString("key_1", "Got a string!!");
                bundle.putInt("key_2", 10);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        intentResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,IntentResultExample.class);
                startActivityForResult(intent, 2);
            }
        });

        sharedPref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SharedPref.class);
                startActivity(intent);
            }
        });
    }

    // By default called -> when startActivityForResult is done
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if(requestCode==resultCode)
        {
            String message=data.getStringExtra("MESSAGE");
            resultText.setText(message);
        }
    }
}
