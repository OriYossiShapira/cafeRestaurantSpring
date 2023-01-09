package com.ori.caferestaurant.services;

import com.ori.caferestaurant.entities.Image;
import com.ori.caferestaurant.repositories.ImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImageService {

    @Autowired
    private ImageRepo imageRepo;
   private List<String> imageList;

   public List<Image> getImages() {
       return imageRepo.findAll();}
    public String getImage(int id) {
        if(id < 0 || id >= imageList.size()) {
            return "Image not found";
        }
        return imageList.get(id);
    }

    public ImageService() {

        imageList = new ArrayList<String>();
        imageList.add("1.png");
        imageList.add("1a.png");
        imageList.add("1ab.png");
        imageList.add("1abc.png");

    }
}
