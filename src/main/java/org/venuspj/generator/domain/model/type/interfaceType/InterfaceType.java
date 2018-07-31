package org.venuspj.generator.domain.model.type.interfaceType;

import org.venuspj.generator.domain.model.definition.fieldType.FieldTypes;
import org.venuspj.generator.domain.model.definition.methodType.MethodTypes;
import org.venuspj.generator.domain.model.packageType.PackageType;
import org.venuspj.generator.domain.model.type.AbstractType;
import org.venuspj.generator.domain.model.type.TypeName;

import static org.venuspj.util.objects2.Objects2.nonNull;

public class InterfaceType extends AbstractType {

    private PackageType packageType = PackageType.newInstance();

    InterfaceType(PackageType packageType, TypeName typeName, MethodTypes methodTypes, FieldTypes fieldsTypes) {
        super(typeName, methodTypes, fieldsTypes);
        this.packageType = packageType;
    }

    public InterfaceType() {
        super();
    }

    public PackageType getPackage() {
        return packageType;
    }

    public static class InterfaceTypeBuilder extends AbstractTypeBuilder<InterfaceType, InterfaceTypeBuilder> {
        private PackageType packageType = PackageType.newInstance();

        @Override
        protected void apply(InterfaceType vo, InterfaceTypeBuilder builder) {
            super.apply(vo, builder);
            withPackageType(vo.getPackage());
        }

        @Override
        protected InterfaceType createValueObject() {
            return new InterfaceType(packageType, typeName, methods, fields);
        }

        @Override
        protected InterfaceTypeBuilder getThis() {
            return this;
        }

        @Override
        protected InterfaceTypeBuilder newInstance() {
            return new InterfaceTypeBuilder();
        }

        public InterfaceTypeBuilder withPackageType(PackageType packageType) {
            addConfigurator(builder -> {
                if (nonNull(packageType))
                    builder.packageType = packageType;
            });
            return getThis();
        }

    }

}
