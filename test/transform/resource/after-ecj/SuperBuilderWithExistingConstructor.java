public @lombok.experimental.SuperBuilder class SuperBuilderWithExistingConstructor {
  public static abstract @java.lang.SuppressWarnings("all") @lombok.Generated class SuperBuilderWithExistingConstructorBuilder<C extends SuperBuilderWithExistingConstructor, B extends SuperBuilderWithExistingConstructor.SuperBuilderWithExistingConstructorBuilder<C, B>> {
    public SuperBuilderWithExistingConstructorBuilder() {
      super();
    }
    protected abstract @java.lang.SuppressWarnings("all") @lombok.Generated B self();
    public abstract @java.lang.SuppressWarnings("all") @lombok.Generated C build();
    public @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated java.lang.String toString() {
      return "SuperBuilderWithExistingConstructor.SuperBuilderWithExistingConstructorBuilder()";
    }
  }
  private static final @java.lang.SuppressWarnings("all") @lombok.Generated class SuperBuilderWithExistingConstructorBuilderImpl extends SuperBuilderWithExistingConstructor.SuperBuilderWithExistingConstructorBuilder<SuperBuilderWithExistingConstructor, SuperBuilderWithExistingConstructor.SuperBuilderWithExistingConstructorBuilderImpl> {
    private SuperBuilderWithExistingConstructorBuilderImpl() {
      super();
    }
    protected @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated SuperBuilderWithExistingConstructor.SuperBuilderWithExistingConstructorBuilderImpl self() {
      return this;
    }
    public @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated SuperBuilderWithExistingConstructor build() {
      return new SuperBuilderWithExistingConstructor(this);
    }
  }
  public SuperBuilderWithExistingConstructor() {
    super();
  }
  protected @java.lang.SuppressWarnings("all") @lombok.Generated SuperBuilderWithExistingConstructor(final SuperBuilderWithExistingConstructor.SuperBuilderWithExistingConstructorBuilder<?, ?> b) {
    super();
  }
  public static @java.lang.SuppressWarnings("all") @lombok.Generated SuperBuilderWithExistingConstructor.SuperBuilderWithExistingConstructorBuilder<?, ?> builder() {
    return new SuperBuilderWithExistingConstructor.SuperBuilderWithExistingConstructorBuilderImpl();
  }
}
