package com.spring.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.dto.CustomVO;

@Repository
public class CustomDAOImpl implements CustomDAO {

	@Inject
	private SqlSession sqlSession;
	private static final String Namespace = "com.example.mapper.customMapper";
	@Override
	public int insertCustom(CustomVO vo) {
		return sqlSession.insert(Namespace+".insertCustom", vo);
	}

}