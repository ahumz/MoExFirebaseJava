package com.android.moex.firebase;

public interface FirebaseObserver<T> {
    void onChanged(T t);
}
