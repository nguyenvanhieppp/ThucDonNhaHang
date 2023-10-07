package thucDonModel;

import java.util.StringTokenizer;

public class MonAn {
	private String monAnChinh;
	private String monAnPhu;
	private double tinhTien;
	
	public MonAn() {
		this.monAnChinh = "";
		this.monAnPhu = "";
		this.tinhTien = 0;
	}

	public String getMonAnChinh() {
		return monAnChinh;
	}

	public void setMonAnChinh(String monAnChinh) {
		this.monAnChinh = monAnChinh;
	}

	public String getMonAnPhu() {
		return monAnPhu;
	}

	public void setMonAnPhu(String monAnPhu) {
		this.monAnPhu = monAnPhu;
	}

	public double getTinhTien() {
		return tinhTien;
	}

	public void setTinhTien(double tinhTien) {
		this.tinhTien = tinhTien;
	}

	
	
	public void tinhTongTien() {
		//Món chính
		if(this.monAnChinh.equals("Buffer")) {
			this.tinhTien+= 99000;
		}else if(this.monAnChinh.equals("Cơm")) {
			this.tinhTien+= 30000;
		}else if(this.monAnChinh.equals("Phở")) {
			this.tinhTien+= 40000;
		}else if(this.monAnChinh.equals("Bánh Sô-Cô-La")) {
			this.tinhTien+= 60000;
		}
		
		//Món phụ
	StringTokenizer token = new StringTokenizer(this.monAnPhu, ",");//Ngăn cách bằng ","
		while(token.hasMoreElements()) {
			String monPhu = token.nextToken();
			//Lấy ra món phụ trong list
			monPhu = monPhu.trim();
		
			if(monPhu.equals("Rượu Vang")) {
				this.tinhTien+=50000;
			}else if(monPhu.equals("Dâu Tây")) {
				this.tinhTien+=20000;
			}else if(monPhu.equals("Break")) {
				this.tinhTien+=45000;
			}else if(monPhu.equals("Dưa Hấu")) {
				this.tinhTien+=35000;
			}else if(monPhu.equals("Trà Tea")) {
				this.tinhTien+=25000;
			}else if(monPhu.equals("Coca")) {
				this.tinhTien+=10000;
			}else if(monPhu.equals("Nem Cuộn")) {
				this.tinhTien+=30000;
			}else if(monPhu.equals("Beer")) {
				this.tinhTien+=35000;
			}else if(monPhu.equals("Bông Lan")) {
				this.tinhTien+=30000;
			}else if(monPhu.equals("CaFe")) {
				this.tinhTien+=55000;
			}
		}	
	}
}
