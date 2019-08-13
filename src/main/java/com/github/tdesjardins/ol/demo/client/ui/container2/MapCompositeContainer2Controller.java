package com.github.tdesjardins.ol.demo.client.ui.container2;

import com.github.nalukit.nalu.client.component.AbstractComponentController;
import com.github.nalukit.nalu.client.component.annotation.Composite;
import com.github.nalukit.nalu.client.component.annotation.Composites;
import com.github.nalukit.nalu.client.component.annotation.Controller;
import com.github.tdesjardins.ol.demo.client.DominoMapDemoContext;
import com.github.tdesjardins.ol.demo.client.event.StatusChangeEvent;
import com.github.tdesjardins.ol.demo.client.ui.composite.MapComposite;

import elemental2.dom.HTMLElement;

@Controller(route = "/application/container2", selector = "content", componentInterface = IsMapCompositeContainer2Component.class,
component = MapCompositeContainer2Component.class)
@Composites({@Composite(name = "mapComposite", compositeController = MapComposite.class , selector = "map-composite-container2")})

public class MapCompositeContainer2Controller  extends AbstractComponentController<DominoMapDemoContext,IsMapCompositeContainer2Component,HTMLElement> implements IsMapCompositeContainer2Component.Controller {

    public MapCompositeContainer2Controller() {

    }

    @Override
    public void start() {
        this.router.storeInCache(this);
    }

    @Override
    public void activate() {
        super.activate();
        this.eventBus.fireEvent(new StatusChangeEvent("CompositeContainer2"));
    }

}
