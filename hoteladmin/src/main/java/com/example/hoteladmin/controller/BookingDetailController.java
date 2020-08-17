package com.example.hoteladmin.controller;

import com.example.hoteladmin.model.BookingDetail;
import com.example.hoteladmin.service.BookingDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/bookingDetail")
public class BookingDetailController {
    @Autowired
    private BookingDetailService bookingDetailService;

    @GetMapping("/all")
    public String user(Model model) {
        List<BookingDetail> bookingDetailList = bookingDetailService.getAllBookingDetail();
        model.addAttribute("bookingDetailList", bookingDetailList);
        return "bookingDetail/allbookingDetail";
    }


    @GetMapping("/add")
    public String addBookingDetail(Model model) {
        BookingDetail bookingDetail = new BookingDetail();
        model.addAttribute("ookingDetail", bookingDetail);
        return "bookingDetail/addbookingDetail";
    }

    @GetMapping("/edit")
    public String editBookingDetail(@RequestParam("id") Long id, Model model) {
        bookingDetailService.findOne(id).ifPresent(bookingDetail -> model.addAttribute("bookingDetail", bookingDetail));
        return "bookingDetail/editbookingDetail";
    }

    @GetMapping("/delete")
    public String deleteBookingDetail(@RequestParam("id") Long id, Model model) {
        bookingDetailService.findOne(id).ifPresent(bookingDetail -> model.addAttribute("bookingDetail", bookingDetail));
        return "bookingDetail/deletebookingDetail";
    }

    @PostMapping("/add")
    public String addBookingDetail(@Valid @ModelAttribute("bookingDetail") BookingDetail bookingDetail, BindingResult result) {
        if (result.hasErrors()) {
            return "bookingDetail/addbookingDetail";
        }
        bookingDetailService.save(bookingDetail);
        return "redirect:/bookingDetail/all";
    }

    @PostMapping("/edit")
    public String editBookingDetail(@Valid @ModelAttribute("bookingDetail") BookingDetail bookingDetail, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("bookingDetail", bookingDetail);
            return "/bookingDetail/editbookingDetail";
        }
        bookingDetailService.save(bookingDetail);
        return "redirect:/bookingDetail/all";
    }

    @PostMapping("/delete")
    public String deleteUser(@RequestParam("id") long id) {
        bookingDetailService.delete(id);
        return "redirect:/bookingDetail/all";
    }


}


