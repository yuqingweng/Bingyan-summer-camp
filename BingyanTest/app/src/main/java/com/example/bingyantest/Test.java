package com.example.bingyantest;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class Test {
        private String name;
        private int imageId;
        public Test(String name, int imageId){
            this.name = name;
            this.imageId = imageId;

        }

        public String getName() {
            return name;
        }

        public int getImageId() {
            return imageId;
        }


}
