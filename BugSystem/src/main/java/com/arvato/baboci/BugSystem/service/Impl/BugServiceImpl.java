package com.arvato.baboci.BugSystem.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.arvato.baboci.BugSystem.db.entity.Bug;
import com.arvato.baboci.BugSystem.repository.BugRepository;
import com.arvato.baboci.BugSystem.service.BugService;

@Service("BugService")
public class BugServiceImpl implements BugService{

	
	@Autowired
	private BugRepository bugRepository;

	
	
	@Override
	public Bug findBugByid(Integer id) {
		return bugRepository.findByid(id);
	}

	@Override
	public void saveBug(Bug bug) {
		bugRepository.save(bug);
	}
	
}
