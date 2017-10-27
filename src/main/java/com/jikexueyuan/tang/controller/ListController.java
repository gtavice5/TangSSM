package com.jikexueyuan.tang.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jikexueyuan.tang.entity.Poetry;
import com.jikexueyuan.tang.service.PoetryService;

@Controller
public class ListController {

	@Resource
	PoetryService service;
	
	//去首页
	@RequestMapping("index")
	public String index(){
		return "index";
	}
	
	@RequestMapping(value = "list")
	public ModelAndView list(HttpServletRequest request,String action,String content){
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("content",content);
		if(action.equals("getAllByName")){
			@SuppressWarnings("unchecked")
			List<Poetry> pList=service.getAllByName(content);
			mv.addObject("pList", pList);
		}else if(action.equals("getByTitle")){
			Poetry poetry1=service.getByTitle(content);
			mv.addObject("poetry1", poetry1);
		}else if(action.equals("getByContent")){
			Poetry poetry2=service.getByContent(content);
			mv.addObject("poetry2", poetry2);
		}
		return mv;
	}
	
}
