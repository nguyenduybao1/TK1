package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Ticket;
import com.example.demo.respository.TicketDao;

@Service
@Transactional
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDao dao;

	@Override
	public List<Ticket> findAll() {
		return dao.findAll();
	}

	@Override
	public Ticket save(Ticket ticket) {
		// TODO Auto-generated method stub
		return dao.save(ticket);
	}

	@Override
	public Ticket findTicketById(int id) {
		// TODO Auto-generated method stub
		return dao.findTicketById(id);
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

}
