package com.example.raspisanie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Model> movies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, movies);
        recyclerView.setAdapter(adapter);
    }

    private void setData() {
        movies.add(new Model("Понедельник Нахимовский","1 Разработка программных модулей","А.А.Шимбирев",
                "2 Технологии разработки и защиты баз данных","А.Д.Горбунов",
                "3 Разработка программных модулей","А.Ю.Бушин ","Разработка мобильных приложений","А.О. Лясников"," ",
                " "));
        movies.add(new Model("Вторник Нежинская",
                "1 ПРАКТИКА"," ",
                "2 ПРАКТИКА"," ",
                "3 ПРАКТИКА"," ",
                "4 ПРАКТИКА"," ",
                "5 ПРАКТИКА "," "));
        movies.add(new Model("Среда Нежинская",
                "1 ПРАКТИКА"," ",
                "2 ПРАКТИКА"," ",
                "3 ПРАКТИКА"," ",
                "4 ПРАКТИКА"," ",
                "5 ПРАКТИКА"," "));
        movies.add(new Model("Четверг Нежинская",
                " ", " ",
                "2 Системное программирование ","А.Д.Нилов ",
                "3 Технология разработки ПО","Л.А.Соколова ",
                "4 Инструментальные средства разработки","Ю.В.Севастьянов ",
                "5 "," "));
        movies.add(new Model("Пятница Нахимовский",
                "1 Иностранный язык","А.Д.Завьялова",
                "2 Физическая культура","А.В.Андрюков ",
                "3 Инструментальные средства разработки\nТехнолгия разработки и защиты БД","Ю.В.Севастьянов\nА.Д.Горбунов ",
                "4 Разработка мобильных приложений\nСистемное программирование","А.О.Лясников\nА.Д.Нилов ",
                " "," "));
        movies.add(new Model("Суббота","","", "","", " "," ", " "," ", " "," "));
    }
}