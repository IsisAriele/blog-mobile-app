package com.example.blog;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PostDetailActivity extends AppCompatActivity {

    private TextView tvPostTitle, tvPostAuthor, tvPostDescription;
    private ImageView ivPostImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_detail);

        // Inicialização dos componentes da tela
        ivPostImage = findViewById(R.id.iv_post_image);
        tvPostTitle = findViewById(R.id.tv_post_title);
        tvPostAuthor = findViewById(R.id.tv_post_author);
        tvPostDescription = findViewById(R.id.tv_post_description);

        // Recuperação dos dados enviados pela MainActivity
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String author = intent.getStringExtra("author");
        String description = intent.getStringExtra("description");
        int imageResId = intent.getIntExtra("imageResId", R.drawable.imagem1); // Imagem padrão caso não seja enviada

        // Preenchimento dos campos
        tvPostTitle.setText(title);
        tvPostAuthor.setText("Por " + author);
        tvPostDescription.setText(description);
        ivPostImage.setImageResource(imageResId);
    }
}
