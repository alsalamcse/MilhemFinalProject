package com.milhem.mohammed.milhemcomputer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddComputer extends AppCompatActivity {
    private Button btnSave;
    private EditText etKind;
    private EditText etPrice;
    private EditText etSpace;
    private EditText etRam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_computer);
        btnSave = (Button) findViewById(R.id.btnSave);
        etKind = (EditText) findViewById(R.id.etKind);
        etPrice = (EditText) findViewById(R.id.etPrice);
        etSpace = (EditText) findViewById(R.id.etSpace);
        etRam = (EditText) findViewById(R.id.etRam);
    }
    public void onClick(View v) {
        if (v == btnSave) {
          String k=etKind.getText().toString();
          String p=etPrice.getText().toString();
         String s=etSpace.getText().toString();
          String r=etRam.getText().toString();

          MyComputer myComputer=new MyComputer();

          myComputer.setKind(k);
          myComputer.setPrice(p);
          myComputer.setSpace(s);
          myComputer.setRam(r);
          MyComputerTable myComputerTable=new MyComputerTable(this);
          myComputerTable.AddComputer(myComputer);
            Intent intent = new Intent(getBaseContext(), AllComputers.class);
            startActivity(intent);
}}}
