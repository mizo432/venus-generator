package org.venuspj.generator.domain.model.definition.fieldType;

import org.venuspj.generator.domain.fundamentals.name.NameValue;

public class FieldName extends NameValue {
    public FieldName() {
        super();
    }

    protected FieldName(String value) {
        super(value);

    }

    public static FieldName newInstance() {
        return new FieldName();
    }

    public static FieldName of(String value) {
        return new FieldName(value);
    }
}
