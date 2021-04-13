package com.example.myapplication.data

import com.example.myapplication.R
import com.example.myapplication.data.model.Post

class Datasource() {

    fun loadPosts(): List<Post> {
        return listOf<Post>(
            Post(R.string.author1,R.string.post1, R.mipmap.image_1_foreground),
            Post(R.string.author2,R.string.post2, R.mipmap.image_2_foreground),
            Post(R.string.author3,R.string.post3, R.mipmap.image_3_foreground),
            Post(R.string.author4,R.string.post4, R.mipmap.image_4_foreground),
            Post(R.string.author5,R.string.post5, R.mipmap.image_5_foreground),
            Post(R.string.author6,R.string.post6, R.mipmap.image_6_foreground),
            Post(R.string.author7,R.string.post7, R.mipmap.image_7_foreground),
            Post(R.string.author8,R.string.post8, R.mipmap.image_8_foreground),
            Post(R.string.author9,R.string.post9, R.mipmap.image_9_foreground),
            Post(R.string.author10,R.string.post10, R.mipmap.image_10_foreground),
            Post(R.string.author11,R.string.post11, R.mipmap.image_11_foreground),
            Post(R.string.author12,R.string.post12, R.mipmap.image_12_foreground),
            Post(R.string.author13,R.string.post13, R.mipmap.image_13_foreground),
            Post(R.string.author14,R.string.post14, R.mipmap.image_14_foreground),
            Post(R.string.author15,R.string.post15, R.mipmap.image_15_foreground),
            Post(R.string.author16,R.string.post16, R.mipmap.image_16_foreground),
            Post(R.string.author17,R.string.post17, R.mipmap.image_17_foreground),
            Post(R.string.author18,R.string.post18, R.mipmap.image_18_foreground),
            Post(R.string.author19,R.string.post19, R.mipmap.image_19_foreground),
            Post(R.string.author20,R.string.post20, R.mipmap.image_20_foreground),
            Post(R.string.author21,R.string.post21, R.mipmap.image_21_foreground),
            Post(R.string.author22,R.string.post22, R.mipmap.image_22_foreground),
            Post(R.string.author23,R.string.post23, R.mipmap.image_23_foreground),
            Post(R.string.author24,R.string.post24, R.mipmap.image_24_foreground),
            Post(R.string.author25,R.string.post25, R.mipmap.image_25_foreground),
            Post(R.string.author26,R.string.post26, R.mipmap.image_26_foreground),
            Post(R.string.author27,R.string.post27, R.mipmap.image_27_foreground),
            Post(R.string.author28,R.string.post28, R.mipmap.image_28_foreground),
            Post(R.string.author29,R.string.post29, R.mipmap.image_29_foreground),
            Post(R.string.author30,R.string.post30, R.mipmap.image_30_foreground)
        )
    }
}
