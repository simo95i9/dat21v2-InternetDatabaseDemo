package gredal.internetdatabasedemo.controllers;

import gredal.internetdatabasedemo.repositories.MovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    MovieRepository movieRepository = new MovieRepository();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("movies", movieRepository.getAll());
        return "index";
    }

}
