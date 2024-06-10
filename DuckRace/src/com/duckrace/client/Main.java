package com.duckrace.client;

import com.duckrace.app.DuckRaceApp;

class Main {
    public static void main(String[] args) {
        // instantiate controller & say "go" - new duck race app and then call go on it
        DuckRaceApp app = new DuckRaceApp();
        app.execute();
    }
}
