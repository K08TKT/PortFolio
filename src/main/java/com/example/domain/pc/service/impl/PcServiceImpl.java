package com.example.domain.pc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import com.example.domain.pc.model.Reg;
import com.example.domain.pc.service.PcService;
import com.example.repository.RegMapper;


@Service
public class PcServiceImpl implements PcService{

	@Autowired
	private RegMapper mapper;

	@Override
	public void RegPc(Reg reg) {

		mapper.insertOne(reg);
	}

	@Override
	public List<Reg> getPcs(Reg reg){
		return mapper.findMany(reg);
	}

	@Override
	public Reg getPcOne(String name) {
		return mapper.findOne(name);
	}

	//@Transactional
	@Override
	public void updatePcOne(String name,
			String os,
			String cpu,
			double ghz,
			String gpu,
			int ram,
			int hddCapa,
			String byt,
			int ssdCapa,
			String byt2,
			String eth,
			String strwifi,
			String resolution,
			double lcd,
			String manufacturers,
			Date release_date,
			String description) {
		mapper.updateOne( name,
				os
				, cpu
				, ghz
				,gpu
				, ram
				, hddCapa
				, byt
				, ssdCapa
				, byt2
				, eth
				, strwifi
				, resolution
				, lcd
				, manufacturers
				, release_date
				, description);

	}

	@Override
	public void deletePcOne(String name) {
		int count = mapper.deleteOne(name);
	}


}
