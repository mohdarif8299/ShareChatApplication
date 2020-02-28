package com.application.sharechat.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.application.sharechat.R;

public class TextPostAdapter extends RecyclerView.Adapter<TextPostAdapter.ViewHolder> {
    Context context;

    public TextPostAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public TextPostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.layout_text_post, parent, false);
        return new TextPostAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TextPostAdapter.ViewHolder holder, int position) {
               String s = "Hello World !!! Welcome to the world of programming in android ";
               holder.textView.setText(s);
    }

    @Override
    public int getItemCount() {
        return 1;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
  TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text);
        }
    }
}
