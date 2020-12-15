package cn.kgc.community.controller;

import cn.kgc.community.dto.CommentDTO;
import cn.kgc.community.dto.QuestionDTO;
import cn.kgc.community.enums.CommentTypeEnum;
import cn.kgc.community.service.CommentService;
import cn.kgc.community.service.QusetionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * create by 王甲廷 on 2020/9/22 15:25
 */
@Controller
public class QuestionController {

    @Autowired
    private QusetionService qusetionService;

    @Autowired
    private CommentService commentService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Long id, Model model) {
        QuestionDTO questionDTO = qusetionService.getById(id);
        List<CommentDTO> comments = commentService.listByQuestionId(id, CommentTypeEnum.QUESTION);

        //累加阅读数
        qusetionService.incView(id);
        model.addAttribute("question", questionDTO);
        model.addAttribute("comments", comments);
        return "question";
    }
}
