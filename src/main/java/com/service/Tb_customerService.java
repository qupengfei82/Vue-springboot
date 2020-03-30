package com.service;

import com.domain.Tb_customer;
import com.github.pagehelper.PageInfo;

public interface Tb_customerService {
public PageInfo<Tb_customer> findpageall(Integer page,Integer pageSize,String name);
public int saveadd(Tb_customer tb);
}
