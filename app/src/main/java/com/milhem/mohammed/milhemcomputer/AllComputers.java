package com.milhem.mohammed.milhemcomputer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        ListV = (ListView) findViewById(R.id.ListV);
    }
    public void onClick(View v)
    {
        if (v==btnAdd) {
            Intent intent = new Intent(getBaseContext(), AddComputer.class);
            startActivity(intent);
            finish();
}}}
