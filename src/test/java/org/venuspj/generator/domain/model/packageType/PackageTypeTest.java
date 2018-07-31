package org.venuspj.generator.domain.model.packageType;

import org.junit.Test;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class PackageTypeTest {

    @Test
    public void newInstance() {
        PackageType target = PackageType.newInstance();

        System.out.println(toStringHelper(target).defaultConfig().toString());

    }

    @Test
    public void parent() {
        PackageType target = PackageTypeMock.create(PackageTypeMockType.DUMMY);

        PackageType actual = target.getParent();

        System.out.println(toStringHelper(target).defaultConfig().toString());

    }

    public static class PackageTypeMock {
        public static PackageType create(PackageTypeMockType mockType) {
            return mockType.create();
        }
    }

    public enum PackageTypeMockType {
        DUMMY {
            @Override
            public PackageType create() {
                return PackageType.of(PackageName.of("net.jagunma.common"));
            }
        };

        public abstract PackageType create();
    }

}