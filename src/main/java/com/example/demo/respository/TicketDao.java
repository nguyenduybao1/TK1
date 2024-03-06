package com.example.demo.respository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Ticket;

@Repository
public interface TicketDao {
	public List<Ticket> findAll();
	public Ticket save(Ticket ticket);
	public Ticket findTicketById(int id);
	public String delete(int id);
}
