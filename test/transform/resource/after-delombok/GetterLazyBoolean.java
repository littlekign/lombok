class GetterLazyBoolean {
	private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> booleanValue = new java.util.concurrent.atomic.AtomicReference<java.lang.Object>();
	private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> otherBooleanValue = new java.util.concurrent.atomic.AtomicReference<java.lang.Object>();
	private static boolean calculateBoolean() {
		return true;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof GetterLazyBoolean)) return false;
		final GetterLazyBoolean other = (GetterLazyBoolean) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		if (this.isBooleanValue() != other.isBooleanValue()) return false;
		return true;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof GetterLazyBoolean;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + (this.isBooleanValue() ? 79 : 97);
		return result;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public java.lang.String toString() {
		return "GetterLazyBoolean(booleanValue=" + this.isBooleanValue() + ")";
	}
	@java.lang.SuppressWarnings({"all", "unchecked"})
	@lombok.Generated
	public boolean isBooleanValue() {
		java.lang.Object $value = this.booleanValue.get();
		if ($value == null) {
			synchronized (this.booleanValue) {
				$value = this.booleanValue.get();
				if ($value == null) {
					final boolean actualValue = calculateBoolean();
					$value = actualValue;
					this.booleanValue.set($value);
				}
			}
		}
		return (java.lang.Boolean) $value;
	}
	@java.lang.SuppressWarnings({"all", "unchecked"})
	@lombok.Generated
	public boolean isOtherBooleanValue() {
		java.lang.Object $value = this.otherBooleanValue.get();
		if ($value == null) {
			synchronized (this.otherBooleanValue) {
				$value = this.otherBooleanValue.get();
				if ($value == null) {
					final boolean actualValue = !calculateBoolean();
					$value = actualValue;
					this.otherBooleanValue.set($value);
				}
			}
		}
		return (java.lang.Boolean) $value;
	}
}
