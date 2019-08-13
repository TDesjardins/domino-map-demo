package com.github.tdesjardins.ol.demo.client.ui.composite;

import com.github.nalukit.nalu.client.component.AbstractCompositeComponent;

import org.dominokit.addons.ol.ui.MapCard;
import org.dominokit.domino.ui.grid.Column;
import org.dominokit.domino.ui.grid.Row;
import org.dominokit.domino.ui.utils.DominoElement;

import elemental2.dom.HTMLElement;

public class MapCompositeComponent extends AbstractCompositeComponent<IMapCompositeComponent.Controller, HTMLElement> implements IMapCompositeComponent {

    public MapCompositeComponent() {
    }

    @Override
    public void render() {

        MapCard mapcard = new MapCard(this.getController().getMapId(), "Map in a composite");

        initElement(DominoElement.div().appendChild(Row.create().
                addColumn(Column.span8().offset2().appendChild(mapcard))).asElement());
    }

}

