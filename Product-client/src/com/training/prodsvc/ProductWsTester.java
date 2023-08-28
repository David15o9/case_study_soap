package com.training.prodsvc;

public class ProductWsTester {

	public static void main(String[] args) {
		ProductServiceImplService obj = new ProductServiceImplService();
		ProductServiceImpl prod = obj.getProductServiceImpl();
		Product p1=new Product();
    	p1.setProdId("1010");
    	p1.setProduct("Laptop");
		//System.out.println(prod.getProdInfo());
    	prod.addProduct(p1);
    	
    	Product p2=new Product();
    	p2.setProdId("101");
    	p2.setProduct("iphone 15");
    	prod.updateProduct(p2);
    	
    	prod.deleteProduct(p2);
	}
}
