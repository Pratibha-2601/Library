package DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Issue;

public class IssueDAOImpl implements IssueDAO{
	static Map<Integer, Issue> map = new HashMap<>();
	private static int isid = 1;
	
//	static {
//		map.put(isid++, new Issue(1001, 101));
//		map.put(isid++, new Issue(1002, 102));
//		map.put(isid++, new Issue(1003, 103));
//		map.put(isid++, new Issue(1004, 104));
//		map.put(isid++, new Issue(1005, 105));
//	}

	@Override
	public Issue add(int sid, int bid) {
		// TODO Auto-generated method stub
		Issue is = new Issue(sid, bid);
		if(!map.containsKey(isid)) {
			map.put(isid,is);
			isid=isid+1;
		}
		return is;
	}

	@Override
	public Issue update(int isid, Issue issue) {
		// TODO Auto-generated method stub
		if(!map.containsKey(isid)) throw new RuntimeException("Book does not exist");
		map.put(isid, issue);
		return issue;
	}

	@Override
	public Issue find(int isid) {
		// TODO Auto-generated method stub
		return map.get(isid);
	}

	@Override
	public boolean remove(int isid) {
		// TODO Auto-generated method stub
		if(map.containsKey(isid)) {
			map.remove(isid);
			return true;
		}
		return false;
	}

	@Override
	public List<Issue> findAll() {
		// TODO Auto-generated method stub
		Collection<Issue> values = map.values();
		List<Issue> list = new ArrayList<>(values);
		return list;
	}
}
