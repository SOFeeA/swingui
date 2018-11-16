package erwer.swingui;

import junit.framework.TestCase;

public class startviewTest extends TestCase {
	private startview m_cut = new startview();
	protected void setUp() throws Exception {
		super.setUp();
	}
	public void testVar() {
		m_cut.set_var();
		assertTrue( m_cut.m_var );
	}
}
