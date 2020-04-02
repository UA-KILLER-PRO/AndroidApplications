package com.example.laba3list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = findViewById(R.id.listView);
        //Лист в котором будут храниться объект с информацией о группе
        List<GamesGroup> gamesGroupList = setDataToList();
        //Адаптер для отображения элементов списка
        MyAdapter adapter = new MyAdapter(gamesGroupList,this);
        // Устанавливаем наш адаптер для ListView
        list.setAdapter(adapter);
    }

    //В методе создается 6 объектов MusicGroup,заполняются данными и добавляются в List
    private List<GamesGroup> setDataToList() {
        List<GamesGroup> list = new ArrayList<>();
        //Данные о группах беруться из ресурсов в файле strings
        GamesGroup witcher3 = new GamesGroup(
                R.string.witcher3_name,R.string.witcher3_genre,R.string.witcher3a_year,
                R.drawable.witcher, R.string.witcher3_description,
                R.string.witcher3_info);

        GamesGroup cyberPunk = new GamesGroup(
                R.string.cyberpunk2077_name,R.string.cyberpunk2077_genre,R.string.cyberpunk2077_year,
                R.drawable.cyberpunk, R.string.cyberpunk2077_description,
                R.string.cyberpunk2077_info);

        GamesGroup battlefield = new GamesGroup(
                R.string.battlefield4_name,R.string.battlefield4_genre,R.string.battlefield4_year,
                R.drawable.battlefield4, R.string.battlefield4_description,
                R.string.battlefield4_info);

        GamesGroup borderlands = new GamesGroup(
                R.string.borderlands3_name,R.string.borderlands3_genre,R.string.borderlands3_year,
                R.drawable.borderlands3, R.string.borderlands3_description,
                R.string.borderlands3_info);

        GamesGroup codMW = new GamesGroup(
                R.string.codmw_name,R.string.codmw_genre,R.string.codmw_year,
                R.drawable.codmw, R.string.codmw_description,
                R.string.codmw_info);

        GamesGroup darkSouls = new GamesGroup(
                R.string.darksouls3_name,R.string.darksouls3_genre,R.string.darksouls3_year,
                R.drawable.darksouls3, R.string.darksouls3_description,
                R.string.darksouls3_info);

        //Создаем наш список с объектами
        list.add(witcher3);
        list.add(cyberPunk);
        list.add(battlefield);
        list.add(borderlands);
        list.add(codMW);
        list.add(darkSouls);
        return list;
    }
}
