package org.venuspj.generator.domain.model.type;

import org.venuspj.generator.domain.model.diffination.fieldType.FieldTypes;
import org.venuspj.generator.domain.model.diffination.methodType.MethodTypes;

public interface Type {

    TypeName getTypeName();

    MethodTypes getMethods();

    FieldTypes getFields();

}
