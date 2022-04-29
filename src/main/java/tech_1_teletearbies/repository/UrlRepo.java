package tech_1_teletearbies.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tech_1_teletearbies.entity.Url;

@Repository
public interface UrlRepo extends CrudRepository<Url, Integer> {


}
