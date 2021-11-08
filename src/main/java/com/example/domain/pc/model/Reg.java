package com.example.domain.pc.model;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Reg {





	private String name;  //PC名

	private String cpu;  //OS

	private double ghz; //周波数

	private String description; //メモ欄

	private int ram; //メモリ

	private int hddCapa;
	private int ssdCapa;

	private String manufacturers;  //メーカー


	private String strWifi;

	private String os;


	private String byt;  //容量
	public String getByt() {
	return byt;
}
	private String byt2;  //容量
	public String getByt2() {
	return byt2;
	}
	private String gpu; //グラフィック

	private String resolution; //解像度

	private double lcd; //画面サイズ

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date release_date;  //発売日


	//--------------------------
	private String eth;//イーサネット
	public String getEth() {
		return eth;
	}
	private String os_radio;  //OS
	public String getOs_radio() {
		return os_radio;
	}
	private List<String> wifi; //wifi
	public List<String> getWifi(){
		return wifi;

	//----------------------------
	}




	public void setOs_radio(String os_radio) {
		this.os_radio = os_radio;
	}
	public void setEth(String eth) {
	    this.eth = eth;
	}
	public void setWifi(List<String> wifi) {
		this.wifi = wifi;
	}




}
