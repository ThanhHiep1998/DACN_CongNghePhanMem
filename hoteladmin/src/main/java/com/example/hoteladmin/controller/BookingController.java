package com.example.hoteladmin.controller;

import com.example.hoteladmin.model.Booking;
import com.example.hoteladmin.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping("/all")
    public String user(Model model) {
        List<Booking> bookingList = bookingService.getAllBooking();
        model.addAttribute("bookingList", bookingList);
        return "booking/allbooking";
    }


    @GetMapping("/add")
    public String addBooking(Model model) {
        Booking booking = new Booking();
        model.addAttribute("booking", booking);
        return "booking/addbooking";
    }

    @GetMapping("/edit")
    public String editBooking(@RequestParam("id") Long id, Model model) {
        bookingService.findOne(id).ifPresent(booking -> model.addAttribute("booking", booking));
        return "booking/editbooking";
    }

    @GetMapping("/delete")
    public String deleteBooking(@RequestParam("id") Long id, Model model) {
        bookingService.findOne(id).ifPresent(booking -> model.addAttribute("booking", booking));
        return "booking/deletebooking";
    }

    @PostMapping("/add")
    public String addBooking(@Valid @ModelAttribute("booking") Booking booking, BindingResult result) {
        if (result.hasErrors()) {
            return "booking/addbooking";
        }
        bookingService.save(booking);
        return "redirect:/booking/all";
    }

    @PostMapping("/edit")
    public String editBooking(@Valid @ModelAttribute("booking") Booking booking, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("booking", booking);
            return "/booking/editbooking";
        }
        bookingService.save(booking);
        return "redirect:/booking/all";
    }

    @PostMapping("/delete")
    public String deleteUser(@RequestParam("id") long id) {
        bookingService.delete(id);
        return "redirect:/booking/all";
    }
}
