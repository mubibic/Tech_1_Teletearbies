package Service;


import entity.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ImageRepo;

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
}