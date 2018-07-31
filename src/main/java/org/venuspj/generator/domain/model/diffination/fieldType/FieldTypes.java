package org.venuspj.generator.domain.model.diffination.fieldType;

import java.util.Collection;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class FieldTypes {
    private List<FieldType> list = newArrayList();

    public FieldTypes() {

    }

    private FieldTypes(Collection<? extends FieldType> collection) {
        this.list.addAll(collection);

    }

    public static FieldTypes of(Collection<? extends FieldType> collection) {
        return new FieldTypes(collection);
    }

    public static FieldTypes newInstance() {
        return new FieldTypes();
    }
}
