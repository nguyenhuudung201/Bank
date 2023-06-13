package com.class2;

import com.class2.model.Customer;
import com.class2.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerController {
    public void addNewCustomer(Customer customer) throws Exception {
        try {
            Connection conn =  DBUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(
                    "INSERT INTO khachhang(makh, tenkh, cmt,sodt,email,ngaysinh,gioitinh,address,loaikh)" +
                            " VALUES (?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1, customer.getMaKh());
            pstmt.setString(2, customer.getTenKh());
            pstmt.setString(3, customer.getCmt());
            pstmt.setString(4, customer.getSoDt());
            pstmt.setString(5, customer.getEmail());
            pstmt.setString(6, customer.getNgaySinh());
            pstmt.setInt(7, customer.getGioiTinh());
            pstmt.setString(8, customer.getAddress());
            pstmt.setInt(9, customer.getLoaiKh());

            int updated = pstmt.executeUpdate();
            if(updated > 0) {
                System.out.println("Insert Customer success!!!");
            }

            pstmt.close();
            conn.close();

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    public void getAll() throws Exception {
        try {
            Connection connection = DBUtil.getConnection();
            Statement stmt= connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * From khachhang");
            while (rs.next()){
                System.out.println("=====khachhang======");
                int id = rs.getInt("id");
                System.out.println(id);
                String makh = rs.getString("makh");
                System.out.println(makh);
                String tenkh= rs.getString("tenkh");
                System.out.println(tenkh);
                String cmt= rs.getString("cmt");
                System.out.println(cmt);
                String sodt = rs.getString("sodt");
                System.out.println(sodt);
                String email= rs.getString("email");
                System.out.println(email);
                String ngaysinh= rs.getString("ngaysinh");
                System.out.println(ngaysinh);
                int gioitinh = rs.getInt("gioitinh");
                System.out.println(gioitinh);
                String address= rs.getString("address");
                System.out.println(address);
                int loaikh = rs.getInt("loaikh");
                System.out.println(loaikh);
            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
