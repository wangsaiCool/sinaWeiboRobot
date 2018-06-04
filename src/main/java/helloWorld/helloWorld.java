package helloWorld;

import setting.setting;

public class helloWorld {
    public static void main(String[] args) {
        System.out.println("hello ,world ");
        setting.getSettingInstance().setAccount("7900");
        System.out.println(setting.getSettingInstance().getAccount());
    }
}
