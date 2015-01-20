/*
 * $Id$
 * See LICENSE.txt for license terms.
 */

package li.cil.repack.com.naef.jnlua;

/**
 * Indicates a Lua syntax error.
 * 
 * <p>
 * This exception is thrown if the syntax of a Lua chunk is incorrect.
 * </p>
 */
public class LuaSyntaxException extends LuaException {
	// -- Static
	private static final long serialVersionUID = 1L;

	// -- Construction
	/**
	 * Creates a new instance.
	 * 
	 * @param msg
	 *            the message
	 */
	public LuaSyntaxException(String msg) {
		super(msg);
	}

	/**
	 * Creates a new instance.
	 * 
	 * @param msg
	 *            the message
	 * @param cause
	 *            the cause of this exception
	 */
	public LuaSyntaxException(String msg, Throwable cause) {
		super(msg, cause);
	}
}