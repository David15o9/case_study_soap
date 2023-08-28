package com.training.prodsvc;

import java.sql.SQLException;

public interface ProductService {

	public String getProdInfo();
	public void addProduct(Product prod) throws SQLException;
	public void updateProduct(Product prod) throws SQLException;
	public void deleteProduct(Product prod) throws SQLException;
}
