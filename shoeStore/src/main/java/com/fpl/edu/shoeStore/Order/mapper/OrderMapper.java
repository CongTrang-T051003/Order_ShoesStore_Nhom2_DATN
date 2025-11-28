package com.fpl.edu.shoeStore.Order.mapper;

import com.fpl.edu.shoeStore.Order.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<Order> findAll();
    Order findById(@Param("orderId") Long orderId);
    int insert(Order order);
    int update(Order order);
    int deleteById(@Param("orderId") Long orderId);
    List<Order> findAllPaged(
            @Param("userId") Long userId,
            @Param("status") String status,
            @Param("offset") int offset,
            @Param("size") int size
    );
    long countAll(
            @Param("userId") Long userId,
            @Param("status") String status
    );
}
