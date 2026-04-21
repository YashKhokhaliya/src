package dao;

import java.sql.*;
import model.Report;

public class ReportDAO {

    public static int addReport(Report r) {
        int status = 0;

        try {
            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO reports(user_id,type,location,description,status) VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, r.getUserId());
            ps.setString(2, r.getType());
            ps.setString(3, r.getLocation());
            ps.setString(4, r.getDescription());
            ps.setString(5, "Pending");

            status = ps.executeUpdate();

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}