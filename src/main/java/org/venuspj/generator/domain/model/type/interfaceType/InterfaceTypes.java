package org.venuspj.generator.domain.model.type.interfaceType;


import java.util.Collection;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class InterfaceTypes {
    private List<InterfaceType> list = newArrayList();

    public InterfaceTypes() {

    }

    private InterfaceTypes(Collection<? extends InterfaceType> collection) {
        this.list.addAll(collection);

    }

    public static InterfaceTypes of(Collection<? extends InterfaceType> collection) {
        return new InterfaceTypes(collection);
    }

}
