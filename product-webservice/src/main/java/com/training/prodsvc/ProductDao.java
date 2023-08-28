package com.training.prodsvc;

import java.sql.SQLException;

public interface ProductDao {

	public void addProduct(Product prod) throws SQLException;
	public void updateProduct(Product prod)throws SQLException;
	public void deleteProduct(Product prod)throws SQLException;
}
