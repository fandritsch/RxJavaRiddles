package com.vanniktech.rxriddles.operators.withscheduler;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

public class RiddleCarousel {
	/**
	 * After each fetchInterval, fetch the current acquirer List.
	 * From the fetched acquirer List, emit the next item after carouselInterval.
	 * Repeat the same acquirer List, until the next time the acquirerList is fetched.
	 * Then use the new acquirer List.
	 * <p>
	 * Use Case: You want to show the available acquirers from an external resource and show each of them for carouselInterval in the UI.
	 */
	public static Observable<String> solve(Callable<List<String>> acquirerCallable, Duration fetchInterval, Duration carouselInterval, Scheduler scheduler) {
		return null;
	}
}
