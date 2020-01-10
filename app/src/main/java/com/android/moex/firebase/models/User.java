package com.android.moex.firebase.models;

import com.android.moex.firebase.models.Currency;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

@IgnoreExtraProperties
public class User {
    public Currency currency = new Currency("Rp", true, true);
    public UserSettings userSettings = new UserSettings();
    public Wallet wallet = new Wallet();
    public Map<String, WalletEntryCategory> customCategories = new HashMap<>();

    public User() {

    }
}
