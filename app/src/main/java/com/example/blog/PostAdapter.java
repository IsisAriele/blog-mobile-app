package com.example.blog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import java.util.List;

public class PostAdapter extends ArrayAdapter<Post> {

    public PostAdapter(Context context, List<Post> posts) {
        super(context, 0, posts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_post, parent, false);
        }

        Post post = getItem(position);

        TextView title = convertView.findViewById(R.id.tv_post_title);
        TextView author = convertView.findViewById(R.id.tv_post_author);
        TextView description = convertView.findViewById(R.id.tv_post_description);
        ImageView image = convertView.findViewById(R.id.iv_post_image);

        title.setText(post.getTitle());
        author.setText(post.getAuthor());
        description.setText(post.getDescription());
        image.setImageResource(post.getImageResId());

        return convertView;
    }
}
