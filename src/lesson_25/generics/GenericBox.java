package lesson_25.generics;

import com.sun.jdi.Value;

// T - type, E - element, K - Key, V - Value
public class GenericBox <T>{
    private T value;

    public   GenericBox(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }
}
