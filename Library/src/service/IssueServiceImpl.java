package service;

import java.util.List;

import DAO.IssueDAO;
import DAO.IssueDAOImpl;
import model.Issue;

public class IssueServiceImpl implements IssueService{
	IssueDAO issueDAO = new IssueDAOImpl();

	@Override
	public Issue add(int sid, int bid) {
		// TODO Auto-generated method stub
		return issueDAO.add(sid, bid);
	}

	@Override
	public Issue update(int isid, Issue issue) {
		// TODO Auto-generated method stub
		return issueDAO.update(isid, issue);
	}

	@Override
	public Issue find(int isid) {
		// TODO Auto-generated method stub
		return issueDAO.find(isid);
	}

	@Override
	public boolean remove(int isid) {
		// TODO Auto-generated method stub
		return issueDAO.remove(isid);
	}

	@Override
	public List<Issue> findAll() {
		// TODO Auto-generated method stub
		return issueDAO.findAll();
	}
	
}
