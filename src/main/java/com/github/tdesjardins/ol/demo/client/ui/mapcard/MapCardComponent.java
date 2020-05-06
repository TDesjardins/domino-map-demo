package com.github.tdesjardins.ol.demo.client.ui.mapcard;

import com.github.nalukit.nalu.client.component.AbstractComponent;

import elemental2.dom.HTMLElement;

import org.dominokit.addons.ol.ui.MapCard;
import org.dominokit.domino.ui.grid.Column;
import org.dominokit.domino.ui.grid.Row;
import org.dominokit.domino.ui.utils.DominoElement;

public class MapCardComponent extends AbstractComponent<IMapCardComponent.Controller, HTMLElement> implements IMapCardComponent {

    public MapCardComponent() {
        super();
    }

    @Override
    public void render() {

        MapCard mapCard = new MapCard(this.getController().getMapId(), "Map in a card");

        initElement(DominoElement.div()
                .appendChild(Row.create()
                        .addColumn(Column.span8()
                                .offset2()
                                .appendChild(mapCard)
                        )).element());

    }

}
