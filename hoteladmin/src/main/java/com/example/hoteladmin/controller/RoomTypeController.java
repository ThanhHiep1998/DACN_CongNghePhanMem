package com.example.hoteladmin.controller;

import com.example.hoteladmin.model.RoomType;
import com.example.hoteladmin.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/roomtype")
public class RoomTypeController {
    @Autowired
    private RoomTypeService roomTypeService;

    @GetMapping("/all")
    public String roomType(Model model) {
        List<RoomType> roomTypeList = roomTypeService.getAllRoomTypes();
        model.addAttribute("roomTypeList", roomTypeList);
        return "roomtype/allroomtype";
    }


    @GetMapping("/add")
    public String addRoomType(Model model) {
        RoomType roomType = new RoomType();
        model.addAttribute("roomType", roomType);
        return "roomtype/addroomtype";
    }

    @GetMapping("/edit")
    public String editRoomType(@RequestParam("id") Long id, Model model) {
        roomTypeService.findOne(id).ifPresent(roomType -> model.addAttribute("roomType", roomType));
        return "roomtype/editroomtype";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam("id") Long id, Model model) {
        roomTypeService.findOne(id).ifPresent(roomType -> model.addAttribute("roomType", roomType));
        return "roomtype/deleteroomtype";
    }

    @PostMapping("/add")
    public String addRoomType(@Valid @ModelAttribute("roomType") RoomType roomType, BindingResult result) {
        if (result.hasErrors()) {
            return "roomtype/addroomtype";
        }
        roomTypeService.save(roomType);
        return "redirect:/roomtype/all";
    }

    @PostMapping("/edit")
    public String editUser(@Valid @ModelAttribute("roomType") RoomType roomType, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("roomType", roomType);
            return "/roomtype/editroomtype";
        }
        roomTypeService.save(roomType);
        return "redirect:/roomtype/all";
    }

    @PostMapping("/delete")
    public String deleteUser(@RequestParam("id") long id) {
        roomTypeService.delete(id);
        return "redirect:/roomtype/all";
    }
}
