package com.example.hoteladmin.controller;

import com.example.hoteladmin.model.Room;
import com.example.hoteladmin.model.RoomType;
import com.example.hoteladmin.service.RoomService;
import com.example.hoteladmin.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;
    @Autowired
    private RoomTypeService roomTypeService;

    @GetMapping("/all")
    public String room(Model model) {
        List<Room> roomList = roomService.getAllRoom();
        model.addAttribute("roomList", roomList);

        List<RoomType> roomTypeList = roomTypeService.getAllRoomTypes();
        model.addAttribute("roomTypeList", roomTypeList);


        return "room/allroom";
    }


    @GetMapping("/add")
    public String addRoom(Model model) {
        Room room = new Room();
        model.addAttribute("room", room);

        List<RoomType> roomTypeList = roomTypeService.getAllRoomTypes();
        model.addAttribute("roomTypeList", roomTypeList);

        return "room/addroom";
    }

    @GetMapping("/edit")
    public String editRoom(@RequestParam("id") Long id, Model model) {
        roomService.findOne(id).ifPresent(room -> model.addAttribute("room", room));

        List<RoomType> roomTypeList = roomTypeService.getAllRoomTypes();
        model.addAttribute("roomTypeList", roomTypeList);

        return "room/editroom";
    }

    @GetMapping("/delete")
    public String deleteRoom(@RequestParam("id") Long id, Model model) {
        roomService.findOne(id).ifPresent(room -> model.addAttribute("room", room));
        return "room/deleteroom";
    }

    @PostMapping("/add")
    public String addRoom(@Valid @ModelAttribute("room") Room room, BindingResult result) {
        if (result.hasErrors()) {
            return "room/addroom";
        }
        roomService.save(room);
        return "redirect:/room/all";
    }

    @PostMapping("/edit")
    public String editUser(@Valid @ModelAttribute("room") Room room, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("room", room);
            return "/room/editroom";
        }
        roomService.save(room);
        return "redirect:/room/all";
    }

    @PostMapping("/delete")
    public String deleteUser(@RequestParam("id") long id) {
        roomService.delete(id);
        return "redirect:/room/all";
    }
}
