package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sidebar extends JPanel{
	public Sidebar() {
		setBackground(new Color(255, 255, 128));
	  setSize(300,644);
	  setLayout(null);
	  
	  JLabel lb_kehang = new JLabel("KỆ HÀNG");
	  lb_kehang.addMouseListener(new MouseAdapter() {
		  	@Override
		  	public void mouseEntered(MouseEvent e) {
		  		lb_kehang.setBackground(new Color(200, 100, 0));
		  	}
		  	@Override
		  	public void mouseExited(MouseEvent e) {
		  		lb_kehang.setBackground(new Color(255, 128, 0));
		  	}
		  });
	  lb_kehang.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/kehang.png")));
	  lb_kehang.setForeground(new Color(255, 255, 255));
	  lb_kehang.setHorizontalAlignment(SwingConstants.CENTER);
	  lb_kehang.setFont(new Font("Tahoma", Font.BOLD, 22));
	  lb_kehang.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
	  lb_kehang.setBackground(new Color(255, 128, 0));
	  lb_kehang.setOpaque(true);
	  lb_kehang.setBounds(0, 159, 300, 55);
	  add(lb_kehang);
	  
	  JLabel lb_nhapsp = new JLabel("NHẬP SẢN PHẨM");
	  lb_nhapsp.addMouseListener(new MouseAdapter() {
		  	@Override
		  	public void mouseEntered(MouseEvent e) {
		  		lb_nhapsp.setBackground(new Color(200, 100, 0));
		  	}
		  	@Override
		  	public void mouseExited(MouseEvent e) {
		  		lb_nhapsp.setBackground(new Color(255, 128, 0));
		  	}
		  });
	  lb_nhapsp.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/nhapsanpham.png")));
	  lb_nhapsp.setOpaque(true);
	  lb_nhapsp.setHorizontalAlignment(SwingConstants.CENTER);
	  lb_nhapsp.setForeground(Color.WHITE);
	  lb_nhapsp.setFont(new Font("Tahoma", Font.BOLD, 22));
	  lb_nhapsp.setBackground(new Color(255, 128, 0));
	  lb_nhapsp.setBounds(0, 213, 300, 55);
	  add(lb_nhapsp);
	  
	  JLabel lb_quanlysp = new JLabel("QUẢN LÝ SẢN PHẨM");
	  lb_quanlysp.addMouseListener(new MouseAdapter() {
		  	@Override
		  	public void mouseEntered(MouseEvent e) {
		  		lb_quanlysp.setBackground(new Color(200, 100, 0));
		  	}
		  	@Override
		  	public void mouseExited(MouseEvent e) {
		  		lb_quanlysp.setBackground(new Color(255, 128, 0));
		  	}
		  });
	  lb_quanlysp.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/quanlysanpham.png")));
	  lb_quanlysp.setOpaque(true);
	  lb_quanlysp.setHorizontalAlignment(SwingConstants.CENTER);
	  lb_quanlysp.setForeground(Color.WHITE);
	  lb_quanlysp.setFont(new Font("Tahoma", Font.BOLD, 22));
	  lb_quanlysp.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
	  lb_quanlysp.setBackground(new Color(255, 128, 0));
	  lb_quanlysp.setBounds(0, 269, 300, 55);
	  add(lb_quanlysp);
	  
	  JLabel lb_quanlykh = new JLabel("QUẢN LÝ KHÁCH HÀNG");
	  lb_quanlykh.addMouseListener(new MouseAdapter() {
		  	@Override
		  	public void mouseEntered(MouseEvent e) {
		  		lb_quanlykh.setBackground(new Color(200, 100, 0));
		  	}
		  	@Override
		  	public void mouseExited(MouseEvent e) {
		  		lb_quanlykh.setBackground(new Color(255, 128, 0));
		  	}
		  });
	  lb_quanlykh.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/quanlykhachhang.png")));
	  lb_quanlykh.setOpaque(true);
	  lb_quanlykh.setHorizontalAlignment(SwingConstants.CENTER);
	  lb_quanlykh.setForeground(Color.WHITE);
	  lb_quanlykh.setFont(new Font("Tahoma", Font.BOLD, 20));
	  lb_quanlykh.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
	  lb_quanlykh.setBackground(new Color(255, 128, 0));
	  lb_quanlykh.setBounds(0, 324, 300, 55);
	  add(lb_quanlykh);
	  
	  JLabel lb_khuyenmai = new JLabel("KHUYẾN MÃI");
	  lb_khuyenmai.addMouseListener(new MouseAdapter() {
		  	@Override
		  	public void mouseEntered(MouseEvent e) {
		  		lb_khuyenmai.setBackground(new Color(200, 100, 0));
		  	}
		  	@Override
		  	public void mouseExited(MouseEvent e) {
		  		lb_khuyenmai.setBackground(new Color(255, 128, 0));
		  	}
		  });
	  lb_khuyenmai.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/khuyenmai.png")));
	  lb_khuyenmai.setOpaque(true);
	  lb_khuyenmai.setHorizontalAlignment(SwingConstants.CENTER);
	  lb_khuyenmai.setForeground(Color.WHITE);
	  lb_khuyenmai.setFont(new Font("Tahoma", Font.BOLD, 22));
	  lb_khuyenmai.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
	  lb_khuyenmai.setBackground(new Color(255, 128, 0));
	  lb_khuyenmai.setBounds(0, 379, 300, 55);
	  add(lb_khuyenmai);
	  
	  JLabel lb_thietlap = new JLabel("THIẾT LẬP");
	  lb_thietlap.addMouseListener(new MouseAdapter() {
		  	@Override
		  	public void mouseEntered(MouseEvent e) {
		  		lb_thietlap.setBackground(new Color(200, 100, 0));
		  	}
		  	@Override
		  	public void mouseExited(MouseEvent e) {
		  		lb_thietlap.setBackground(new Color(255, 128, 0));
		  	}
		  });
	  lb_thietlap.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/thietlap.png")));
	  lb_thietlap.setOpaque(true);
	  lb_thietlap.setHorizontalAlignment(SwingConstants.CENTER);
	  lb_thietlap.setForeground(Color.WHITE);
	  lb_thietlap.setFont(new Font("Tahoma", Font.BOLD, 22));
	  lb_thietlap.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
	  lb_thietlap.setBackground(new Color(255, 128, 0));
	  lb_thietlap.setBounds(0, 435, 300, 55);
	  add(lb_thietlap);
	  
	  JLabel lb_banhang = new JLabel("BÁN HÀNG");
	  lb_banhang.addMouseListener(new MouseAdapter() {
	  	@Override
	  	public void mouseEntered(MouseEvent e) {
	  		lb_banhang.setBackground(new Color(200, 100, 0));
	  	}
	  	@Override
	  	public void mouseExited(MouseEvent e) {
	  		lb_banhang.setBackground(new Color(255, 128, 0));
	  	}
	  });
	  lb_banhang.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/banhang.png")));
	  lb_banhang.setOpaque(true);
	  lb_banhang.setHorizontalAlignment(SwingConstants.CENTER);
	  lb_banhang.setForeground(Color.WHITE);
	  lb_banhang.setFont(new Font("Tahoma", Font.BOLD, 22));
	  lb_banhang.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
	  lb_banhang.setBackground(new Color(255, 128, 0));
	  lb_banhang.setBounds(0, 105, 300, 55);
	  add(lb_banhang);
	  
	  JLabel lb_thongke = new JLabel("THỐNG KÊ");
	  lb_thongke.addMouseListener(new MouseAdapter() {
		  	@Override
		  	public void mouseEntered(MouseEvent e) {
		  		lb_thongke.setBackground(new Color(200, 100, 0));
		  	}
		  	@Override
		  	public void mouseExited(MouseEvent e) {
		  		lb_thongke.setBackground(new Color(255, 128, 0));
		  	}
		  });
	  lb_thongke.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/thongke.png")));
	  lb_thongke.setOpaque(true);
	  lb_thongke.setHorizontalAlignment(SwingConstants.CENTER);
	  lb_thongke.setForeground(Color.WHITE);
	  lb_thongke.setFont(new Font("Tahoma", Font.BOLD, 22));
	  lb_thongke.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
	  lb_thongke.setBackground(new Color(255, 128, 0));
	  lb_thongke.setBounds(0, 490, 300, 55);
	  add(lb_thongke);
	  
	  JLabel lb_daidien = new JLabel("");
	  lb_daidien.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/cuahang.png")));
	  lb_daidien.setHorizontalAlignment(SwingConstants.CENTER);
	  lb_daidien.setBounds(0, 0, 300, 105);
	  add(lb_daidien);
	  
	  JPanel panel = new JPanel();
	  panel.setBackground(new Color(255, 255, 255));
	  panel.setForeground(new Color(0, 0, 0));
	  panel.setBounds(10, 556, 280, 76);
	  add(panel);
	  panel.setLayout(null);
	  
	  JLabel lb_tennhanvien = new JLabel("Nhân viên: ");
	  lb_tennhanvien.setForeground(new Color(255, 128, 0));
	  lb_tennhanvien.setFont(new Font("Tahoma", Font.BOLD, 16));
	  lb_tennhanvien.setBounds(0, 0, 280, 21);
	  panel.add(lb_tennhanvien);
	  
	  JLabel lb_tennhanvien_1 = new JLabel("Chức vụ: ");
	  lb_tennhanvien_1.setForeground(new Color(255, 128, 0));
	  lb_tennhanvien_1.setFont(new Font("Tahoma", Font.BOLD, 16));
	  lb_tennhanvien_1.setBounds(0, 26, 280, 21);
	  panel.add(lb_tennhanvien_1);
	  
	  JLabel lb_nutthoat = new JLabel("LOGOUT");
	  lb_nutthoat.addMouseListener(new MouseAdapter() {
		  	@Override
		  	public void mouseEntered(MouseEvent e) {
		  		lb_nutthoat.setForeground(new Color(0, 0, 255));
		  	}
		  	@Override
		  	public void mouseExited(MouseEvent e) {
		  		lb_nutthoat.setForeground(new Color(0, 128, 255));
		  	}
		  });
	  lb_nutthoat.setForeground(new Color(0, 128, 255));
	  lb_nutthoat.setBackground(new Color(255, 128, 0));
	  lb_nutthoat.setHorizontalAlignment(SwingConstants.CENTER);
	  lb_nutthoat.setFont(new Font("Tahoma", Font.BOLD, 16));
	  lb_nutthoat.setBounds(203, 45, 77, 27);
	  panel.add(lb_nutthoat);
		
	}
}
