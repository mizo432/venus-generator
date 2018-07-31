package org.venuspj.generator.domain.model.packageType;

import org.venuspj.generator.domain.model.definition.methodType.MethodType;

import java.util.Collection;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class PackageTypes {
    private List<MethodType> list = newArrayList();

    public PackageTypes() {

    }

    private PackageTypes(Collection<? extends MethodType> collection) {
        this.list.addAll(collection);

    }

    public static PackageTypes of(Collection<? extends MethodType> collection) {
        return new PackageTypes(collection);
    }

}
