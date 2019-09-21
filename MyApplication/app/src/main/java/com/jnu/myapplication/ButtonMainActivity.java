package com.jnu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonMainActivity extends AppCompatActivity {

    private Button buttonCn, buttonEn;
    private TextView textViewHelloButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_main);

        buttonCn=this.findViewById(R.id.button_cn);
        buttonEn=this.findViewById(R.id.button_en);
        textViewHelloButton=this.findViewById(R.id.text_view_hello_button);

        buttonCn.setOnClickListener(new MyClickListener());
        buttonEn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewHelloButton.setText(buttonEn.getText());
            }
        });
    }

    private class MyClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Button button=(Button)view;
            textViewHelloButton.setText(button.getText());
        }
    }
}
