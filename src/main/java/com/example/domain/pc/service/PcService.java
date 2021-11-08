package com.example.domain.pc.service;

import java.util.Date;
import java.util.List;

import com.example.domain.pc.model.Reg;

public interface PcService {
	/**ユーザー登録*/
	public void RegPc(Reg reg);

	/**ユーザー取得(検索) */
	public List<Reg> getPcs(Reg reg);

	/**ユーザー取得(1件)*/
	public Reg getPcOne(String name);


	/**ユーザー更新(1件) */
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
			String description);


	/**ユーザー削除(1件) */
	public void deletePcOne(String name);



}
