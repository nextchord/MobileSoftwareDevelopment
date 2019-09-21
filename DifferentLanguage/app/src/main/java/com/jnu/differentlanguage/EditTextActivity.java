package com.jnu.differentlanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditTextActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        button=this.findViewById(R.id.button_change_language);
        textView=this.findViewById(R.id.text_view_language);
        editText=this.findViewById(R.id.edit_text_country);

        Context context=this.getApplicationContext();
        String resName = "language_"+editText.getText();
        int languageId=context.getResources().getIdentifier(resName, "string", context.getPackageName());


        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Resources resources = getResources();
                String resName = "language_"+editText.getText();
                int languageId=resources.getIdentifier(resName, "string", getPackageName());
                textView.setText(getString(languageId));
                String resName2 = "change_language_"+editText.getText();
                int languageId2=resources.getIdentifier(resName2, "string", getPackageName());
                button.setText(getString(languageId2));
            }
        });
    }
}
