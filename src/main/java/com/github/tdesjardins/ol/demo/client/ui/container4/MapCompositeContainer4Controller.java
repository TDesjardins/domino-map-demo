package com.github.tdesjardins.ol.demo.client.ui.container4;

import com.github.nalukit.nalu.client.component.AbstractComponentController;
import com.github.nalukit.nalu.client.component.annotation.Composite;
import com.github.nalukit.nalu.client.component.annotation.Composite.Scope;
import com.github.nalukit.nalu.client.component.annotation.Composites;
import com.github.nalukit.nalu.client.component.annotation.Controller;
import com.github.tdesjardins.ol.demo.client.DominoMapDemoContext;
import com.github.tdesjardins.ol.demo.client.event.StatusChangeEvent;
import com.github.tdesjardins.ol.demo.client.ui.composite.MapComposite;
import com.github.tdesjardins.ol.demo.client.ui.container4.IsMapCompositeContainer4Component;
import com.github.tdesjardins.ol.demo.client.ui.container4.MapCompositeContainer4Component;
import elemental2.dom.HTMLElement;

@Controller(route = "/application/container4",
            selector = "content",
            componentInterface = IsMapCompositeContainer4Component.class,
            component = MapCompositeContainer4Component.class)
@Composites({ @Composite(name = "mapComposite",
                         compositeController = MapComposite.class,
                         selector = "map-composite-container4",
                         scope = Scope.GLOBAL) })

public class MapCompositeContainer4Controller
    extends AbstractComponentController<DominoMapDemoContext, IsMapCompositeContainer4Component, HTMLElement>
    implements IsMapCompositeContainer4Component.Controller {

  public MapCompositeContainer4Controller() {

  }

  @Override
  public void start() {
  }

  @Override
  public void activate() {
    super.activate();
    this.eventBus.fireEvent(new StatusChangeEvent("CompositeContainer4"));
  }

}
