package com.company.generics.before;

public class FruitAndBox {
    public static void main(String[] args) {
        AppleBox aBox = new AppleBox(); // 시과 상자 생성
        OrangeBox oBox = new OrangeBox(); // 오렌지 박스 생성

        aBox.setAp(new Apple()); // 사과를 사과 상자에 담는다.
        oBox.setOr(new Orange()); // 오렌지를 오렌지 상자에 담는다.

        Apple ap = aBox.getAp(); // 상자에서 사과를 꺼낸다.
        Orange or = oBox.getOr(); // 상자에서 오렌지를 꺼낸다.

        System.out.println(ap);
        System.out.println(or);
    }
}

class Apple { // 사과를 단순히 표현한 클래스
    @Override
    public String toString() {
        return "I am a apple.";
    }
}


class Orange { // 오렌지를 단순히 표현한 클래스
    @Override
    public String toString() {
        return "I am a orange.";
    }
}

class AppleBox { // 사과 담는 상자를 표현한 클래스
    private Apple ap;

    public Apple getAp() { // 사과를 꺼낸다.
        return ap;
    }

    public void setAp(Apple ap) { // 사과를 담는다.
        this.ap = ap;
    }
}


class OrangeBox { // 오렌지 담는 상자를 표현한 클래스
    private Orange or;

    public Orange getOr() { // 오렌지를 꺼낸다.
        return or;
    }

    public void setOr(Orange or) { // 오렌지를 담는다.
        this.or = or;
    }
}

