package com.github.tdesjardins.ol.demo.client;

import com.github.nalukit.nalu.plugin.elemental2.client.NaluPluginElemental2;
import com.google.gwt.core.client.EntryPoint;

public class DominoMapDemo implements EntryPoint {

    public void onModuleLoad() {

        DominoMapDemoApplication application = new DominoMapDemoApplicationImpl();
        application.run(new NaluPluginElemental2());

    }
}
