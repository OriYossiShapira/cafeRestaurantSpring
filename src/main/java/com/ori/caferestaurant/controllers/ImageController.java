package com.ori.caferestaurant.controllers;


import com.ori.caferestaurant.entities.Image;
import com.ori.caferestaurant.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/image")
public class ImageController {

@Autowired
   private ImageService imageService;

    public ImageController(){

    }
    @GetMapping
    public List<Image> getImages () {
        return imageService.getImages();
    }


    // http://locahost:8080/images/1
    @GetMapping("/{id}")
    public String getImage (@PathVariable int id) {

        return imageService.getImage(id);
    }
}
