package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Ticket;
import com.example.demo.service.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
    private TicketService dao;

    @PostMapping("/save")
    public Ticket save(@RequestBody Ticket ticket) {
        return dao.save(ticket);
    }

    @GetMapping("/findAll")
    public List<Ticket> getAllTickets() {
        return dao.findAll();
    }

    @GetMapping("findTicketById/{id}")
    public Ticket findTicket(@PathVariable int id) {
        return dao.findTicketById(id);
    }
    @DeleteMapping("delete/{id}")
    public String remove(@PathVariable int id)   {
    	return dao.delete(id);
	}
}
