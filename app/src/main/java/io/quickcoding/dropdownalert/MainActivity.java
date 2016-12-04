package io.quickcoding.dropdownalert;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private DropDownAlert downAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button show=(Button)findViewById(R.id.show);
        downAlert=new DropDownAlert(this,getWindow().getContext());


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downAlert.setTitle("Warning!");
                downAlert.setContent("Do NOT click");
                downAlert.show();
            }
        });
    }
}
