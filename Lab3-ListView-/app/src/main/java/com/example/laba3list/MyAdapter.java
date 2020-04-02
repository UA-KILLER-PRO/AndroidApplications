package com.example.laba3list;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    //Здесь хранятся объекты с информацией о играх
    private List<GamesGroup> data;
    //Дерево c View элементами
    private LayoutInflater inflater;
    //Для открытия нового окна по нажатию кнопки
    private Context context;

    public MyAdapter(List<GamesGroup> data, Context context) {
        this.data = data;
        this.context = context;
        this.inflater = LayoutInflater.from(context);;
    }

    //Метод хранит количество наших элементов в списке
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Проверяем, есть ли у нас пункт списка для повторного использования
        if (convertView == null)
            convertView = inflater.inflate(R.layout.list, parent, false);

        // Получаем доступ к виджетам дерева объектов
        TextView gameName = convertView.findViewById(R.id.gameName);
        TextView gameGenre = convertView.findViewById(R.id.gameGenre);
        TextView gameYear = convertView.findViewById(R.id.gameYear);
        TextView gameDescription = convertView.findViewById(R.id.gameDescription);
        ImageView gameImage = convertView.findViewById(R.id.image);
        Button button = convertView.findViewById(R.id.button);

        //Обработчик нажатия на кнопку
        button.setOnClickListener(v -> {
            Intent intent = new Intent(context, GamesGroupInfoActivity.class);
            //Передаем данные о группе для отображения в новом окне
            intent.putExtra("gameIcon",data.get(position).getGameIcon());
            intent.putExtra("gameName",data.get(position).getGameName());
            intent.putExtra("gameYear",data.get(position).getGameYear());
            intent.putExtra("gameGenre",data.get(position).getGameGenre());
            intent.putExtra("gameInfo",data.get(position).getGameInfo());
            //Открываем новую активность
            context.startActivity(intent);
        });

        //Меняем содержимое виджетов,заполняя их информацией о игре
        gameName.setText(data.get(position).getGameName());
        gameGenre.setText(data.get(position).getGameGenre());
        gameYear.setText(data.get(position).getGameYear());
        gameDescription.setText(data.get(position).getGameDescription());
        gameImage.setImageResource(data.get(position).getGameIcon());
        //Возвращаем модифицированное дерево объектов
        return convertView;
    }
}