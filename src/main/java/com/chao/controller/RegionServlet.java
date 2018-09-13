package com.chao.controller;

import com.chao.bean.Region;
import com.chao.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/region")
public class RegionServlet {

    @Autowired
    RegionService regionService;

    @RequestMapping("/all")
    @ResponseBody
    public List<Region> getProvinceAll() {
        return regionService.getProvinceAll();
    }

    @RequestMapping("/city/{id}")
    @ResponseBody
    public List<Region> getCity(@PathVariable int id) {
        return regionService.getCity(id);
    }

    @RequestMapping("/area/{id}")
    @ResponseBody
    public List<Region> getArea(@PathVariable int id) {
        return regionService.getArea(id);
    }

}
