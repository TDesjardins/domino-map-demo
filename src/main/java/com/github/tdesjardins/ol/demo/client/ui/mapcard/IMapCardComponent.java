package com.github.tdesjardins.ol.demo.client.ui.mapcard;

import com.github.nalukit.nalu.client.component.IsComponent;
import elemental2.dom.HTMLElement;

public interface IMapCardComponent extends IsComponent<IMapCardComponent.Controller, HTMLElement> {

    interface Controller extends IsComponent.Controller {

        String getMapId();

    }

}
