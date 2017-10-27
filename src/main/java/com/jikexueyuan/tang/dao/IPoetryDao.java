package com.jikexueyuan.tang.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jikexueyuan.tang.entity.Poetry;

@Repository
public interface IPoetryDao {
	// 根据名字查询所有作品
	@SuppressWarnings("rawtypes")
	public List getAllByName(String name);

	// 根据标题获取整首诗
	public Poetry getByTitle(String title);

	// 根据内容获取诗人名和整首诗
	public Poetry getByContent(String content);

}
