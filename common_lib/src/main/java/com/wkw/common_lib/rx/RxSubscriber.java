package com.wkw.common_lib.rx;

import rx.Subscriber;

/**
 * Created by wukewei on 16/8/17.
 */
public abstract class RxSubscriber<T> extends Subscriber<T> {


    @Override
    public void onCompleted() {

    }

    @Override
    public void onNext(T t) {
        _noNext(t);
    }

    @Override
    public void onError(Throwable e) {
        _onError(ErrorHanding.handleError(e));
    }

    public abstract void _noNext(T t);
    public abstract void _onError(String msg);
}