package com.moaplace.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moaplace.dto.RentalCalendarDTO;
import com.moaplace.dto.RentalListDTO;
import com.moaplace.mapper.RentalMapper;
import com.moaplace.vo.RentalVO;

@Service
public class RentalService {
	@Autowired
	private RentalMapper mapper;
	
	public int insert(RentalVO vo) {
		return mapper.insert(vo);
	}
	
	public int getCount(HashMap<String, Object> map) {
		return mapper.getCount(map);
	}
	
	public List<RentalVO> list (HashMap<String, Object> map){
		return mapper.list(map);
	}
	
	public int updateState (HashMap<String, Object> map) {
		return mapper.updateState(map);
	}
	
	public List<RentalCalendarDTO> getSchedules(HashMap<String, String> map){
		return mapper.getSchedules(map);
	}
}