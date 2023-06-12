package com.class2;

import com.class2.model.Customer;
import com.class2.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
