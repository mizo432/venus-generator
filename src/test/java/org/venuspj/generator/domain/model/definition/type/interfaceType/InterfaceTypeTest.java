package org.venuspj.generator.domain.model.definition.type.interfaceType;

import org.junit.Test;
import org.venuspj.generator.domain.model.definition.type.TypeName;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class InterfaceTypeTest {
    @Test
    public void constructor() {
        InterfaceType target = new InterfaceType();
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void mockTest() {
        InterfaceType target = InterfaceTypeMock.create(InterfaceTypeMockType.DEFAULT);
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void builderTest() {
        InterfaceType target = new InterfaceType.InterfaceTypeBuilder()
                .withTypeName(TypeName.of("dummy"))
                .build();
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }

    public static class InterfaceTypeMock {

        public static InterfaceType create(InterfaceTypeMockType mockType) {
            return mockType.create();
        }
    }

    public static enum InterfaceTypeMockType {
        DEFAULT;

        public InterfaceType create() {
            return new InterfaceType();
        }

    }


}