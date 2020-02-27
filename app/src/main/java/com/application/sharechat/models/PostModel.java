package com.application.sharechat.models;

import java.util.List;
import java.util.Map;

public class PostModel {
  private List<String> images;
  private Map<String,List<String>> videos;
  private String texPost;

    public PostModel(Map<String, List<String>> videos, int i) {
        this.videos = videos;
        this.i = i;
    }

    private int i;

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public PostModel(String texPost) {
        this.texPost = texPost;
    }

    public PostModel(List<String> images) {
        this.images = images;
    }


    public String getTexPost() {
        return texPost;
    }

    public void setTexPost(String texPost) {
        this.texPost = texPost;
    }

    public PostModel() {
    }

    public Map<String,List<String>> getVideos() {
        return videos;
    }

    public void setVideos(Map<String, List<String>> videos) {
        this.videos = videos;
    }

    public PostModel(Map<String, List<String>> videos) {
        this.videos = videos;
    }

    public PostModel(List<String> images, Map<String, List<String>> videos, String texPost) {
        this.images = images;
        this.videos = videos;
        this.texPost = texPost;
    }
}
