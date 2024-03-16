package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	@Column
	private String productName;
	@Column
	private double productPrice;
	@Column
	private String productCaategory;
	@Column
	private int productQty;
//	public int getProductId() {
//		return productId;
//	}
//	public void setProductId(int productId) {
//		this.productId = productId;
//	}
//	public String getProductName() {
//		return productName;
//	}
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//	public double getProductPrice() {
//		return productPrice;
//	}
//	public void setProductPrice(double productPrice) {
//		this.productPrice = productPrice;
//	}
//	public String getProductCaategory() {
//		return productCaategory;
//	}
//	public void setProductCaategory(String productCaategory) {
//		this.productCaategory = productCaategory;
//	}
//	public int getProductQty() {
//		return productQty;
//	}
//	public void setProductQty(int productQty) {
//		this.productQty = productQty;
//	}
//	
	
	

}
