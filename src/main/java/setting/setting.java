package setting;

public class setting {
    private String account = null;
    private String password = null;

    private setting() {
    }

    private static setting instance = null;

    public static setting getSettingInstance() {
        if (instance == null) {
            instance = new setting();
        }
        return instance;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return this.account;
    }

    public String getPassword() {
        return this.password;
    }


}
