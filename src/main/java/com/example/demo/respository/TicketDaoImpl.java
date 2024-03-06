package com.example.demo.respository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Ticket;

@Repository
@Transactional
public class TicketDaoImpl implements TicketDao {

	public static final String HASH_KEY = "Ticket";
	
	private final RedisTemplate template;

    TicketDaoImpl(RedisTemplate template) {
        this.template = template;
    }

	@Override
	public List<Ticket> findAll() {

		return template.opsForHash().values(HASH_KEY);
	}

	@Override
	public Ticket save(Ticket ticket) {
		template.opsForHash().put(HASH_KEY, ticket.getId(), ticket);
		return ticket;
	}

	@Override
	public Ticket findTicketById(int id) {
		return (Ticket) template.opsForHash().get(HASH_KEY, id);
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		template.opsForHash().delete(HASH_KEY, id);
		return "ticket removed !!";
	}

}
