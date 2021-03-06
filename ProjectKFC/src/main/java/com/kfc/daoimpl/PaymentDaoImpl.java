package com.kfc.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kfc.model.Payment;
import com.kfc.util.ConnectionUtil;

public class PaymentDaoImpl {

	public boolean card(Payment payment) {
		PreparedStatement pstmt = null;
		String query = "insert into payments_kfc (user_id,card_number,card_type) values (?,?,?)";
		Connection con = ConnectionUtil.getDBConnection();
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, payment.getUser_id());
			pstmt.setLong(2, payment.getCardNumber());
			pstmt.setString(3, payment.getCardType());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(pstmt, con);
		}

		return false;
	}

}
