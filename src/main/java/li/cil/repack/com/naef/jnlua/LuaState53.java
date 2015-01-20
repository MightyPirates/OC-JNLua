package li.cil.repack.com.naef.jnlua;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LuaState53 extends LuaState {
	// -- Native methods
	public static native int lua_registryindex();

	public static native String lua_version();

	protected native void lua_newstate(int apiversion, long luaState);

	protected native void lua_close(boolean ownState);

	protected native int lua_gc(int what, int data);

	protected native void lua_openlib(int lib);

	protected native void lua_load(InputStream inputStream, String chunkname,
			String mode) throws IOException;

	protected native void lua_dump(OutputStream outputStream) throws IOException;

	protected native void lua_pcall(int nargs, int nresults);

	protected native void lua_getglobal(String name);

	protected native void lua_setglobal(String name);

	protected native void lua_pushboolean(int b);

	protected native void lua_pushbytearray(byte[] b);
	
	protected native void lua_pushinteger(int n);

	protected native void lua_pushjavafunction(JavaFunction f);

	protected native void lua_pushjavaobject(Object object);

	protected native void lua_pushnil();

	protected native void lua_pushnumber(double n);

	protected native void lua_pushstring(String s);

	protected native int lua_isboolean(int index);

	protected native int lua_iscfunction(int index);

	protected native int lua_isfunction(int index);

	protected native int lua_isjavafunction(int index);

	protected native int lua_isjavaobject(int index);

	protected native int lua_isnil(int index);

	protected native int lua_isnone(int index);

	protected native int lua_isnoneornil(int index);

	protected native int lua_isnumber(int index);

	protected native int lua_isstring(int index);

	protected native int lua_istable(int index);

	protected native int lua_isthread(int index);

	protected native int lua_compare(int index1, int index2, int operator);

	protected native int lua_rawequal(int index1, int index2);

	protected native int lua_rawlen(int index);

	protected native int lua_toboolean(int index);

	protected native byte[] lua_tobytearray(int index);
	
	protected native int lua_tointeger(int index);

	protected native Integer lua_tointegerx(int index);

	protected native JavaFunction lua_tojavafunction(int index);

	protected native Object lua_tojavaobject(int index);

	protected native double lua_tonumber(int index);

	protected native Double lua_tonumberx(int index);

	protected native long lua_topointer(int index);

	protected native String lua_tostring(int index);

	protected native int lua_type(int index);

	protected native int lua_absindex(int index);

	protected native int lua_arith(int operator);

	protected native void lua_concat(int n);

	protected native int lua_copy(int fromIndex, int toIndex);

	protected native int lua_gettop();

	protected native void lua_len(int index);

	protected native void lua_insert(int index);

	protected native void lua_pop(int n);

	protected native void lua_pushvalue(int index);

	protected native void lua_remove(int index);

	protected native void lua_replace(int index);

	protected native void lua_settop(int index);

	protected native void lua_createtable(int narr, int nrec);

	protected native int lua_getsubtable(int idx, String fname);

	protected native void lua_gettable(int index);

	protected native void lua_getfield(int index, String k);

	protected native void lua_newtable();

	protected native int lua_next(int index);

	protected native void lua_rawget(int index);

	protected native void lua_rawgeti(int index, int n);

	protected native void lua_rawset(int index);

	protected native void lua_rawseti(int index, int n);

	protected native void lua_settable(int index);

	protected native void lua_setfield(int index, String k);

	protected native int lua_getmetatable(int index);

	protected native void lua_setmetatable(int index);

	protected native int lua_getmetafield(int index, String k);

	protected native void lua_newthread();

	protected native int lua_resume(int index, int nargs);

	protected native int lua_status(int index);

	protected native int lua_ref(int index);

	protected native void lua_unref(int index, int ref);

	protected native LuaDebug lua_getstack(int level);

	protected native int lua_getinfo(String what, LuaDebug ar);

	protected native int lua_tablesize(int index);

	protected native void lua_tablemove(int index, int from, int to, int count);

	protected static class LuaDebug extends LuaState.LuaDebug {
		protected LuaDebug(long luaDebug, boolean ownDebug) {
			super(luaDebug, ownDebug);
		}

		// -- Native methods
			protected native void lua_debugfree();

			protected native String lua_debugname();

			protected native String lua_debugnamewhat();
	}
}
