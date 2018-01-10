package io.github.benkoff.sswaggerui.controllers;

import io.github.benkoff.sswaggerui.model.ResponseBody;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/*
 * Created by Ben Novikov on 2018-01-10
 */
@Controller
public class HomeController implements LinksApi {
    @RequestMapping(value = {"", "/", "index"}, method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    @Override
    public ResponseEntity<ResponseBody> linksGet(Boolean activeOnly, Integer pageSize, Integer pageNumber) {
        return null;
    }

    @Override
    public ResponseEntity<Void> linksIdDelete(String id) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseBody> linksIdGet(String id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> linksIdPut(String id, @Valid ResponseBody link) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseBody> linksPost(@Valid RequestBody link) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseBody> linksUserUserGet(String user, Integer pageSize, Integer pageNumber) {
        return null;
    }
}
