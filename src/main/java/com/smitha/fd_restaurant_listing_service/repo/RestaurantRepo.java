package com.smitha.fd_restaurant_listing_service.repo;

import com.smitha.fd_restaurant_listing_service.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Integer> {
}
