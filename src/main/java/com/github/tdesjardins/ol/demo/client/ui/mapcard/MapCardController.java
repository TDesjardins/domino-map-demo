package com.github.tdesjardins.ol.demo.client.ui.mapcard;

import com.github.nalukit.nalu.client.component.AbstractComponentController;
import com.github.nalukit.nalu.client.component.annotation.Controller;
import com.github.tdesjardins.ol.demo.client.DominoMapDemoContext;
import com.github.tdesjardins.ol.demo.client.event.StatusChangeEvent;
import com.github.tdesjardins.ol.demo.client.event.UnFitLayoutEvent;

import elemental2.dom.HTMLElement;
import java.lang.Override;

@Controller(route = "/application/mapCard", selector = "content", componentInterface = IMapCardComponent.class, component = MapCardComponent.class)
public class MapCardController extends AbstractComponentController<DominoMapDemoContext, IMapCardComponent, HTMLElement>
implements IMapCardComponent.Controller {

    public MapCardController() {
    }

    @Override
    public void start() {

        this.eventBus.fireEvent(new UnFitLayoutEvent());
        this.router.storeInCache(this);
        this.component.edit();

    }

    @Override
    public void activate() {
        super.activate();
        this.eventBus.fireEvent(new StatusChangeEvent("Map in a card"));
    }

}
