package com.arvato.baboci.BugSystem.service;

import com.arvato.baboci.BugSystem.db.entity.Bug;

public interface BugService {
	public Bug findBugByid(Integer id);
	public void saveBug(Bug bug);
}
