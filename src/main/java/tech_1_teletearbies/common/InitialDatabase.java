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

  /*@PostConstruct
   public void initializeDB(){
      Url url1 = new Url("Our github repository", "https://github.com/mubibic/Tech_1_Teletearbies");
      urlService.saveUrl(url1);
   }*/

}
