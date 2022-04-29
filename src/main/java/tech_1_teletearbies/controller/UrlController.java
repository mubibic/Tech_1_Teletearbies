package tech_1_teletearbies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tech_1_teletearbies.Service.UrlService;
import tech_1_teletearbies.entity.Url;

import java.util.List;

@Controller
public class UrlController {
    @Autowired
    UrlService urlService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/code")
    //The model is the one responsible for the relationship between the frontend and backend
    public String showImageList(Model model) {
        return "snippets";
    }

    @RequestMapping("/git")
    //The model is the one responsible for the relationship between the frontend and backend
    public String database(Model model) {
        List<Url> listUrl = urlService.getAllUrl();
        model.addAttribute("listUrl", listUrl);
        return "gitHub";
    }

}
