package tech_1_teletearbies.repository;

import tech_1_teletearbies.entity.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepo extends CrudRepository<Image, Integer> {


}
