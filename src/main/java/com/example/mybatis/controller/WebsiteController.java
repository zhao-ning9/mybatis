package com.example.mybatis.controller;

import com.example.mybatis.entity.Website;
import com.example.mybatis.mapper.WebsiteMapper;
import com.example.mybatis.service.WebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/website")
public class WebsiteController {
    @Autowired
    private WebsiteService websiteService;

    @RequestMapping("/getAllWebsite")
    public List<Website> findAll(){
        return websiteService.findAllWebsite();
    }

    @RequestMapping("/getWebsiteByID/{id}")
    public List<Website> findWebsiteById(@PathVariable int id){
        return websiteService.findWebsiteById(id);
    }
}

