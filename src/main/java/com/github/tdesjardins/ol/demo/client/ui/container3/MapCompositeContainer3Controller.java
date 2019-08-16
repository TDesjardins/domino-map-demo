package com.github.tdesjardins.ol.demo.client.ui.container3;

import com.github.nalukit.nalu.client.component.AbstractComponentController;
import com.github.nalukit.nalu.client.component.annotation.Composite;
import com.github.nalukit.nalu.client.component.annotation.Composite.Scope;
import com.github.nalukit.nalu.client.component.annotation.Composites;
import com.github.nalukit.nalu.client.component.annotation.Controller;
import com.github.tdesjardins.ol.demo.client.DominoMapDemoContext;
import com.github.tdesjardins.ol.demo.client.event.StatusChangeEvent;
import com.github.tdesjardins.ol.demo.client.ui.composite.MapComposite;
import elemental2.dom.HTMLElement;

@Controller(route = "/application/container3",
            selector = "content",
            componentInterface = IsMapCompositeContainer3Component.class,
            component = MapCompositeContainer3Component.class)
@Composites({ @Composite(name = "mapComposite",
                         compositeController = MapComposite.class,
                         selector = "map-composite-container3",
                         scope = Scope.GLOBAL) })

public class MapCompositeContainer3Controller
    extends AbstractComponentController<DominoMapDemoContext, IsMapCompositeContainer3Component, HTMLElement>
    implements IsMapCompositeContainer3Component.Controller {

  public MapCompositeContainer3Controller() {

  }

  @Override
  public void start() {
  }

  @Override
  public void activate() {
    super.activate();
    this.eventBus.fireEvent(new StatusChangeEvent("CompositeContainer3"));
  }

}
