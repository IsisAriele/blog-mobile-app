package com.example.blog;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CreatePostActivity extends AppCompatActivity {

    private EditText etTitle, etAuthor, etDescription;
    private Button btnSubmitPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);

        // Inicializa os campos de entrada e o botão
        etTitle = findViewById(R.id.et_title);
        etAuthor = findViewById(R.id.et_author);
        etDescription = findViewById(R.id.et_description);
        btnSubmitPost = findViewById(R.id.btn_submit_post);

        // Quando o usuário clica no botão Enviar
        btnSubmitPost.setOnClickListener(v -> {
            // Captura os valores dos campos
            String title = etTitle.getText().toString();
            String author = etAuthor.getText().toString();
            String description = etDescription.getText().toString();

            // Retorna os dados para a MainActivity
            Intent intent = new Intent();
            intent.putExtra("title", title);
            intent.putExtra("author", author);
            intent.putExtra("description", description);
            setResult(RESULT_OK, intent);
            finish(); // Fecha a CreatePostActivity
        });
    }
}
