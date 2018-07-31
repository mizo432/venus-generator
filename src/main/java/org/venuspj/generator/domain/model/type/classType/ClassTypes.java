package org.venuspj.generator.domain.model.type.classType;

import java.util.Collection;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class ClassTypes {

    private List<ClassType> list = newArrayList();

    public ClassTypes() {

    }

    private ClassTypes(Collection<? extends ClassType> collection) {
        this.list.addAll(collection);

    }

    public static ClassTypes of(Collection<? extends ClassType> collection) {
        return new ClassTypes(collection);
    }

}
