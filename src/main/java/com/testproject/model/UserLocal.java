package com.testproject.model;

import javax.ejb.Local;


@Local
public interface UserLocal {

	public String getInfo();

}
