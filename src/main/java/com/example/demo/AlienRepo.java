package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface  AlienRepo  extends CrudRepository<Alien,Integer>
{
List<Alien>findByName(String name);
	

}
