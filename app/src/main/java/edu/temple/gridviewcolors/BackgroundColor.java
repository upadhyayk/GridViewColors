package edu.temple.gridviewcolors;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

public class BackgroundColor extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_color2);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.backgroundColorId);
        Intent intent = getIntent();
        int position = intent.getIntExtra("colorToChangeTo", Color.WHITE);

        if (position == 0) {
            relativeLayout.setBackgroundColor(Color.BLACK);
        } else if (position == 1) {
            relativeLayout.setBackgroundColor(Color.BLUE);
        }else if(position == 2) {
            relativeLayout.setBackgroundColor(Color.CYAN);
        }else if(position == 3) {
            relativeLayout.setBackgroundColor(Color.DKGRAY);
        }else if(position == 4) {
            relativeLayout.setBackgroundColor(Color.GRAY);
        }else if(position == 5) {
            relativeLayout.setBackgroundColor(Color.GREEN);
        }else if(position == 6) {
            relativeLayout.setBackgroundColor(Color.LTGRAY);
        }else if(position == 7) {
            relativeLayout.setBackgroundColor(Color.MAGENTA);
        }else if(position == 8) {
            relativeLayout.setBackgroundColor(Color.RED);
        }else if(position == 9) {
            relativeLayout.setBackgroundColor(Color.TRANSPARENT);
        }else if(position == 10) {
            relativeLayout.setBackgroundColor(Color.WHITE);
        }else if(position == 11) {
            relativeLayout.setBackgroundColor(Color.YELLOW);
        }
    }
}

