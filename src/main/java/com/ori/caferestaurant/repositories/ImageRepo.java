package com.ori.caferestaurant.repositories;

import com.ori.caferestaurant.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ImageRepo extends JpaRepository<Image, Long> {

}


