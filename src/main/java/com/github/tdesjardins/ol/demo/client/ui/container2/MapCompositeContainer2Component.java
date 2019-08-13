package com.github.tdesjardins.ol.demo.client.ui.container2;

import com.github.nalukit.nalu.client.component.AbstractComponent;

import org.jboss.gwt.elemento.core.Elements;

import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;

public class MapCompositeContainer2Component extends AbstractComponent<IsMapCompositeContainer2Component.Controller, HTMLElement> implements IsMapCompositeContainer2Component{

    private HTMLDivElement mapContainer;

    public MapCompositeContainer2Component() {
        super();
        this.create();
    }

    public void create() {
        this.mapContainer = Elements.div().id("map-composite-container2").asElement();
    }

    @Override
    public void render() {
        initElement(this.mapContainer);
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub
    }

}
