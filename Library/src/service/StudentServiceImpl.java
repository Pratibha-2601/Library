package service;

import java.util.List;

import DAO.StudentDAO;
import DAO.StudentDAOImpl;
import model.Student;

public class StudentServiceImpl implements StudentService{
	
	StudentDAO studentDAO = new StudentDAOImpl(); // StudentService is depended on StudentDAO

	@Override
	public Student add(int roll, String name, String branch, String password) {
		// TODO Auto-generated method stub
		return studentDAO.add(roll, name, branch, password);
	}

	@Override
	public Student update(int roll, Student student) {
		// TODO Auto-generated method stub
		return studentDAO.update(roll, student);
	}

	@Override
	public Student find(int roll, String password) {
		// TODO Auto-generated method stub
		return studentDAO.find(roll, password);
	}

	@Override
	public Student find(int roll) {
		// TODO Auto-generated method stub
		return studentDAO.find(roll);
	}

	@Override
	public boolean remove(int roll) {
		// TODO Auto-generated method stub
		return studentDAO.remove(roll);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentDAO.findAll();
	}

}
