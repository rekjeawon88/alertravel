package org.dawin.mapper;

import java.util.List;

import org.dawin.domain.DonateVO;

public interface DonateMapper {
	
	public DonateVO read(String donateName);
	
	public List<DonateVO> getDonateAmountList();
	
	public List<DonateVO> getDonateSelectList();
	
	public void insert(DonateVO donate);
	
}