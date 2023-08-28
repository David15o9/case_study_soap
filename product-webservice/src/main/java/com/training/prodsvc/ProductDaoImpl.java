package com.training.prodsvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDaoImpl implements ProductDao{

	
	@Override
	public void addProduct(Product prod) throws SQLException {
		System.out.println("Inside Add pRODUCT:::");
		
		Connection con = null;
//		try {
//			con = DbConnection.getConnectiondb();
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery("select * from Product");
//			while(rs.next()) {
//				System.out.println("ProdID: "+rs.getString(1)+ " ProdName: "+rs.getString(2));
//			}
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		try {
			con = DbConnection.getConnectiondb();
			String Query= "insert into Product values (?,?)";
			PreparedStatement ps = con.prepareStatement(Query);
			ps.setString(1,prod.getProdId());
			ps.setString(2,prod.getProduct());
			ps.executeUpdate();
			System.out.println("worked");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateProduct(Product prod) throws SQLException {
		System.out.println("inside update class");
		try {
			Connection con=DbConnection.getConnectiondb();
			PreparedStatement stmt=con.prepareStatement("select * from Product where ProdId=?");
			stmt.setString(1,prod.getProdId());
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				PreparedStatement updtst = con.prepareStatement("update Product set product=? where ProdId=?");
				updtst.setString(1,prod.getProduct());
				updtst.setString(2,prod.getProdId());
				updtst.executeUpdate();
				System.out.println("Updated...");
			}
			else {
				System.out.println("Product does not exist");
			}
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void deleteProduct(Product prod) throws SQLException {
		System.out.println("inside delete class");
		try {
			Connection con=DbConnection.getConnectiondb();
			PreparedStatement stmt=con.prepareStatement("delete from Product where ProdId=?");
			stmt.setString(1,prod.getProdId());
			stmt.executeUpdate();
			System.out.println("Product Deleted...");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}