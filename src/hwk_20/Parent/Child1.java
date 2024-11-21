package hwk_20.Parent;

/**
 * Author Waldemar Ilz
 * {code data} 19.11.2024
 */

class Child1 extends Parent {

    protected String hobby;

    public Child1(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    public String toString() {
        return super.toString() + ", Hobby: " + hobby;
    }
}
