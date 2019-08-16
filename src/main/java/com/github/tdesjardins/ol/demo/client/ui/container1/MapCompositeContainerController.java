package com.github.tdesjardins.ol.demo.client.ui.container1;

import com.github.nalukit.nalu.client.component.AbstractComponentController;
import com.github.nalukit.nalu.client.component.annotation.Composite;
import com.github.nalukit.nalu.client.component.annotation.Composites;
import com.github.nalukit.nalu.client.component.annotation.Controller;
import com.github.tdesjardins.ol.demo.client.DominoMapDemoContext;
import com.github.tdesjardins.ol.demo.client.event.StatusChangeEvent;
import com.github.tdesjardins.ol.demo.client.ui.composite.MapComposite;

import elemental2.dom.HTMLElement;

@Controller(route = "/application/container1", selector = "content", componentInterface = IsMapCompositeContainerComponent.class,
component = MapCompositeContainerComponent.class)
@Composites({@Composite(name = "mapComposite", compositeController = MapComposite.class , selector = "map-composite-container")})

public class MapCompositeContainerController  extends AbstractComponentController<DominoMapDemoContext,IsMapCompositeContainerComponent,HTMLElement> implements IsMapCompositeContainerComponent.Controller {

    public MapCompositeContainerController() {

    }

    @Override
    public void start() {
        this.router.storeInCache(super.getComposites().get("mapComposite"));
    }

    @Override
    public void activate() {
        super.activate();
        this.eventBus.fireEvent(new StatusChangeEvent("CompositeContainer"));
    }

}
