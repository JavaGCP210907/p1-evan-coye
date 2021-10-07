package com.revature;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.revature.daos.EmployeeDao;
import com.revature.daos.ReimbursementDao;
import com.revature.models.Employee;
import com.revature.models.ReimbStatus;
import com.revature.models.ReimbType;
import com.revature.models.Reimbursement;
import com.revature.models.Role;
import com.revature.utils.HibernateUtil;

public class Launcher {

	public static void main(String[] args) {
		
		EmployeeDao eDao = new EmployeeDao();
		ReimbursementDao rDao = new ReimbursementDao();
		
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
		
		ReimbType rt1 = new ReimbType("Lodging");
		ReimbType rt2 = new ReimbType("Travel");
		ReimbType rt3 = new ReimbType("Food");
		ReimbType rt4 = new ReimbType("Other");
		
		ReimbStatus rs1 = new ReimbStatus("Pending");
		ReimbStatus rs2 = new ReimbStatus("Approved");
		ReimbStatus rs3 = new ReimbStatus("Denied");
		
		Reimbursement rb1 = new Reimbursement("Two nights in a hotel", 235.45, e1, rt1, rs1);
		Reimbursement rb2 = new Reimbursement("Food for the weekend", 55.67, e1, rt3, rs1);
		Reimbursement rb3 = new Reimbursement("Gas for the weekend", 75.45, e1, rt2, rs1);
		Reimbursement rb4 = new Reimbursement("New pants for meeting", 45.99, e1, rt4, rs1);
		
		rDao.createReimbursement(rb1);
		rDao.createReimbursement(rb2);
		rDao.createReimbursement(rb3);
		rDao.createReimbursement(rb4);
	}

}
