package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Tb_customer;
import com.github.pagehelper.PageInfo;
import com.service.Tb_customerService;

@RestController
@CrossOrigin
public class Tb_customerController {

	@Autowired
	private Tb_customerService service;
	
	@RequestMapping("findpageall")
	public PageInfo<Tb_customer> findpageall(Integer page,Integer pageSize,String name){
		return this.service.findpageall(page, 2,name);
	}
	@RequestMapping("saveadd")
	public void saveadd(Tb_customer tb) {
		this.service.saveadd(tb);
	
	}
}
