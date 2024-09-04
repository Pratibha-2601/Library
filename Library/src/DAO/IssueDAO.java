package DAO;

import java.util.List;

import model.Issue;

public interface IssueDAO {
	Issue add(int sid, int bid);
	Issue update(int isid, Issue issue);
	Issue find(int isid);
	boolean remove(int isid);
	List<Issue> findAll();
}
