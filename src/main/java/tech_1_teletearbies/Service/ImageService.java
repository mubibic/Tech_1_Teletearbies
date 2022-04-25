package tech_1_teletearbies.Service;

import tech_1_teletearbies.entity.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech_1_teletearbies.repository.ImageRepo;

import java.util.List;
import java.util.Optional;

@Service
public class ImageService {

    @Autowired
    private ImageRepo imageRepo;

    public Image getImages(Integer id) {
        Optional<Image> result = imageRepo.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        return null;
    }

    public void saveImage(Image image){
        imageRepo.save(image);
    }

    public List<Image> getAllImages(){
        return (List<Image>) imageRepo.findAll();
    }

}