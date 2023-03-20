package com.example.basiccoding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView tv_text;
    private Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_text = (TextView)findViewById(R.id.tv_sub);
        btn_back = (Button)findViewById(R.id.btn_back);

        Intent intent = getIntent();
        String str = intent.getStringExtra("str");

        tv_text.setText(str);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intents = new Intent(SubActivity.this, MainActivity.class);
                startActivity(intents);
            }
        });
    }
}