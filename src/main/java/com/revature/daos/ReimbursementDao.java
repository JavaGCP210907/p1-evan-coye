package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Reimbursement;
import com.revature.utils.ConnectionUtil;

public class ReimbursementDao implements ReimbursementDaoInterface {

	@Override
	public List<Reimbursement> allReimbursements() {
		try(Connection conn = ConnectionUtil.getConnection()){
			
			String sql = "select * from reimbursements";
			
			Statement s = conn.createStatement();
			
			ResultSet rs = s.executeQuery(sql);
			
			List<Reimbursement> reimbList = new ArrayList<>();
			
			while(rs.next()) {
				
				Reimbursement r = new Reimbursement(
						rs.getInt("reimb_id"),
						rs.getString("reimb_description"),
						rs.getDouble("reimb_amount"),
						rs.getString("reimb_author"),
						rs.getString("reimb_type"),
						rs.getString("reimb_status")
						);
				
				reimbList.add(r);
			}
			
			return reimbList;
			
		}catch(SQLException e) {
			System.out.println("All reimbursements failed");
			e.printStackTrace();
		}
		return null;
	}

	public List<Reimbursement> findReimbursementByUsername(String reimb_author) {
		try(Connection conn = ConnectionUtil.getConnection()){
			
			String sql = "select * from reimbursements where reimb_author = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, reimb_author);
			
			ResultSet rs = ps.executeQuery();
			
			List<Reimbursement> reimbList = new ArrayList<>();
			
			while(rs.next()) {
				
				Reimbursement r = new Reimbursement(
						rs.getInt("reimb_id"),
						rs.getString("reimb_description"),
						rs.getDouble("reimb_amount"),
						rs.getString("reimb_author"),
						rs.getString("reimb_type"),
						rs.getString("reimb_status")
						);
				
				reimbList.add(r);
			}
			
			return reimbList;
			
		}catch(SQLException e) {
			System.out.println("find reimbursements failed");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void submitReimbursement(Reimbursement r) {
		try(Connection conn = ConnectionUtil.getConnection()){
			
			String sql = "insert into reimbursements (reimb_description, reimb_amount, reimb_author, reimb_type, reimb_status)" + 
							"values (?, ?, ?, ?, 'Pending')";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, r.getReimb_description());
			ps.setDouble(2, r.getReimb_amount());
			ps.setString(3, r.getReimb_author());
			ps.setString(4, r.getReimb_type());
			
			ps.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("sumbit reimbursement failed");
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateStatus(String reimb_status, int reimb_id) {
		try(Connection conn = ConnectionUtil.getConnection()){
			
			String sql = "update reimbursements set reimb_status = ? where reimb_id = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, reimb_status);
			ps.setInt(2, reimb_id);
			
			ps.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("update status failed");
			e.printStackTrace();
		}
		
	}
	


}
