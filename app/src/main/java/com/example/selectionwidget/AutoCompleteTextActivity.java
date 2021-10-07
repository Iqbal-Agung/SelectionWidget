package com.example.selectionwidget;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

public class AutoCompleteTextActivity extends AppCompatActivity {

    private static final String[] country = new String[]{
            "Indonesia", "Malaysia", "Singapura", "Vietnam", "China", "Jepang"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text);

        AutoCompleteTextView editText = findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, country);
        editText.setAdapter(adapter);
    }
}