package com.ori.caferestaurant.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "images") // this is the table name in the database
public class Image {
    @Id
    private long id;
    private String image_data;

    public Image(long id, String image_data) {
        this.id = id;
        this.image_data = image_data;
    }

    public Image() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImage_data() {
        return image_data;
    }

    public void setImage_data(String image_data) {
        this.image_data = image_data;
    }

    @Override
    public String toString() {
        return " Image { " +
                "id=" + id +
                ", image_data='" + image_data + '\'' +
                '}';
    }
}
