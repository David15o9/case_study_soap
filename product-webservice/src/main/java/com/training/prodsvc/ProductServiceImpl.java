package com.training.prodsvc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{

	//List<Product> prodList=new ArrayList<>();
	ProductDao dao = new ProductDaoImpl();
	@Override
	public String getProdInfo() {	
		return "Retreving Product Info";
	}

	@Override
	public void addProduct(Product prod) throws SQLException {
		dao.addProduct(prod);
	}

	@Override
	public void updateProduct(Product prod) throws SQLException {
		dao.updateProduct(prod);	
	}

	@Override
	public void deleteProduct(Product prod) throws SQLException {
		dao.deleteProduct(prod);
	}
	
}
