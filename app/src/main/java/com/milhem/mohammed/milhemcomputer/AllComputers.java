package com.milhem.mohammed.milhemcomputer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class AllComputers extends AppCompatActivity {
    private Button btnAdd;
    private ListView ListV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_computers);
        btnAdd = (Button) findViewById(R.id.btnAdd);
       initListview();
    }
    private void  initListview()
    {
        ListV = (ListView) findViewById(R.id.ListV);
        String [] a={"one","two","three"};
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,a);
        ListV.setAdapter(adapter);
    }
    public void onClick(View v)
    {
        if (v==btnAdd) {
            Intent intent = new Intent(getBaseContext(), AddComputer.class);
            startActivity(intent);
            finish();
}}}
