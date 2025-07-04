package com.orchids.repository;

import com.orchids.pojo.Orchid;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrchidRepository extends MongoRepository<Orchid, String> {
    List<Orchid> findByCategory_CategoryId(String categoryId);
    List<Orchid> findByStatus(String status);
}
