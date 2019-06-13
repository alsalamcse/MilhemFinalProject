package com.milhem.mohammed.milhemcomputer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AllComputers extends AppCompatActivity {
    private Button btnAdd;
    private ListView ListV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_computers);
        btnAdd = (Button) findViewById(R.id.btnAdd);

    }
    public void onClick(View v)
    {
        if (v==btnAdd) {
            Intent intent = new Intent(getBaseContext(), AddComputer.class);
            startActivity(intent);
        }}
    private void  initListViewArraySample()
    {

        ListV = (ListView) findViewById(R.id.ListV);
        String [] a={"one","two","three"};
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,a);
        ListV.setAdapter(adapter);
    }
    private void initListView(){
        ListV=(ListView)findViewById(R.id.ListV);
        MyComputerTable m1=new MyComputerTable(this);
        //String[] a={"one", "two", "three"};
        ArrayList<MyComputer> a=m1.getAllComputers();
        ArrayAdapter<MyComputer> adapter= new ArrayAdapter<MyComputer>(this, android.R.layout.simple_expandable_list_item_1, a);
        ListV.setAdapter(adapter);
        ListV.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(AllComputers.this, "position:" + position, Toast.LENGTH_SHORT).show();

                MyComputer m = (MyComputer) parent.getItemAtPosition(position);
                Toast.makeText(AllComputers.this, "Computer:" + m.getKind(), Toast.LENGTH_SHORT).show();
                Intent i = new
                        Intent(Intent.ACTION_DIAL, Uri.parse("Kind:" + m.getKind()));
                startActivity(i);
                finish();
                return true;
            }
        });
    }


}
