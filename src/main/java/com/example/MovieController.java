package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import org.springframework.ui.Model;
import java.util.List;

@Controller
public class MovieController {

    static final String API_URL = "https://api.themoviedb.org/3/movie/now_playing?api_key=be2a38521a7859c95e2d73c48786e4bb";

    public static List<Movie> getMovies(String route) {
        RestTemplate restTemplate = new RestTemplate();
        Results movies = restTemplate.getForObject(route, Results.class);
        return movies.getResults();
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home () {
        return "home";
    }

    @RequestMapping(path = "/now-playing", method = RequestMethod.GET)
        public String nowPlaying (Model model) {
            model.addAttribute("movies", getMovies(API_URL));
            return "now-playing";
    }

    @RequestMapping(path = "/medium-popular-long-name", method = RequestMethod.GET)
    public String medium () {
        return "medium-popular-long-name";
    }

    @RequestMapping(path = "/overview-mashup", method = RequestMethod.GET)
    public String overview () {
        return "overview-mashup";
    }
}