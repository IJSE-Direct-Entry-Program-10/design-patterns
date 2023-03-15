package lk.ijse.dep10.dp;

import lk.ijse.dep10.dp.someone.Moon;

public class SingletonDemo2 {

    public static final Moon moon = new Moon();

    public static void main(String[] args) {
        MoonWrapper.getInstance().getMoon();
        MoonWrapper.getInstance().getMoon();
    }
}

class MoonWrapper {
    private static final MoonWrapper instance = new MoonWrapper();
    private final Moon moon = new Moon();

    private MoonWrapper() {
    }

    public static MoonWrapper getInstance() {
        return instance;
    }

    public Moon getMoon(){
        return moon;
    }
}
