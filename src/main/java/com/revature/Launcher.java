package com.revature;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.revature.daos.EmployeeDao;
import com.revature.models.Employee;
import com.revature.models.Role;
import com.revature.utils.HibernateUtil;

public class Launcher {

	public static void main(String[] args) {
		
		EmployeeDao eDao = new EmployeeDao();
		
		try(Session ses = HibernateUtil.getSession()){
			System.out.println("Hello you have a Connection to your DB with Hibernate!");
			HibernateUtil.closeSession(); 
		} catch (HibernateException e) {
			System.out.println("DB connection failed!!");
		}
		
		Role r1 = new Role("Manager");
		Role r2 = new Role("Associate");
		
		Employee e1 = new Employee("bill-smith", "password1", "Bill", "Smith", "bsmith@email.com", r2);
		Employee e2 = new Employee("john-johnson", "password2", "John", "Johnson", "jjohnson@email.com", r2);
		Employee e3 = new Employee("brenda-williams", "password3", "Brenda", "Williams", "bwilliams@email.com", r2);
		Employee e4 = new Employee("karen-stevens", "password4", "Karen", "Stevens", "kstevens@email.com", r1);
		
		eDao.insertEmployee(e1);
		eDao.insertEmployee(e2);
		eDao.insertEmployee(e3);
		eDao.insertEmployee(e4);
		
	}

}
