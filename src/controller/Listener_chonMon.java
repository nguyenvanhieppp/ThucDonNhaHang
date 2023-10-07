package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;

import viewThucDon.MenuView;

public class Listener_chonMon implements ActionListener{
	private MenuView viewthucDon;

	public Listener_chonMon(MenuView viewthucDon) {
		this.viewthucDon = viewthucDon;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Lấy TÊN MÓN CHÍNH
		String monChinh = "";
		
		//Enueration: phép liệt kê
		Enumeration<AbstractButton> button_monChinh = 
		this.viewthucDon.group_monChinh.getElements();//Lấy các phần tử trong group
		
		while(button_monChinh.hasMoreElements()) {
			AbstractButton b = button_monChinh.nextElement();
			if(b.isSelected()) {
				monChinh = b.getText();
			}
		}
		
		//Lấy TÊN MÓN PHỤ
		String monPhu = "";
		for (AbstractButton b1 : viewthucDon.List_MonPhu) {
			if(b1.isSelected()) {
				monPhu += b1.getText()+ ",";
			}
		}
		
		this.viewthucDon.monAn.setMonAnChinh(monChinh);
		this.viewthucDon.monAn.setMonAnPhu(monPhu);
		this.viewthucDon.monAn.tinhTongTien(); //Tính tổng tiền trong model
		this.viewthucDon.hienThiKetQua(); //Hiển thị kết quả
		
	}
}
