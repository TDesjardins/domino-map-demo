package com.github.tdesjardins.ol.demo.client.ui.mapcard;

import com.github.nalukit.nalu.client.component.AbstractComponentController;
import com.github.nalukit.nalu.client.component.annotation.Controller;
import com.github.tdesjardins.ol.demo.client.DominoMapDemoContext;
import com.github.tdesjardins.ol.demo.client.event.StatusChangeEvent;
import com.github.tdesjardins.ol.demo.client.event.UnFitLayoutEvent;

import elemental2.dom.DomGlobal;
import elemental2.dom.Event;
import elemental2.dom.HTMLElement;
import ol.Map;

import java.lang.Override;

import org.dominokit.addons.ol.presets.MapPresets;

@Controller(route = "/application/mapCard", selector = "content", componentInterface = IMapCardComponent.class, component = MapCardComponent.class)
public class MapCardController extends AbstractComponentController<DominoMapDemoContext, IMapCardComponent, HTMLElement>
implements IMapCardComponent.Controller {

    private static final String MAP_ID = "mapcard";

    private Map map;

    public MapCardController() {
    }

    @Override
    public void start() {

        this.eventBus.fireEvent(new UnFitLayoutEvent());
        this.router.storeInCache(this);
        this.map = MapPresets.getOsmMap(MAP_ID);
        DomGlobal.window.addEventListener("resize", (Event evt) -> this.map.updateSize());

    }

    @Override
    public void activate() {
        super.activate();
        this.eventBus.fireEvent(new StatusChangeEvent("Map in a card"));
    }

    @Override
    public String getMapId() {
        return MAP_ID;
    }

}
