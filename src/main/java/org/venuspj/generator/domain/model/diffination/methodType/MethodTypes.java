package org.venuspj.generator.domain.model.diffination.methodType;

import java.util.Collection;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class MethodTypes {
    private List<MethodType> list = newArrayList();

    public MethodTypes() {

    }

    private MethodTypes(Collection<? extends MethodType> collection) {
        this.list.addAll(collection);

    }

    public static MethodTypes of(Collection<? extends MethodType> collection) {
        return new MethodTypes(collection);
    }

    public static MethodTypes newInstance() {
        return new MethodTypes();
    }
}
