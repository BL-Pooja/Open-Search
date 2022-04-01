package com.bl.opensearch;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class SearchController {

    private OpensearchApplication opensearchApplication;

    @GetMapping("/searchNote")
    public ResponseEntity<List<Object>> searchNote(@RequestParam String query){
        List<Object> response=opensearchApplication.searchData(query);//(query);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }
}
