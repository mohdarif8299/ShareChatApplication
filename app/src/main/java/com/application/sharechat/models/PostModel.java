package com.application.sharechat.models;

public class PostModel {

    public static final int TEXT_TYPE = 0;
    public static final int IMAGE_TYPE = 1;
    public static final int VIDEO_TYPE = 2;
    private int type;
    private String text;

    public PostModel(int type, String text) {
        this.type = type;
        this.text = text;
    }
}
