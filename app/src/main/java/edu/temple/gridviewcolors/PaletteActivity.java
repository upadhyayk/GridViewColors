package edu.temple.gridviewcolors;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RelativeLayout;

public class PaletteActivity extends Activity {

    GridView gridView;
    public static final String[] colors = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Red", "Transparent", "White", "Yellow"};

    RelativeLayout constraintLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        final Intent intent = new Intent(PaletteActivity.this, BackgroundColor.class);

        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new GridAdapter(PaletteActivity.this, colors));
        constraintLayout = (RelativeLayout) findViewById(R.id.gridViewMain);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                intent.putExtra("colorToChangeTo", position);
                startActivity(intent);
            }

        });
    }
}