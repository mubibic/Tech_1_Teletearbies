package tech_1_teletearbies.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech_1_teletearbies.entity.Url;
import tech_1_teletearbies.repository.UrlRepo;

import java.util.List;
import java.util.Optional;

@Service
public class UrlService {

    @Autowired
    private UrlRepo urlRepo;

    public Url getUrl(Integer id) {
        Optional<Url> result = urlRepo.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        return null;
    }

    public void saveUrl(Url url){
        urlRepo.save(url);
    }

    public List<Url> getAllUrl(){
        return (List<Url>) urlRepo.findAll();
    }

}