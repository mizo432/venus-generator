package org.venuspj.generator.domain.model.packageType;

import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.nonNull;

public class PackageType {
    private PackageName packageName = PackageName.newInstance();

    public PackageType(PackageName packageName) {
        this.packageName = packageName;
    }

    public PackageType() {

    }

    public static PackageType of(PackageName packageName) {
        return new PackageType(packageName);
    }

    public static PackageType newInstance() {
        return new PackageType();
    }

    public PackageName getPackageName() {
        return packageName;
    }

    public PackageType getParent() {
        if (!existsParent())
            throw new ParentNotFoundRuntimeException(packageName);
        return PackageType.of(packageName.getParentPackageName());
    }

    private boolean existsParent() {
        // TODO
        return false;
    }

    public static class PackageTypeBuilder extends ObjectBuilder<PackageType, PackageTypeBuilder> {
        private PackageName packageName = PackageName.newInstance();

        @Override
        protected void apply(PackageType vo, PackageTypeBuilder builder) {
            //
            withPackageName(vo.getPackageName());
        }

        public PackageTypeBuilder withPackageName(PackageName packageName) {
            if (nonNull(packageName))
                addConfigurator(builder -> {
                    builder.packageName = packageName;
                });
            return getThis();
        }

        @Override
        protected PackageType createValueObject() {
            return new PackageType();
        }

        @Override
        protected PackageTypeBuilder getThis() {
            return this;
        }

        @Override
        protected PackageTypeBuilder newInstance() {
            return new PackageTypeBuilder();
        }
    }


}
