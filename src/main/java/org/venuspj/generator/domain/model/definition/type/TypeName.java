package org.venuspj.generator.domain.model.definition.type;

import org.venuspj.generator.domain.fundamentals.name.NameValue;

public class TypeName extends NameValue {

    public TypeName() {
        super();
    }

    protected TypeName(String value) {
        super(value);

    }

    public static TypeName newInstance() {
        return new TypeName();
    }

    public static TypeName of(String value) {
        return new TypeName(value);
    }
}
