package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Ticket;

@Service
public interface TicketService {
	public List<Ticket> findAll();
	public Ticket save(Ticket ticket);
	public Ticket findTicketById(int id);
	public String delete(int id);
}
