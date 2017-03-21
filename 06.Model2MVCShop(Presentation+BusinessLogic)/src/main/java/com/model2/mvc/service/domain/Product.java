package com.model2.mvc.service.domain;

import java.sql.Date;


public class Product {
	
	private int prodNo;							//��ǰ��ȣ
	private String prodName;			//��ǰ��
	private String fileName;				//��ǰ�̹����� �����̸�
	private String prodDetail;			//��ǰ��������
	private String manuDate;				//��ǰ ��������
	private int price;								//��ǰ����	
	private Date regDate;						//��ǰ�������
	private String proTranCode;		//���Ż����ڵ�
	private String menu1;
	private String menu2;
	private String menu3;
	
	public Product(){
	}
	
	public String getProTranCode() {
		return proTranCode;
	}
	public void setProTranCode(String proTranCode) {
		this.proTranCode = proTranCode;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getManuDate() {
		return manuDate;
	}
	public void setManuDate(String manuDate) {
//		System.out.println("Product :: manuDate" + manuDate);
		if(manuDate != null && manuDate.length() != 0) {
			String[] parsing= manuDate.split("-");
			manuDate="";
			for(int i=0; i<parsing.length; i++)	{
				manuDate += parsing[i];
//				System.out.println("manuDate :::: " + manuDate);
			}
			this.manuDate = manuDate;
	//		manuDate=menu;
	}
	
	
			
	
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProdDetail() {
		return prodDetail;
	}
	public void setProdDetail(String prodDetail) {
		this.prodDetail = prodDetail;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdNo() {
		return prodNo;
	}
	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getMenu1() {
		return menu1;
	}
	public String getMenu2() {
		return menu2;
	}
	public String getMenu3() {
		return menu3;
	}
	

	// Override
	public String toString() {
		return "ProductVO : [fileName]" + fileName
				+ "[manuDate]" + manuDate+ "[price]" + price + "[prodDetail]" + prodDetail
				+ "[prodName]" + prodName + "[prodNo]" + prodNo + "[proTranCode]" + proTranCode;
	}	
}