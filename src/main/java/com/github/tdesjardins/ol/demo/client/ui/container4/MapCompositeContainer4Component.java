package com.github.tdesjardins.ol.demo.client.ui.container4;

import com.github.nalukit.nalu.client.component.AbstractComponent;
import com.github.tdesjardins.ol.demo.client.ui.container2.IsMapCompositeContainer2Component;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;
import org.jboss.gwt.elemento.core.Elements;

public class MapCompositeContainer4Component
    extends AbstractComponent<IsMapCompositeContainer4Component.Controller, HTMLElement> implements IsMapCompositeContainer4Component{

    private HTMLDivElement mapContainer;

    public MapCompositeContainer4Component() {
        super();
        this.create();
    }

    public void create() {
        this.mapContainer = Elements.div().id("map-composite-container4").asElement();
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
