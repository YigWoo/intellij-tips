package com.yigwoo.navigation.klass.related;


@SuppressWarnings("unused")
public class InterfaceUsedHere {

    public static void main(String[] args) {
        AnInterface anInterface = new AnInterfaceImpl();
        anInterface.bar();

        AnotherInterfaceImpl anotherInterface = new AnotherInterfaceImpl();
        anotherInterface.bar();

        InterfaceUsedHere instance = new InterfaceUsedHere();

    }

    public void qux(AnInterface anInterface) {
        anInterface.bar();
    }
}
