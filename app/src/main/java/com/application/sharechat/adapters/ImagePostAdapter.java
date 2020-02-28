package com.application.sharechat.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.application.sharechat.R;
import com.bumptech.glide.Glide;

public class ImagePostAdapter extends RecyclerView.Adapter<ImagePostAdapter.ViewHolder> {
    Context context;

    public ImagePostAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ImagePostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.layout_image_post, parent, false);
        return new ImagePostAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImagePostAdapter.ViewHolder holder, int position) {
               String s = "https://toxsl.com/file/files/spring_boot-1.png";
        Glide.with(context).load(s).into(holder.textView);
    }

    @Override
    public int getItemCount() {
        return 1;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
  ImageView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text);
        }
    }
}
