package aydoo.edu.tp.test;

import org.junit.Assert;
import org.junit.Test;

import aydoo.edu.tp.Foo;

public class FooTest {

	@Test
	public void doFooShouldReturnFoo() {
		Foo foo = new Foo();
		String result = foo.doFoo();
		Assert.assertEquals("Foo", result);
	}

}