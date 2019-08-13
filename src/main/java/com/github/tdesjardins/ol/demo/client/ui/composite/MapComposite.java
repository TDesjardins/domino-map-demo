package com.github.tdesjardins.ol.demo.client.ui.composite;

import com.github.nalukit.nalu.client.component.AbstractCompositeController;
import com.github.nalukit.nalu.client.component.IsComponentCreator;
import com.github.nalukit.nalu.client.component.annotation.CompositeController;
import com.github.tdesjardins.ol.demo.client.DominoMapDemoContext;
import com.github.tdesjardins.ol.demo.client.event.UnFitLayoutEvent;

import org.dominokit.addons.ol.presets.MapPresets;

import elemental2.dom.DomGlobal;
import elemental2.dom.Event;
import elemental2.dom.HTMLElement;
import ol.Map;

@CompositeController( component = MapCompositeComponent.class, componentInterface = IMapCompositeComponent.class)
public class MapComposite extends AbstractCompositeController<DominoMapDemoContext,IMapCompositeComponent,HTMLElement> implements IMapCompositeComponent.Controller, IsComponentCreator<IMapCompositeComponent> {

    private static final String MAP_ID = "mapcomposite";

    private Map map;

    @Override
    public IMapCompositeComponent createComponent() {
        return new MapCompositeComponent();
    }

    @Override
    public void start() {
        this.eventBus.fireEvent(new UnFitLayoutEvent());
        this.map = MapPresets.getOsmMap(MAP_ID);
        DomGlobal.window.addEventListener("resize", (Event evt) -> this.map.updateSize());

    }

    @Override
    public String getMapId() {
        return MAP_ID;
    }

}
