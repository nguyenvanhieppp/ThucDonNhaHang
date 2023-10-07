package viewThucDon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import controller.Listener_chonMon;
import thucDonModel.MonAn;

public class MenuView extends JFrame{
	public MonAn monAn;
	public ButtonGroup group_monChinh;
	public ArrayList<JCheckBox> List_MonPhu;
	public JLabel label_ThanhToan;
	public JCheckBox checkbox10;
	public JCheckBox checkbox9;
	public JCheckBox checkbox8;
	public JCheckBox checkbox7;
	public JCheckBox checkbox6;
	public JCheckBox checkbox5;
	public JCheckBox checkbox4;
	public JCheckBox checkbox3;
	public JCheckBox checkbox2;
	public JCheckBox checkbox1;
	public JRadioButton radio1;
	public JRadioButton radio2;
	public JRadioButton radio3;
	public JRadioButton radio4;

	public MenuView() {
		this.monAn = new MonAn();
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("MENU_MON_AN");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//TÊN NHÀ HÀNG
		JPanel panel_head = new JPanel();
		JLabel head = new JLabel("THỰC ĐƠN NHÀ HÀNG HIỆP MASTER", JLabel.CENTER);
		head.setFont(new Font("Arial", Font.BOLD, 25));
		head.setForeground(Color.GREEN);
		panel_head.add(head);
		
		
		//MÓN CHÍNH
		JPanel panel_monChinh = new JPanel();
		panel_monChinh.setLayout(new GridLayout(2, 4, 0, 0));
		Font f1 = new Font("Times New Roman", Font.ITALIC, 18);
		Font f2 = new Font("Times New Roman", Font.ITALIC, 16);
		radio1 = new JRadioButton("Buffer");radio1.setFont(f1);
		radio1.setForeground(Color.ORANGE);
		radio2 = new JRadioButton("Cơm");radio2.setFont(f1);
		radio2.setForeground(Color.ORANGE);
		radio3 = new JRadioButton("Phở");radio3.setFont(f1);
		radio3.setForeground(Color.ORANGE);
		radio4 = new JRadioButton("Bánh Sô-Cô-La");radio4.setFont(f1);
		radio4.setForeground(Color.ORANGE);
		JLabel l1 = new JLabel("");l1.setFont(f2);
		l1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				MenuView.class.getResource("buffe.png"))));
		JLabel l2 = new JLabel("");l2.setFont(f2);
		l2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				MenuView.class.getResource("Rice_Com.png"))));
		JLabel l3 = new JLabel("");l3.setFont(f2);
		l3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				MenuView.class.getResource("Pho.png"))));
		JLabel l4 = new JLabel("");l4.setFont(f2);
		l4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				MenuView.class.getResource("banhsocola.png"))));
		
		panel_monChinh.add(l1); panel_monChinh.add(l2);
		panel_monChinh.add(l3); panel_monChinh.add(l4);
		panel_monChinh.add(radio1);panel_monChinh.add(radio2);
		panel_monChinh.add(radio3);panel_monChinh.add(radio4);
		
		//Group RadioButton
		group_monChinh = new ButtonGroup();
		group_monChinh.add(radio1); group_monChinh.add(radio2);
		group_monChinh.add(radio3); group_monChinh.add(radio4);
		
		
		//MÓN PHỤ
		JPanel panel_MonPhu = new JPanel();
		panel_MonPhu.setLayout(new GridLayout(4, 5));
		Font f3 = new Font("Arial", Font.ITALIC, 16);
		checkbox1 = new JCheckBox("Rượu Vang");
		checkbox1.setFont(f3);checkbox1.setForeground(Color.PINK);
		checkbox2 = new JCheckBox("Dâu Tây");
		checkbox2.setFont(f3);checkbox2.setForeground(Color.PINK);
		checkbox3 = new JCheckBox("Break");
		checkbox3.setFont(f3);checkbox3.setForeground(Color.PINK);
		checkbox4 = new JCheckBox("Dưa Hấu");checkbox4.setFont(f3);
		checkbox4.setForeground(Color.PINK);
		checkbox5 = new JCheckBox("Trà Tea");checkbox5.setFont(f3);
		checkbox5.setForeground(Color.PINK);
		checkbox6 = new JCheckBox("Coca");checkbox6.setFont(f3);
		checkbox6.setForeground(Color.GRAY);
		checkbox7 = new JCheckBox("Nem Cuộn");checkbox7.setFont(f3);
		checkbox7.setForeground(Color.GRAY);
		checkbox8 = new JCheckBox("Beer");checkbox8.setFont(f3);
		checkbox8.setForeground(Color.GRAY);
		checkbox9 = new JCheckBox("Bông Lan");checkbox9.setFont(f3);
		checkbox9.setForeground(Color.GRAY);
		checkbox10 = new JCheckBox("CaFe");checkbox10.setFont(f3);
		checkbox10.setForeground(Color.GRAY);
		
		//Group món phụ bằng ArrayList
		List_MonPhu = new ArrayList<JCheckBox>();
		List_MonPhu.add(checkbox1);
		List_MonPhu.add(checkbox2);
		List_MonPhu.add(checkbox3);
		List_MonPhu.add(checkbox4);
		List_MonPhu.add(checkbox5);
		List_MonPhu.add(checkbox6);
		List_MonPhu.add(checkbox7);
		List_MonPhu.add(checkbox8);
		List_MonPhu.add(checkbox9);
		List_MonPhu.add(checkbox10);
		
		JLabel lp1 = new JLabel("");lp1.setFont(f2);
		lp1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				MenuView.class.getResource("Ruouvang.png"))));
		JLabel lp2 = new JLabel("");lp2.setFont(f2);
		lp2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				MenuView.class.getResource("quadau.png"))));
		JLabel lp3 = new JLabel("");lp3.setFont(f2);
		lp3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				MenuView.class.getResource("bread_banhmi.png"))));
		JLabel lp4 = new JLabel("");lp4.setFont(f2);
		lp4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				MenuView.class.getResource("duahau.png"))));
		JLabel lp5 = new JLabel("");lp5.setFont(f2);
		lp5.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				MenuView.class.getResource("tea.png"))));
		panel_MonPhu.add(lp1);panel_MonPhu.add(lp2);panel_MonPhu.add(lp3);
		panel_MonPhu.add(lp4);panel_MonPhu.add(lp5);panel_MonPhu.add(checkbox1);
		panel_MonPhu.add(checkbox2);panel_MonPhu.add(checkbox3);
		panel_MonPhu.add(checkbox4);panel_MonPhu.add(checkbox5);
		JLabel lp6 = new JLabel("");lp6.setFont(f2);
		lp6.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				MenuView.class.getResource("Coca.png"))));
		JLabel lp7 = new JLabel("");lp7.setFont(f2);
		lp7.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				MenuView.class.getResource("nem.png"))));
		JLabel lp8 = new JLabel("");lp8.setFont(f2);
		lp8.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				MenuView.class.getResource("beer.png"))));
		JLabel lp9 = new JLabel("");lp9.setFont(f2);
		lp9.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				MenuView.class.getResource("bonglan.png"))));
		JLabel lp10 = new JLabel("");lp10.setFont(f2);
		lp10.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				MenuView.class.getResource("Jframe.png"))));
		panel_MonPhu.add(lp6);panel_MonPhu.add(lp7);panel_MonPhu.add(lp8);
		panel_MonPhu.add(lp9);panel_MonPhu.add(lp10);
		panel_MonPhu.add(checkbox6);panel_MonPhu.add(checkbox7);
		panel_MonPhu.add(checkbox8);panel_MonPhu.add(checkbox9);
		panel_MonPhu.add(checkbox10);
		
		
		//MENU CHÍNH
		JPanel panel_giua = new JPanel();
		panel_giua.setLayout(new GridLayout(2, 1));
		panel_giua.add(panel_monChinh);
		panel_giua.add(panel_MonPhu);
		
		
		//THANH TOÁN
		JPanel panel_ThanhToan = new JPanel();
		panel_ThanhToan.setLayout(new GridLayout(1, 2));
		JButton button_ThanhToan = new JButton("THANH TOÁN");
		//Gọi ActionListener
		ActionListener ac = new Listener_chonMon(this);
		button_ThanhToan.addActionListener(ac);
		
		button_ThanhToan.setFont(new Font("Arial", Font.BOLD, 14));
		button_ThanhToan.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				MenuView.class.getResource("visa.png"))));
		button_ThanhToan.setBackground(Color.BLUE);
		button_ThanhToan.setForeground(Color.CYAN);
		label_ThanhToan = new JLabel("Số tiền bạn cần phải thanh toán",JLabel.CENTER);
		JScrollPane scrollpane = new JScrollPane(label_ThanhToan);
		label_ThanhToan.setFont(new Font("Times New Roman", Font.BOLD|Font.ITALIC
				, 16)); label_ThanhToan.setForeground(Color.green);
		panel_ThanhToan.add(button_ThanhToan);
		panel_ThanhToan.add(scrollpane);
		
		
		
		this.setLayout(new BorderLayout());
		this.add(panel_head, BorderLayout.NORTH);
		this.add(panel_giua, BorderLayout.CENTER);
		this.add(panel_ThanhToan, BorderLayout.SOUTH);
		
		
	}

	public void hienThiKetQua() {
		String hienthi = "Bạn đã chọn món chính là: " +this.monAn.getMonAnChinh() +
				    "  'Các món phụ: " +this.monAn.getMonAnPhu() +
				   " 'Tổng tiền: "+this.monAn.getTinhTien()+ "     "; 
		
		
		this.label_ThanhToan.setText(hienthi);//Gọi hiển thị label
		
	}
}
