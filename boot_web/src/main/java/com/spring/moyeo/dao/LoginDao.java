package com.spring.moyeo.dao;


import org.springframework.data.repository.CrudRepository;

import com.spring.moyeo.vo.MemberEntity;

public interface LoginDao extends CrudRepository<MemberEntity, String>{
	
}