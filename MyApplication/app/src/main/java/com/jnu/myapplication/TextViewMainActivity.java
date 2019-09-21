package com.jnu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

public class TextViewMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_main);

        TextView item_tv;
        item_tv = findViewById(R.id.text_view_hello_world);
        item_tv.setText(R.string.hello_A);

        Context context=this.getApplicationContext();
        String resName = "hello_A";
        int helloAId=context.getResources().getIdentifier(resName, "string", context.getPackageName());
        item_tv.setText(this.getString(helloAId));
    }
}
