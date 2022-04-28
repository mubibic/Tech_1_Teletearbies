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

   @PostConstruct
   public void initializeDB(){
      Image image1 = new Image("Bogi Wogi");
      Image image2 = new Image("Fe Buffet");
      Image image3 = new Image("Dani Banani");
      Image image4 = new Image("Mubrick Brack");


   }

}
