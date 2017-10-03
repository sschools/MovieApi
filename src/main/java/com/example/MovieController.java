package com.example;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
public class MovieController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home () {
        return "home";
    }

    @RequestMapping(path = "/now-playing", method = RequestMethod.GET)
    public String nowplaying () {
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