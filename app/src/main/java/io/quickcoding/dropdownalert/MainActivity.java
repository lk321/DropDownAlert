package io.quickcoding.dropdownalert;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DropDownAlert downAlertImage;
    private DropDownAlert downAlertNoImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button show_without_image=(Button)findViewById(R.id.show_without_image);
        Button show_with_image=(Button)findViewById(R.id.show_with_image);

        downAlertImage=new DropDownAlert(this,getWindow().getContext(),true);
        downAlertNoImage=new DropDownAlert(this,getWindow().getContext(),false);


        show_without_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downAlertNoImage.setTitle("Warning!");
                downAlertNoImage.setContent("Do NOT click");
                downAlertNoImage.show();

            }
        });

        show_with_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.logos);
                downAlertImage.setBitmap(bm);
                downAlertImage.setTitle("Quickcoding");
                downAlertImage.setContent("Hello World!");
                downAlertImage.show();
            }
        });

        downAlertImage.setTraffictListener(new DropDownAlert.DropDownAlertListener() {
            @Override
            public void onClick(View v) {

                Toast toast = Toast.makeText(getApplicationContext(),"You just click me !!",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();

            }
        });


        downAlertNoImage.setTraffictListener(new DropDownAlert.DropDownAlertListener() {
            @Override
            public void onClick(View v) {

                Toast toast = Toast.makeText(getApplicationContext(),"You just click me !!",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();

            }
        });


    }
}
