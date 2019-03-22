package com.lab_1;

import android.os.AsyncTask;

public class TimerTask extends AsyncTask<MainActivity, Void, Void> { //асинхронная задача (ждет выполнения первого окна)
    private int time = 2000;
    //Остановка первого активити
    protected Void doInBackground(MainActivity... params){ //основной метод асинхронного потока
        try{
            Thread.sleep(time); //реализация таймера
            MainActivity callingActivity = params[0]; //передаем данные активити и используем один из методов params
            callingActivity.Die();
        } catch (InterruptedException e) {
        }
        return null;
    }
}