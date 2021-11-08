package com.example.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.pc.model.Reg;
import com.example.domain.pc.service.PcService;
import com.example.form.PcListForm;

import lombok.extern.slf4j.Slf4j;
@Controller
@RequestMapping("/pc")
@Slf4j
public class PcListController {

	@Autowired
	private PcService pcService;

	@Autowired
	private ModelMapper modelMapper;

	@GetMapping("/list")
	public String getPcList(@ModelAttribute PcListForm form, Model model) {
		log.info(pcService.toString());


		Reg reg = modelMapper.map(form,Reg.class);

		List<Reg>pcList = pcService.getPcs(reg);

		model.addAttribute("pcList", pcList);




		return "pc/list";
	}

	@PostMapping("/list")
	public String postPcList(@ModelAttribute PcListForm form,Model model) {


		Reg reg =modelMapper.map(form,Reg.class);


		List<Reg>pcList = pcService.getPcs(reg);

		model.addAttribute("pcList",pcList);


		return "pc/list";
	}

}
