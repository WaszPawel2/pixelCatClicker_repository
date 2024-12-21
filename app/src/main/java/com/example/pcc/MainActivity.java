package com.example.pcc;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView money_ammount_text;

    private ImageView cat_id;

    private int p_money_ammount = 0;

    private int p_money_multiplier = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        money_ammount_text = findViewById(R.id.money_ammount_text);

        cat_id = findViewById(R.id.cat_id);
        cat_id.setOnClickListener(v -> addMoney());
    }
    private void addMoney(){
        p_money_ammount++;
        money_ammount_text.setText(String.valueOf(p_money_ammount));
    }
}