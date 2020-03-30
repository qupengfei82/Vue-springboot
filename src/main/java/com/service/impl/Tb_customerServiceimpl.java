package com.service.impl;

import java.lang.annotation.Retention;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Tb_customerDao;
import com.domain.Tb_customer;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.Tb_customerService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class Tb_customerServiceimpl implements Tb_customerService {

	@Autowired
	private Tb_customerDao dao;

	@Override
	public PageInfo<Tb_customer> findpageall(Integer page, Integer pageSize, String name) {
		// TODO Auto-generated method stub
		if (page == null) {
			page = 1;
		} else if (page == 0) {
			page = 1;
		} else {
			page = page;
		}
		PageHelper.startPage(page, 2);
		List<Tb_customer> list;
		
			Example example = new Example(Tb_customer.class);
			Criteria criteria = example.createCriteria();
			criteria.andLike("cust_name", "%"+name+"%");
			list = this.dao.selectByExample(example);
		
		PageInfo<Tb_customer> pageinfo = new PageInfo<Tb_customer>(list);
		return pageinfo;
	}

	@Override
	public int saveadd(Tb_customer tb) {
		// TODO Auto-generated method stub
		
		return this.dao.insert(tb);
	}

}
