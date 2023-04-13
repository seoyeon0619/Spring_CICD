package com.ds.gw.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ds.gw.dto.EmpDto;
import com.ds.gw.repository.EmpDao;

import jakarta.annotation.Resource;

@Service("empService")
public class EmpServiceImpl implements EmpService{
	

	@Resource(name="empDao")
	EmpDao dao;
	
	@Override
	public List<EmpDto> getList(EmpDto dto){
		return dao.getList(dto);
	}
	
	@Override
	public EmpDto getView(EmpDto dto) {
		return dao.getView(dto);
	}

	@Override
	public void insert(EmpDto dto) {
		dao.insert(dto);
	}

	@Override
	public void update(EmpDto dto) {
		dao.update(dto);
	}

	@Override
	public void delete(EmpDto dto) {
		dao.delete(dto);
	}
}
