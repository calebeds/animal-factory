public interface Animal {
    void walk();
}

class Tiger implements Animal {

    @Override
    public void walk() {
        System.out.println("Walk from Tiger was invoked.");
    }
}

class Duck implements Animal {
    @Override
    public void walk() {
        System.out.println("Walk from Duck was invoked.");
    }
}