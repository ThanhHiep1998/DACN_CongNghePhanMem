package com.example.hoteladmin.controller;

import com.example.hoteladmin.model.User;
import com.example.hoteladmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public String user(Model model) {
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList", userList);
        return "user/alluser";
    }


    @GetMapping("/add")
    public String addUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "user/adduser";
    }

    @GetMapping("/edit")
    public String editUser(@RequestParam("id") Long id, Model model) {
        userService.findOne(id).ifPresent(user -> model.addAttribute("user", user));
        return "user/edituser";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam("id") Long id, Model model) {
        userService.findOne(id).ifPresent(user -> model.addAttribute("user", user));
        return "user/deleteuser";
    }

    @PostMapping("/add")
    public String addUser(@Valid @ModelAttribute("user") User user, BindingResult result) {
        if (result.hasErrors()) {
            return "user/adduser";
        }
        userService.save(user);
        return "redirect:/user/all";
    }

    @PostMapping("/edit")
    public String editUser(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("user", user);
            return "/user/edituser";
        }
        userService.save(user);
        return "redirect:/user/all";
    }

    @PostMapping("/delete")
    public String deleteUser(@RequestParam("id") long id) {
        userService.delete(id);
        return "redirect:/user/all";
    }
}
