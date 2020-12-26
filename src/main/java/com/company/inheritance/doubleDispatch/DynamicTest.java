package com.company.inheritance.doubleDispatch;


import java.util.Arrays;
import java.util.List;

public class DynamicTest {

    public static void main(String[] args) {
        List<SmartPhone> phones = Arrays.asList(new IPhone(), new Gallaxy());
        Game game = new Game();
        phones.forEach(game::play);
    }
}

class SmartPhone {
    void game(Game game) {

    }
}

class IPhone extends SmartPhone {
    @Override
    public void game(Game game) {
        System.out.println("iphone play [" + this.getClass().getSimpleName() + "]");
    }
}

class Gallaxy extends SmartPhone {
    @Override
    public void game(Game game) {
        System.out.println("gallaxy play [" + this.getClass().getSimpleName() + "]");
    }
}

class Game {
    public void play(SmartPhone phone) {
        phone.game(this);
    }
}
