package com.example.mamunzahir.myapplication;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class LIstActivity extends AppCompatActivity {
    String myStringArray[]={"Mamun","Jahir","Mamun","Jahir","Mamun","Jahir","Mamun","Jahir"};
    Toolbar toolbar;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        b= (Button) findViewById(R.id.mybutton);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorAccent));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, myStringArray);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
b.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    b.setText(toolbar.getTitle().toString());
        CustomDialogClass cdd = new CustomDialogClass(LIstActivity.this);
        cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        cdd.show();
    }
});


    }

}
