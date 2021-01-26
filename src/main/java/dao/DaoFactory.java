package dao;

import model.Ads;
import model.Config;

public class DaoFactory {
    private static Ads adsDao;
    private static final Config config = new Config();
    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
