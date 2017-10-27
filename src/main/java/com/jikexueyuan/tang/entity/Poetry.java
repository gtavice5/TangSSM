package com.jikexueyuan.tang.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 诗歌实体类
 * @author allroot123
 *
 */
public class Poetry implements Serializable{
	private int id;
	private Poet poet;
	private String name="";
	private String content;
	private String title;
	private Date created_at;
	private Date updated_at;
	
	public Poetry() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public Poet getPoet() {
		return poet;
	}

	public void setPoet(Poet poet) {
		this.poet = poet;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
