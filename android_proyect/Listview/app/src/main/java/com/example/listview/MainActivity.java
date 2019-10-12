package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        list = findViewById( R.id.mylistview );
        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource( this, R.array.areas_de_trabajo,android.R.layout.simple_list_item_1 );
        list.setAdapter( adapter );
        list.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText( MainActivity.this, "seleccionado " + adapterView.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        } );
    }
}
