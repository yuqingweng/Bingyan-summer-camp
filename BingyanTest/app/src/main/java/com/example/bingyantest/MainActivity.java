package com.example.bingyantest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Test> testList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager((this));
        recyclerView.setLayoutManager(layoutManager);
        TestAdapter adapter = new TestAdapter(testList);
        recyclerView.setAdapter(adapter);
        display();
    }
    private void  display(){
        for(int i=0;i<1;i++){
            Test new_1=new Test("淘宝上十几块的衣服也能穿",R.drawable.new_1_pic);
            testList.add(new_1);
        }
    }
}