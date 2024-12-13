package com.example.blog;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private Button btnRegister;
    private List<Post> postList = new ArrayList<>();
    private PostAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        btnRegister = findViewById(R.id.btn_register);

        postList.add(new Post("Título 1", "Autor 1", "Esta é a descrição do primeiro post.", R.drawable.imagem1));
        postList.add(new Post("Título 2", "Autor 2", "Esta é a descrição do segundo post.", R.drawable.imagem1));

        adapter = new PostAdapter(this, postList);
        listView.setAdapter(adapter);

        btnRegister.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CreatePostActivity.class);
            startActivity(intent);
        });
    }
}
