package org.venuspj.generator.domain.fundamentals.name;

public class NameValue {
    private String value;

    protected NameValue(){

    }
    protected NameValue(String value){
        this.value = value;

    }

    protected Name asName(){
        return Name.of(value);

    }

    public String asText(){
        return value;

    }

}
