package com.example.a05_02_2026_menus_demo;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public final int MENU_SETTINGS = 1,MENU_PHONE_SETTINGS = 2,
            MENU_DISPLAY_SETTINGS = 3, MENU_HELP = 4,
            MENU_ABOUT = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Toast.makeText(this, "onCreateOptionsMenu method called", Toast.LENGTH_LONG).show();
        SubMenu settingsSubMenu = menu.addSubMenu(1,MENU_SETTINGS,1,"Settings");
                                settingsSubMenu.add(1,MENU_PHONE_SETTINGS,1,"Phone Settings");
                                settingsSubMenu.add(1,MENU_DISPLAY_SETTINGS,1,"Display Settings");

        MenuItem helpMenuItem = menu.add(2,MENU_HELP,2,"Help");
        MenuItem aboutMenuItem = menu.add(3,MENU_ABOUT,3,"About");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Toast.makeText(this, "onPrepareOptionsMenu method called", Toast.LENGTH_LONG).show();
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, "onOptionsItemSelected method called", Toast.LENGTH_LONG).show();

        int itemId = item.getItemId();

        switch (itemId){
            case 1 :
                Log.e("menu","Settings Menu Item Selected");
                break;
            case 2 :
                Log.e("menu","Phone settings Menu Item Selected");
                break;
            case 3 :
                Log.e("menu","Display settings Menu Item Selected");
                break;
            case 4 :
                Log.e("menu","Help Menu Item Selected");
                break;
            case 5 :
                Log.e("menu","About Menu Item Selected");
                break;
            default:
                Log.e("menu","No case matched");
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
        Toast.makeText(this, "onOptionsMenuClosed method called", Toast.LENGTH_LONG).show();
    }
}