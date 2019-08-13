package com.github.tdesjardins.ol.demo.client.ui.composite;

import com.github.nalukit.nalu.client.component.IsComponent;
import com.github.nalukit.nalu.client.component.IsCompositeComponent;

import elemental2.dom.HTMLElement;

public interface IMapCompositeComponent extends  IsCompositeComponent<IMapCompositeComponent.Controller, HTMLElement> {

    interface Controller extends IsComponent.Controller {

        String getMapId();

    }

}
