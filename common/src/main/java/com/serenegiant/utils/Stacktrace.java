package com.serenegiant.utils;
/*
 * libcommon
 * utility/helper classes for myself
 *
 * Copyright (c) 2014-2016 saki t_saki@serenegiant.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
*/

import android.util.Log;

public class Stacktrace {
	private static final String TAG = "Stacktrace";
	public static void print() {
		final Throwable t = new Throwable();
		final StringBuilder sb = new StringBuilder();
		final StackTraceElement[] elms = t.getStackTrace();
		boolean top = true;
		if (elms != null) {
			for (final StackTraceElement elm: elms) {
				if (!top && (elm != null)) {
					sb.append(elm.toString()).append("\n");
				} else {
					top = false;
				}
			}
		}
		Log.i(TAG, sb.toString());
	}

	public static String asString() {
		final Throwable t = new Throwable();
		final StringBuilder sb = new StringBuilder();
		final StackTraceElement[] elms = t.getStackTrace();
		boolean top = true;
		if (elms != null) {
			for (final StackTraceElement elm: elms) {
				if (!top && (elm != null)) {
					sb.append(elm.toString()).append("\n");
				} else {
					top = false;
				}
			}
		}
		return sb.toString();
	}

	public static String asString(final Throwable t) {
		final StringBuilder sb = new StringBuilder();
		final StackTraceElement[] elms = t.getStackTrace();
		boolean top = true;
		if (elms != null) {
			for (final StackTraceElement elm: elms) {
				if (!top && (elm != null)) {
					sb.append(elm.toString()).append("\n");
				} else {
					top = false;
				}
			}
		}
		return sb.toString();
	}
}
