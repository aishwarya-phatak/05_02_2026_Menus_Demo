package com.example.a05_02_2026_menus_demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    ImageView imgView1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imgView1 = findViewById(R.id.imgView1);
        registerForContextMenu(imgView1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.context_menu_1,menu);

        menu.setHeaderTitle("Context Menu");
        menu.setHeaderIcon(R.drawable.ic_launcher_background);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        int menuItemId = item.getItemId();
        Toast.makeText(this, "menu item id  " + menuItemId, Toast.LENGTH_SHORT).show();
        if (menuItemId == R.id.save){
            Log.e("context_menu","Save");
        } else if (menuItemId == R.id.saveAs){
            Log.e("context_menu", "Save As");
        } else if (menuItemId == R.id.copy){
            Log.e("context_menu","Copy");
        } else if (menuItemId == R.id.downloadImage){
            Log.e("context_menu","download image");
        } else if (menuItemId == R.id.saveImageAs){
            Log.e("context_menu","save image as");
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onContextMenuClosed(@NonNull Menu menu) {
        super.onContextMenuClosed(menu);
    }
}
