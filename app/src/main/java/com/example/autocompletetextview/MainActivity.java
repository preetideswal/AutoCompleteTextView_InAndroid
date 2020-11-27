package com.example.autocompletetextview;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.AutoCompleteTextView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
public class MainActivity extends AppCompatActivity {
    TextView txt;
    AutoCompleteTextView autocmp;
    String[] item={"words","preeti","abhishek","deswal"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView)findViewById(R.id.text);
        autocmp=(AutoCompleteTextView)findViewById(R.id.auto);
        autocmp.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_single_choice,item));
        autocmp.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?>parent,View v, int pos, long id){
                txt.setText(autocmp.getText());
            }
        });
    }
}