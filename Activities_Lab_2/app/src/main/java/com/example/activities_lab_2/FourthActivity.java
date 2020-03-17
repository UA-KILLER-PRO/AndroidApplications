package com.example.activities_lab_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_activity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        EditText et = findViewById(R.id.editText);

        Button button = findViewById(R.id.button4);
        button.setOnClickListener(v -> {
            // Считываем значение поля
            String text = et.getText().toString();

            // Формируем "пустое" намерение
            Intent intent = new Intent();
            // Добавляем в намерение данные
            intent.putExtra("result",text);

            // Устанавливаем результат
            setResult(RESULT_OK,intent);

            // Закрываем Activity
            finish();
        });
    }
}
