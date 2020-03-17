package com.example.activities_lab_2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.second_activitiy);
    }
//        EditText et = findViewById(R.id.edit_text);
//
//        Button button = findViewById(R.id.button);
//        button.setOnClickListener(v -> {
//            // Считываем значение поля
//            String text = et.getText().toString();
//
//            // Формируем "пустое" намерение
//            Intent intent = new Intent();
//            // Добавляем в намерение данные
//            intent.putExtra("result",text);
//
//            // Устанавливаем результат
//            setResult(RESULT_OK,intent);
//
//            // Закрываем Activity
//            finish();
//        });
//    }
//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//
//        setResult(RESULT_CANCELED);
//    }
}
