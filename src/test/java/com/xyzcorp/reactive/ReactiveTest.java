package com.xyzcorp.reactive;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import org.junit.jupiter.api.Test;

public class ReactiveTest {
    @Test
    void testReactiveUsingRXJava() {
        Flowable<Long> longObservable =
            Flowable.create(emitter -> {
                emitter.onNext(100L);
                emitter.onNext(140L);
                emitter.onNext(290L);
                emitter.onNext(10L);
                emitter.onComplete();
            }, BackpressureStrategy.LATEST);

        longObservable
            .map(x -> x * 10)
            .subscribe(System.out::println,
                Throwable::printStackTrace,
                () -> System.out.println("Done"));

        longObservable
            .filter(x -> x < 150)
            .subscribe(System.out::println,
                Throwable::printStackTrace,
                () -> System.out.println("Done"));
    }

    @Test
    void testReactiveWithThreadBoundariesOrBulkheads() {
        Observable.just(1,2,3,4,5)
            .observeOn(Schedulers.computation())
            .subscribeOn(Schedulers.io())
            .map(i -> i * 10)
            .observeOn(Schedulers.io())
            .subscribe(this::updateTheDatabase);
    }

    private void updateTheDatabase(Integer i) {
        //dummy
    }
}
