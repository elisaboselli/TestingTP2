package ejercicio2.cachelist;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.junit.experimental.theories.ParametersSuppliedBy;

@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(NCLLSupplier.class)
public @interface NCLLGenerator {
	int min();
	int max();
}
