package com.xyzcorp.rx;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class RXTest {

    @Test
    void testingAObservable() {
        Observable<Integer> integerObservable =
                Observable.create(observableEmitter -> {
                    observableEmitter.onNext(10);
                    observableEmitter.onNext(20);
                    observableEmitter.onNext(30);
                    observableEmitter.onComplete();
                });

        integerObservable.subscribe(new Observer<Integer>() {
            private Disposable disposable;

            @Override
            public void onSubscribe(Disposable disposable) {
                this.disposable = disposable;
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("S1: " + integer);
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("S1: Done");
            }
        });

        integerObservable.subscribe(
                System.out::println,
                Throwable::printStackTrace,
                () -> System.out.println("Done"));
    }

    public void printCurrentThread(String marker, Object value) {
        System.out.println(marker + ": "  + value + "(" + Thread.currentThread().getName() + ")");

    }
    @Test
    void testingAObservableConcise() {
        Observable<Integer> observable = Observable.range(0, 1000)
                                            .map(x -> x + 3);


        observable
                .doOnNext(x -> printCurrentThread("A1", x))
                .subscribe(
                System.out::println,
                Throwable::printStackTrace,
                () -> System.out.println("Done"));

        observable.doOnNext(x -> printCurrentThread("B1", x))
                  .observeOn(Schedulers.newThread())
                  .filter(x -> x < 50)
                  .doOnNext(x -> printCurrentThread("B2", x))
                  .subscribe(System.out::println);
    }
}
