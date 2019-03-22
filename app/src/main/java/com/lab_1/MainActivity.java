package com.lab_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TimerTask timerTask;

    //Создаем первое активити
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //super = this в плюсах
        setContentView(R.layout.activity_main);
    }

    //Запускаем таймер для первого активити
    protected void onStart(){
        super.onStart();
        timerTask = new TimerTask();
        timerTask.execute(this); //создание асинхронного потока
    }

    //После 2 секунд закрываем первое активити, и создаем второе
    protected void Die(){
        Intent intent = new Intent(this, ActivityTwo.class); //говорит асинх потоку какое действие выполнить, здесь - открытть активити второе; описали с каким активити провести действие
        startActivity(intent); //выполнение этого действия
        finish(); //остановка таймера
    }

    public void onBackPressed(){
        timerTask.cancel(true);
        super.onBackPressed();
    }
}

