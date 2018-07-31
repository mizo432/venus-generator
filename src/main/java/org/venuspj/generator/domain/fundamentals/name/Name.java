package org.venuspj.generator.domain.fundamentals.name;

public class Name {

    private String value;

    protected Name(String value) {
        this.value = value;
    }

    public static Name of(String value){
        return new Name(value);
    }
}
