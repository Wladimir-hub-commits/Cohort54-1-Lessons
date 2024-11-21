package hwk_20.Parent;

/**
 * Author Waldemar Ilz
 * {code data} 19.11.2024
 */


class Child2 extends Parent {

    protected String school;

    public Child2(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public String toString() {
        return super.toString() + ", School: " + school;
    }
}
