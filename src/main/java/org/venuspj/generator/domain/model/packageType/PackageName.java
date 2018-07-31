package org.venuspj.generator.domain.model.packageType;

import org.venuspj.generator.domain.fundamentals.name.NameValue;

public class PackageName extends NameValue {
    public PackageName(String value) {
        super(value);
    }

    public PackageName() {

    }

    public static PackageName newInstance() {
        return new PackageName();
    }

    public static PackageName of(String value) {
        return new PackageName(value);
    }

    public PackageName getParentPackageName() {

        return null;

    }
}
