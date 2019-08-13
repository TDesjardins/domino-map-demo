package com.github.tdesjardins.ol.demo.client.ui.container1;

import com.github.nalukit.nalu.client.component.AbstractComponent;

import org.jboss.gwt.elemento.core.Elements;

import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;

public class MapCompositeContainerComponent extends AbstractComponent<IsMapCompositeContainerComponent.Controller, HTMLElement> implements IsMapCompositeContainerComponent{

    private HTMLDivElement mapContainer;

    public MapCompositeContainerComponent() {
        super();
        this.create();
    }

    public void create() {
        this.mapContainer = Elements.div().id("map-composite-container").asElement();
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
