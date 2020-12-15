package cn.kgc.community.controller;

import cn.kgc.community.dto.PageDTO;
import cn.kgc.community.model.User;
import cn.kgc.community.service.QusetionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * create by 王甲廷 on 2020/9/21 14:47
 */
@Controller
public class ProfileController {

    @Autowired
    private QusetionService qusetionService;


    @GetMapping("/profile/{action}")
    public String profiile(@PathVariable(name = "action") String action,
                           Model model,
                           HttpServletRequest request,
                           @RequestParam(name = "page", defaultValue = "1") Integer page,
                           @RequestParam(name = "size", defaultValue = "6") Integer size){

        User user=(User) request.getSession().getAttribute("user");
        if (user == null){
            return "redirect:/";
        }
        if ("questions".equals(action)){
            model.addAttribute("section","questions");
            model.addAttribute("sectionName","我的问题");
        }else if ("replies".equals(action)){
            model.addAttribute("section","replies");
            model.addAttribute("sectionName","最新回复");
        }

        PageDTO pageDTO = qusetionService.findAll(user.getId(), page, size);
        model.addAttribute("pageDTO",pageDTO);
        return "profile";
    }
}
