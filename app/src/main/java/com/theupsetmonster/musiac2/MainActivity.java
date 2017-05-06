package com.theupsetmonster.musiac2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton library;
    private ImageButton recent;
    private ImageButton favorites;
    private ImageButton settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        library = (ImageButton) findViewById(R.id.music_library);
        recent = (ImageButton) findViewById(R.id.recent);
        favorites = (ImageButton) findViewById(R.id.favorites);
        settings = (ImageButton) findViewById(R.id.settings);

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MusicLibraryActivity.class);
                startActivity(intent);
            }
        });

        recent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(intent);
            }
        });

        favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FavoritesActivity.class);
                startActivity(intent);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}
