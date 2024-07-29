package com.smitha.fd_restaurant_listing_service.mapper;


import com.smitha.fd_restaurant_listing_service.dto.RestaurantDTO;
import com.smitha.fd_restaurant_listing_service.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {
    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);
    Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);
    RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);
}
