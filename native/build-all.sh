#!/bin/bash
if [ -d build-all-tmp ]; then
	rm -r build-all-tmp
fi
if [ -d build-all-out ]; then
	rm -r build-all-out
fi
mkdir build-all-out
export PATH=`pwd`/cross/bin:$PATH
for cross_ini in cross/*.ini; do
	if [[ "$cross_ini" == *"linux-"* ]]; then
		meson setup build-all-tmp --cross-file "$cross_ini" -Dbuildtype=release -Db_lto=true -Duse_local_jni=false
	else
		meson setup build-all-tmp --cross-file "$cross_ini" -Dbuildtype=release -Duse_local_jni=false
	fi
	cd build-all-tmp
	meson compile
	cp *.so *.dylib *.dll ../build-all-out/
	cd ..
	rm -r build-all-tmp
done
