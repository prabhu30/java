package Concepts;

class OuterTwo {

    int HouseColor;

    public void getHouseColor() {
        System.out.println("[Outer Class] Color of House is - Green");
    }

    static class Inner {

        public void getFurnitureColor() {
            System.out.println("[Inner Static Class] Color of Furniture inside House is - Brown");
        }
    }
}

public class InnerStaticClass {

    public static void main(String[] args) {

        OuterTwo outerObj = new OuterTwo();
        outerObj.getHouseColor();

        OuterTwo.Inner innerObj = new OuterTwo.Inner();
        innerObj.getFurnitureColor();
    }
}
