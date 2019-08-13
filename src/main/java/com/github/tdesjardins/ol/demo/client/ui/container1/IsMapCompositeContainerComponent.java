package com.github.tdesjardins.ol.demo.client.ui.container1;

import com.github.nalukit.nalu.client.component.IsComponent;
import com.github.nalukit.nalu.client.component.IsCompositeComponent;

import elemental2.dom.HTMLElement;

public interface IsMapCompositeContainerComponent extends IsCompositeComponent<IsMapCompositeContainerComponent.Controller,HTMLElement> {

    interface Controller extends IsComponent.Controller {}

}
