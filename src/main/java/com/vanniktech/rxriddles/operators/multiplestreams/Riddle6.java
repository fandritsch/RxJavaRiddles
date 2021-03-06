package com.vanniktech.rxriddles.operators.multiplestreams;

import io.reactivex.rxjava3.core.Single;

import java.util.Map;

class Riddle6 {
	/**
	 * Execute both [first] and [second] Single's in parallel and provide both results as a pair.
	 * Assume both [first] and [second] will execute on a different thread already.
	 * This is a slightly simpler version of [Riddle102], where no schedulers are applied by default.
	 * <p>
	 * Use case: Execute two network requests in parallel and wait for each other and process the combined data.
	 */
	public static Single<Map.Entry<Integer, Integer>> solve(Single<Integer> first, Single<Integer> second) {
		//TODO()
		return null;
	}
}
