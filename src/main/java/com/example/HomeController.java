package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.views.View;
import jakarta.annotation.security.PermitAll;

import java.util.Collections;
import java.util.Map;

@Controller
class HomeController {

    @Produces(MediaType.TEXT_HTML)
    @PermitAll
    @Get
    @View("index")
    Map<String, Object> index() {
        return Collections.emptyMap();
    }
}
