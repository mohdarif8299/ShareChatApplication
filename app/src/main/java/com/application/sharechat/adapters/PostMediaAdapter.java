package com.application.sharechat.adapters;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.PopupMenu;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import com.application.sharechat.R;

import java.util.ArrayList;
import java.util.List;

public class PostMediaAdapter extends RecyclerView.Adapter<PostMediaAdapter.ViewHolder> {
    Context context;

    public PostMediaAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public PostMediaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.feed_layout_images, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostMediaAdapter.ViewHolder holder, int position) {
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        List<String> list = new ArrayList<>();
        list.add("https://cdn.lynda.com/course/648935/648935-636923994927298273-16x9.jpg");
        list.add("https://www.bacancytechnology.com/blog/wp-content/uploads/2019/02/best-web-dev-technology-1024x559.jpg");
        list.add("https://www.bacancytechnology.com/blog/wp-content/uploads/2018/08/Full-Stack-Dev-1024x559.jpg");
        list.add("https://firebasestorage.googleapis.com/v0/b/bookify-1cc7c.appspot.com/o/java13.mp4?alt=media&token=349c88be-a21d-4177-9c5a-7af8e801cae2");
        list.add("https://firebasestorage.googleapis.com/v0/b/bookify-1cc7c.appspot.com/o/google_jobs.mp4?alt=media&token=5064d7b7-e9a9-4ccc-ae6d-19159285e019");
        list.add("hellothis is a simple regarding java web development  lt=media&token=5064d7b7-e9a9-4ccc-ae6d-19159285e019");
        MediaAdapter adapter = new MediaAdapter(context, list);
        holder.recyclerView.setAdapter(adapter);
        SnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(holder.recyclerView);
        int[] attrs = new int[]{R.attr.selectableItemBackground};
        TypedArray typedArray = context.obtainStyledAttributes(attrs);
        int backgroundResource = typedArray.getResourceId(0, 0);
        holder.popup_menu.setBackgroundResource(backgroundResource);
        holder.popup_menu.setOnClickListener(v -> {
            PopupMenu popup = new PopupMenu(context, holder.popup_menu);
            popup.getMenuInflater().inflate(R.menu.post_options, popup.getMenu());
            popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                public boolean onMenuItemClick(MenuItem item) {
                    return true;
                }
            });
            popup.show();
        });
        holder.like.setOnClickListener(v -> {
            final Animation myAnim = AnimationUtils.loadAnimation(context, R.anim.bounce);
            holder.like.playSoundEffect(0);
            holder.like.setBackgroundResource(R.drawable.like);
            holder.like.startAnimation(myAnim);
        });
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recyclerView;
        ImageView popup_menu;
        ImageView like;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = itemView.findViewById(R.id.inner_recycler);
            popup_menu = itemView.findViewById(R.id.popup);
            like = itemView.findViewById(R.id.like);
        }
    }
}
