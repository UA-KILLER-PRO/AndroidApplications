

package com.example.lab_1calculator;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

// 1 - способ
public class MainActivity extends Activity  {


    EditText etNum1;
    EditText etNum2;
    TextView tvResult;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);

        //Проверка на ввод только цифр
        etNum1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        etNum2.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);

        plusButtonOnClick();
        minusButtonOnClick();

    }

    //Обработка нажатия на кнопку 1 способом
    private void plusButtonOnClick() {
        Button button = findViewById(R.id.btnAdd);
        button.setOnClickListener(v -> {
            addNumbers();
        });
    }

    //Обработка нажатия на кнопку 1 способом
    private void  minusButtonOnClick() {
        Button button = findViewById(R.id.btnSub);
        button.setOnClickListener(v -> {
            subtractNumbers();
        });
    }
    // 2 - способ обработки нажатия на кнопку
    public void multiplicationButtonOnClick(View view) {
        multiplyNumbers();
    }

    //2 - способ обработки нажатия на кнопку
    public void divisionButtonOnClick(View view) {
        divideNumbers();
    }

    //Метод который перемножает числа
    private void multiplyNumbers() {
        //Находим формы куда были вписаны числа
        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);
        //Проверка на то что указано два числа
        // Проверяем поля на пустоту
        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())) {
            displayErrorMessage("Укажите два числа!");
        } else {
            //Получаем из строки числа
            double num1 = Double.parseDouble(etNum1.getText().toString());
            double num2 = Double.parseDouble(etNum2.getText().toString());
            //Отображение результата операции
            displayResult(num1 * num2);
        }
    }

    //Метод который перемножает числа
    private void divideNumbers() {
        //Находим формы куда были вписаны числа
        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);
        //Проверка на то что указано два числа
        // Проверяем поля на пустоту
        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())) {
            displayErrorMessage("Укажите два числа!");
        } else {
            //Получаем из строки числа
            double num1 = Double.parseDouble(etNum1.getText().toString());
            double num2 = Double.parseDouble(etNum2.getText().toString());
            //Отображение результата операции
            if(!checkIfDivisionByZero(num2)) {
                displayResult(num1 / num2);
            }
        }
    }

    //Метод для сложения чисел
    private void addNumbers() {
        //Находим формы куда были вписаны числа
        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);
        //Проверка на то что указано два числа
        // Проверяем поля на пустоту
        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())) {
            displayErrorMessage("Укажите два числа!");
        } else {
            //Получаем из строки числа
            double num1 = Double.parseDouble(etNum1.getText().toString());
            double num2 = Double.parseDouble(etNum2.getText().toString());
            //Отображение результата операции
            displayResult(num1 + num2);
        }
    }

    //Метод для вычитания чисел
    private void subtractNumbers() {
        //Находим формы куда были вписаны числа
        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);
        //Проверка на то что указано два числа
        // Проверяем поля на пустоту
        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())) {
            displayErrorMessage("Укажите два числа!");
        } else {
            //Получаем из строки числа
            double num1 = Double.parseDouble(etNum1.getText().toString());
            double num2 = Double.parseDouble(etNum2.getText().toString());
            //Отображение результата операции
            displayResult(num1 - num2);

        }
    }


    //Метод который отображает результат операций
    private void displayResult(double result) {
        TextView textView = findViewById(R.id.Result);
        textView.setText(Double.toString(result));
    }
    //Метод который создает и показывает всплывающее окно
    private void displayErrorMessage(String string) {
        Toast toast = Toast.makeText(this,string,Toast.LENGTH_LONG);
        toast.show();
    }

    //Проверка на то является ли второе число нулем
    private boolean checkIfDivisionByZero (double num2) {
        if (num2 == 0) {
            displayErrorMessage("На ноль делить нельзя!");
            return  true;
        }
        return false;
    }

}