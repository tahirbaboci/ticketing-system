package com.arvato.baboci.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arvato.baboci.db.entity.Bug;

@Repository
public interface BugRepository extends JpaRepository<Bug, Integer> {

	public Bug findAllByBugName(String name);
}
