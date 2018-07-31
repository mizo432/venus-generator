package org.venuspj.generator.domain.model.definition.type.classType;

import org.junit.Test;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class ClassTypesTest {

    @Test
    public void constructor() {
        ClassTypes target = new ClassTypes();
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }

}