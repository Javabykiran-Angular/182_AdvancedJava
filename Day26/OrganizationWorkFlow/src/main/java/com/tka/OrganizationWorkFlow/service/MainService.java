package com.tka.OrganizationWorkFlow.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.OrganizationWorkFlow.dao.MainDao;
import com.tka.OrganizationWorkFlow.entity.Country;

@Service
public class MainService {
	@Autowired
	MainDao dao;

	public String addCountry(Country c) {
		
		String msg= dao.addCountry(c);
		if(Objects.isNull(msg)) {
			msg="Country is not be addedd";
		}
		return msg;
	}

	public String updateCountry(Country c, int id) {
		String str= dao.updateCountry(c,id);
		if(Objects.isNull(str)) {
			str="Country is not be Updatated";
		}
		return str;
	}

}
