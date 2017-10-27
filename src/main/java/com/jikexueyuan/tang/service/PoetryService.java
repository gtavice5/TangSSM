package com.jikexueyuan.tang.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jikexueyuan.tang.dao.IPoetryDao;
import com.jikexueyuan.tang.entity.Poetry;

@Service("poetryService")
public class PoetryService {

	@Resource
	IPoetryDao dao ;
	
	@SuppressWarnings("rawtypes")
	public List getAllByName(String name) {
		return dao.getAllByName(name);
	}

	public Poetry getByTitle(String title) {
		return dao.getByTitle(title);
	}

	public Poetry getByContent(String content) {
		return dao.getByContent(content);
	}


}

