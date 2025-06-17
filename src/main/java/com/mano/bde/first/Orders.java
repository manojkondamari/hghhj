package com.mano.bde.first;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Orders {
		private String productId;
		private Date date;
		private Customers customer;
		private String productName;
		
		public void setProductId(String productId) {
			this.productId=productId;
		}
		public void setDate(String date) {
			try {
		        this.date = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}
		public void setCustomer(Customers customer) {
			this.customer=customer;
		}
		public void setProductName(String productName) {
			this.productName=productName;
		}
		
		public String getProductId() {
			return productId;
		}
		public Date getDate() {
			return date;
		}
		public Customers getCustomerId() {
			return customer;
		}
		public String getProductName() {
			return productName;
		}
		
		
}
