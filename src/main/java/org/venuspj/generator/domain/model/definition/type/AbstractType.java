package org.venuspj.generator.domain.model.definition.type;

import org.venuspj.generator.domain.model.definition.fieldType.FieldTypes;
import org.venuspj.generator.domain.model.definition.methodType.MethodTypes;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.nonNull;

public abstract class AbstractType implements Type {

    private TypeName typeName = TypeName.newInstance();

    private MethodTypes methodTypes = MethodTypes.newInstance();

    private FieldTypes fieldTypes = FieldTypes.newInstance();

    protected AbstractType(TypeName typeName, MethodTypes methodTypes, FieldTypes fieldTypes) {
        this.typeName = typeName;
        this.methodTypes = methodTypes;
        this.fieldTypes = fieldTypes;

    }

    protected AbstractType() {

    }

    @Override
    public TypeName getTypeName() {
        return typeName;

    }

    public MethodTypes getMethods() {
        return methodTypes;

    }

    @Override
    public FieldTypes getFields() {
        return fieldTypes;

    }

    public static abstract class AbstractTypeBuilder<AT extends AbstractType, B extends AbstractTypeBuilder<AT, B>> extends ObjectBuilder<AT, B> {

        protected TypeName typeName = TypeName.newInstance();

        protected MethodTypes methods = MethodTypes.newInstance();

        protected FieldTypes fields = FieldTypes.newInstance();

        public B withFields(FieldTypes fieldTypes) {
            addConfigurator(builder -> {
                if (nonNull(fieldTypes))
                    builder.fields = fieldTypes;
            });
            return getThis();
        }

        public B withMethods(MethodTypes methodTypes) {
            addConfigurator(builder -> {
                if (nonNull(methodTypes))
                    builder.methods = methodTypes;
            });
            return getThis();
        }

        public B withTypeName(TypeName typeName) {
            addConfigurator(builder -> {
                if (nonNull(typeName))
                    builder.typeName = typeName;
            });
            return getThis();
        }


        @Override
        protected void apply(AT vo, B builder) {
            withTypeName(vo.getTypeName());
            withMethods(vo.getMethods());
            withFields(vo.getFields());
        }
    }


}
