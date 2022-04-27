package tech_1_teletearbies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tech_1_teletearbies.Service.ImageService;
import tech_1_teletearbies.entity.Image;

import java.util.List;

@Controller
public class ImageController {
    @Autowired
    ImageService imageService;
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/git")
    public String codeSnippets() {
        return "codesnippets";
    }


    @RequestMapping("/code")
    //The model is the one responsible for the relationship between the frontend and backend
    public String showImageList(Model model) {
        return "snippets";
    }

}
