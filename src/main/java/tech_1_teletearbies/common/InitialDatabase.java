package tech_1_teletearbies.common;

import tech_1_teletearbies.Service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import tech_1_teletearbies.entity.Url;

import javax.annotation.PostConstruct;

@Configuration
public class InitialDatabase {

   @Autowired
   public UrlService urlService;

 /* @PostConstruct
   public void initializeDB(){
     Url url1 = new Url("Our github repository for our spring project", "https://github.com/mubibic/Tech_1_Teletearbies");
     Url url2= new Url("Our github repository for our bouncing ball project", "https://github.com/mubibic/Mandatory_2_Tech");
     urlService.saveUrl(url1);
     urlService.saveUrl(url2);

   }*/
}
