package com.github.tdesjardins.ol.demo.client.ui.map;

import com.github.nalukit.nalu.client.component.AbstractComponentController;
import com.github.nalukit.nalu.client.component.annotation.Controller;
import com.github.tdesjardins.ol.demo.client.DominoMapDemoContext;
import com.github.tdesjardins.ol.demo.client.event.FitLayoutEvent;
import com.github.tdesjardins.ol.demo.client.event.StatusChangeEvent;
import com.github.tdesjardins.ol.demo.client.event.UnFitLayoutEvent;
import com.github.tdesjardins.ol.demo.client.utils.DemoUtils;

import elemental2.dom.HTMLElement;
import ol.Map;

import java.lang.Override;

@Controller(route = "/application/map", selector = "content", componentInterface = IMapComponent.class, component = MapComponent.class)
public class MapController extends AbstractComponentController<DominoMapDemoContext, IMapComponent, HTMLElement> implements IMapComponent.Controller {

    private static final String MAP_ID = "map";

    private Map map;

    public MapController() {
    }

    @Override
    public void start() {
        this.router.storeInCache(this);
        this.map = DemoUtils.createDefaultMap(MAP_ID);
        
    }

    @Override
    public void activate() {
        this.eventBus.fireEvent(new FitLayoutEvent());
        this.map.updateSize();
        super.activate();
        this.eventBus.fireEvent(new StatusChangeEvent("Map"));
    }

    @Override
    public void deactivate() {
        this.eventBus.fireEvent(new UnFitLayoutEvent());
        super.deactivate();
    }

    @Override
    public String getMapId() {
        return MAP_ID;
    }

}
