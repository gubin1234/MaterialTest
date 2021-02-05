package com.example.materialtest;

/**
 * @ 作者: GB
 * @ 类名: Fruit
 * @ 包名: com.example.materialtest
 * @ 描述:
 * @ 日期: 2021/2/2 0002 下午 02:11
 **/
public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
