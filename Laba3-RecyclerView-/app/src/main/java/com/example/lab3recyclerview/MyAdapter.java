package com.example.lab3recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.PersonViewHolder> {

    //Здесь хранятся объекты с информацией о группах
    private static List<GamesGroup> data;
    //Для открытия нового окна по нажатию кнопки
    private static Context context;

    MyAdapter(List<GamesGroup> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //Дерево элементов
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.layout, viewGroup, false);
        PersonViewHolder holder = new PersonViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder personViewHolder, int i) {
        //Заполнение элементов view данными из списка обьектов
        personViewHolder.gameName.setText(data.get(i).getGameName());
        personViewHolder.gameGenre.setText(data.get(i).getGameGenre());
        personViewHolder.gameYear.setText(data.get(i).getGameYear());
        personViewHolder.gameDescription.setText(data.get(i).getGameDescription());
        personViewHolder.gameIcon.setImageResource(data.get(i).getGameIcon());
        personViewHolder.position = i;
    }

    //Размер списка
    @Override
    public int getItemCount() {
        return data.size();
    }

    static class PersonViewHolder extends RecyclerView.ViewHolder {
        TextView gameName;
        TextView gameGenre;
        TextView gameYear;
        TextView gameDescription;
        ImageView gameIcon;
        Button button;
        int position;
        PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            //Устанавливаем элементы view на странице
            gameName = itemView.findViewById(R.id.gameName);
            gameGenre = itemView.findViewById(R.id.gameGenre);
            gameYear = itemView.findViewById(R.id.gameYear);
            gameDescription = itemView.findViewById(R.id.gameDescription);
            gameIcon = itemView.findViewById(R.id.image);
            button = itemView.findViewById(R.id.button);
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
        }
    }
}