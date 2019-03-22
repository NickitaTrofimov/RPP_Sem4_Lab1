package com.lab_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class ActivityTwo extends AppCompatActivity {
    private RecyclerView recyclerView;  //Создаем прокручиваемый список
    private RecyclerView.Adapter adapter;   //Объявляем адаптер для заполнения и управления элементами
    private RecyclerView.LayoutManager layoutManager;   //Отображает список в определенной форме

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);  //Получаем сслыку через индефикатор на строку в списке
        recyclerView.setHasFixedSize(true);     //Устанавливаем не изменяемые размеры строк
        layoutManager = new LinearLayoutManager(this);  //Определяем структуру нашего списка
        recyclerView.setLayoutManager(layoutManager); //подключение к списку строки
        adapter = new Adapter();
        recyclerView.setAdapter(adapter); //подключили адаптер к списку
    }
}
