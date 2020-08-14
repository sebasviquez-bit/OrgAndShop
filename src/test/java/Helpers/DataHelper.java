package Helpers;

import org.testng.annotations.DataProvider;

public class DataHelper {

    public DataHelper(){
    }

    @DataProvider(name="ExistingUsers")
    public static Object[][] credentialsExisting() throws Exception {

       return ExcelHelper.getTableArray("AKCUsers.xlsx","Sheet1", 2);
    }

    //@DataProvider(name="ContactShipping") This is for SHOP - Pending to be set for PurchaseOrders*
    public static Object[][] ContactShipping() throws Exception {

        return CsvHelper.getCSVArray("ContactShipping.csv");

        //return ExcelHelper.getTableArray("ContactShipping.csv","Sheet1", 2);
    }

    @DataProvider(name="RegisterUsers")
    public static Object[][] credentialsRegister() throws Exception {

        return CsvHelper.getCSVArray("NewUsersSignUp.csv");

    }

    @DataProvider(name="WordSearch")
    public static Object[][] searchCriteria() throws Exception {

        return ExcelHelper.getTableArray("Words.xlsx", "Sheet1", 1);
    }


}
