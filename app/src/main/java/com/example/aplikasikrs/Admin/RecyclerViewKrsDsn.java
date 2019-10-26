package com.example.aplikasikrs.Admin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.aplikasikrs.Admin.Adapter.KrsAdapter;
import com.example.aplikasikrs.Admin.Model.Krs;
import com.example.aplikasikrs.R;

import java.util.ArrayList;

public class RecyclerViewKrsDsn extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KrsAdapter krsAdapter;
    private ArrayList<Krs> krsArrayList;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menucreate,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menu1){
            Intent intent = new Intent(RecyclerViewKrsDsn.this, CreateKrsActivity.class);
            startActivity(intent);
        }
        return  true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_kelola_krs);
        this.setTitle("SI KRS - Hai Dosen");

        tambahData();

        recyclerView = findViewById(R.id.rvKrs);
        krsAdapter = new KrsAdapter(krsArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewKrsDsn.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(krsAdapter);

    }

    public void tambahData(){
        krsArrayList = new ArrayList<>();
        krsArrayList.add(new Krs("SI001","Pemrograman Mobile","Jumat","3","4","Argo Wibowo","30"));
        krsArrayList.add(new Krs("SI001","Pemrograman Mobile","Jumat","3","4","Argo Wibowo","30"));
        krsArrayList.add(new Krs("SI001","Pemrograman Mobile","Jumat","3","4","Argo Wibowo","30"));
        krsArrayList.add(new Krs("SI001","Pemrograman Mobile","Jumat","3","4","Argo Wibowo","30"));
    }
}
