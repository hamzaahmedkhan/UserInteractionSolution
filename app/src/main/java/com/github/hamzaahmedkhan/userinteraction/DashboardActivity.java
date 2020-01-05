package com.github.hamzaahmedkhan.userinteraction;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {


    Button btnClickableImages;
    Button btnInputControls;
    Button btnMenusAndPickers;
    Button btnUserNavigation;
    Button btnRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // Initializing Views
        btnClickableImages = findViewById(R.id.btnClickableImages);
        btnInputControls = findViewById(R.id.btnInputControls);
        btnMenusAndPickers = findViewById(R.id.btnMenusAndPickers);
        btnUserNavigation = findViewById(R.id.btnUserNavigation);
        btnRecyclerView = findViewById(R.id.btnRecyclerView);




        // Setting On Click Listeners

        btnClickableImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 2020-01-06 Replace this Toast with Clickable Images lesson
                Toast.makeText(DashboardActivity.this, "This is Clickable images", Toast.LENGTH_SHORT).show();
            }
        });

        btnInputControls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 2020-01-06 Replace this Toast with Input Control lesson
//                Toast.makeText(DashboardActivity.this, "This is input controls", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DashboardActivity.this, InputControlActivity.class);
                startActivity(intent);
            }
        });

        btnMenusAndPickers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 2020-01-06 Replace this Toast with Menus and Pickers lesson
//                Toast.makeText(DashboardActivity.this, "This is Menus And Pickers", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(DashboardActivity.this, MenusAndPickersActivity.class);
                startActivity(intent);
            }
        });

        btnUserNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 2020-01-06 Replace this Toast with User Navigation lesson
                Intent intent = new Intent(DashboardActivity.this, UserNavigationActivity.class);
                startActivity(intent);
            }
        });

        btnRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 2020-01-06 Replace this Toast with Recycler View lesson
//                Toast.makeText(DashboardActivity.this, "This is User Recycler View", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(DashboardActivity.this, RecyclerViewActivity.class);
                startActivity(intent);

            }
        });

    }

}
