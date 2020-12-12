package com.mj.admin.web;

import com.mj.admin.config.auth.LoginUser;
import com.mj.admin.config.auth.dto.SessionUser;
import com.mj.admin.service.posts.PostsService;
import com.mj.admin.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {
    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) {
        if (user != null) {
            model.addAttribute("user", user);
        }
        return "index";
    }

    @GetMapping("/project")
    public String project(Model model, @LoginUser SessionUser user) {
        if (user != null) {
            model.addAttribute("user", user);
        }
        return "project";
    }

    @GetMapping("/project/{name}")
    public String project(Model model, @LoginUser SessionUser user, @PathVariable String name) {
        if (user != null) {
            model.addAttribute("user", user);
        }
        return "project/" + name;
    }

    @GetMapping("/about")
    public String about(Model model, @LoginUser SessionUser user) {
        if (user != null) {
            model.addAttribute("user", user);
        }
        return "about";
    }

    @GetMapping("/login")
    public String login(@LoginUser SessionUser user) {
        if (user != null) {
            return "error/401";
        }
        return "login";
    }

    @GetMapping("posts/save")
    public String save() {
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String update(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }
}
