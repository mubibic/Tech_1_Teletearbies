package tech_1_teletearbies.common;

import tech_1_teletearbies.Service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import tech_1_teletearbies.entity.Image;

import javax.annotation.PostConstruct;

@Configuration
public class InitialDatabase {

   @Autowired
   public ImageService imageService;

   /*@PostConstruct
   public void initializeDB(){
      Image image1 = new Image("yellowTeletearbies", "image/yellowTeletearbies.jpg");
      Image image2 = new Image("blueTeletearbies", "image/blueTeletearbies.png");
      Image image3 = new Image("greenTeletearbies", "image/greenTeletearbies.png");

      imageService.saveImage(image1);
      imageService.saveImage(image2);
      imageService.saveImage(image3);
   }*/

}
