package dao;

import com.mysql.cj.jdbc.Driver;
import model.Ad;
import model.Ads;
import model.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection con;


    public MySQLAdsDao (Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            this.con = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    @Override
    public List<Ad> all () {
        List<Ad> adsList = new ArrayList<>();
        try {
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM ads";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next())
                adsList.add(
                        new Ad(
                                rs.getLong("id"),
                                rs.getLong("user_id"),
                                rs.getString("title"),
                                rs.getString("description")
                        )
                );
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return adsList;
    }

    @Override
    public Long insert(Ad ad) {
        try {
            Statement stmt = con.createStatement();
            String query = String
                    .format("INSERT INTO ads (user_id, description, title) VALUES ( %d, '%s', '%s')",ad.getUserId(), ad.getDescription(), ad.getTitle());
            stmt.executeUpdate(query, stmt.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException sqle) {
            throw new RuntimeException("error creating add");
        }
    }


}
