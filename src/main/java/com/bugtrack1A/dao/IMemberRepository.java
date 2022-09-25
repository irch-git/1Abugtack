package com.bugtrack1A.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bugtrack1A.entities.MemberEntities;

public interface IMemberRepository extends CrudRepository<MemberEntities, Long> {
	
	@Override
	public List<MemberEntities> findAll();
}
