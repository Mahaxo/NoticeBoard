package pl.coderslab.noticeboard.controller;

import org.springframework.web.bind.annotation.*;
import pl.coderslab.noticeboard.entity.Advert;

@RestController
public class AdvertController {

    @GetMapping("/")
    public String getInfo() {
        return "String";
    }

    @PostMapping("/")
    public Advert postInfo(@RequestBody Advert advert) {
        return advert;
    }


}
