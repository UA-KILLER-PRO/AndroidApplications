package com.example.laba3list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GamesGroupInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_group_info);

        ImageView image = findViewById(R.id.image);
        TextView gameName = findViewById(R.id.gameName);
        TextView gameYear = findViewById(R.id.gameYear);
        TextView gameGenre = findViewById(R.id.gameGenre);
        TextView gameInfo = findViewById(R.id.gameInfo);

        //Устанавливаем информацию о группе полученную из предыдущего окна
        image.setImageResource(getIntent().getExtras().getInt("gameIcon"));
        gameName.setText(getIntent().getExtras().getInt("gameName"));
        gameYear.setText(getIntent().getExtras().getInt("gameYear"));
        gameGenre.setText(getIntent().getExtras().getInt("gameGenre"));
        gameInfo.setText(getIntent().getExtras().getInt("gameInfo"));
    }

    //По нажатию на кнопку назад,открывается главное окно со списком
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
