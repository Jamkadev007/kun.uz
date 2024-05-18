package com.example.kunUzPractise.Controller;

import com.example.kunUzPractise.Servise.ArticleTypeService;
import com.example.kunUzPractise.dto.ArticleTypeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("articleType")

public class ArticleTypeController {
    @Autowired
    private ArticleTypeService articleTypeService;

    @PostMapping("/create")
    public ResponseEntity<ArticleTypeDto> create(@RequestBody ArticleTypeDto articleTypeDto) {

        return ResponseEntity.ok().body(articleTypeService.create(articleTypeDto));
    }



}
