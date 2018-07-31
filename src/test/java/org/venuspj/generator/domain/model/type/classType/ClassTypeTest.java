package org.venuspj.generator.domain.model.type.classType;

import org.junit.Test;
import org.venuspj.generator.domain.model.type.TypeName;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class ClassTypeTest {
    @Test
    public void constructor() {
        ClassType target = new ClassType();
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void mockTest() {
        ClassType target = ClassTypeMock.create(ClassTypeMockType.DEFAULT);
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void builderTest() {
        ClassType target = new ClassType.ClassTypeBuilder()
                .withTypeName(TypeName.of("dummy"))
                .build();
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }

    public static class ClassTypeMock {

        public static ClassType create(ClassTypeMockType mockType) {
            return mockType.create();
        }
    }

    public static enum ClassTypeMockType {
        DEFAULT;

        public ClassType create() {
            return new ClassType();
        }

    }

}