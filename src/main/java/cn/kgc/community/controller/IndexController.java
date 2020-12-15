package cn.kgc.community.controller;

import cn.kgc.community.dto.PageDTO;
import cn.kgc.community.service.QusetionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * create by 王甲廷 on 2020/9/15 9:17
 */
@Controller
public class IndexController {

    @Autowired
    private QusetionService qusetionService;

    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "1") Integer page,
                        @RequestParam(name = "size", defaultValue = "6") Integer size){

        PageDTO questionList=qusetionService.findAll(page,size);
        model.addAttribute("questionList",questionList);
        return "index";
    }
}
