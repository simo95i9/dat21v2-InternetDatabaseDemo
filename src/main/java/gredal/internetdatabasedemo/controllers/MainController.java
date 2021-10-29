package gredal.internetdatabasedemo.controllers;

import gredal.internetdatabasedemo.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private final MovieRepository movieRepository;

    @Autowired
    public MainController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("movies", movieRepository.read());
        return "index";
    }

}
