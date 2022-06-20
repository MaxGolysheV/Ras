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
        movies.add(new Model("Понедельник","1 Технология разработки и защиты баз данных","А.В. Джебилов",
                "2 Сертификация информационных систем","А.М. Ченцов",
                " "," "," "," "," "," "));
        movies.add(new Model("Вторник Нежинская","1 Экономика отрасли","Л.Ю. Попова",
                "2 Инструментальные средства разработки ПО","М.А. Молотков",
                "3 Обеспечение качества функционирования компьютерных систем","И.Д. Козик",
                "4 Системное программирование ","М.А. Молотков",
                " "," "));
        movies.add(new Model("Среда","2 Управление и автоматизация баз данных","П.А. Елистратова",
                "3 Физическая культура","Д.М. Салоникес",
                "4 Безопасность жизнедеятельности","В.И. Ключник",
                "5 Управление и автоматизация баз данных","В.А. Курносова", " "," "));
        movies.add(new Model("Четверг",
                "1 Технология разработки и защиты баз данных\n Численные методы",
                "М.С. Прищеп\n К.В. Мотыльков",
                "2 Обеспечение качества функционирования компьютерных систем","И.Д. Козик",
                "3 Внедрение и поддержка компьютерных систем","Н.Е. Кудяков",
                "4 Разработка мобильных приложений","М.А. Молотков",
                " "," "));
        movies.add(new Model("Пятница","2 Технология разработки и защиты баз данных","М.С. Прищеп",
                "3 Стандартизация, сертификация и техническое документоведение","И.Ю. Ермачкова",
                "4 Менеджмент в профессиональной деятельности\n Инструментальные средства разработки ПО","С.С. Андрианова\n М.А. Молотков",
                "5 Иностранный язык в профессиональной деятельности","Д.С. Варламова, М.В. Пискаева ",
                " "," "));
        movies.add(new Model("Суббота","","", "","", " "," ", " "," ", " "," "));
    }
}