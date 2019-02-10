package com.github.tdesjardins.ol.demo.client.ui.mapcard;

import com.github.nalukit.nalu.client.component.AbstractComponent;
import com.github.tdesjardins.ol.demo.client.utils.DemoUtils;

import elemental2.dom.HTMLElement;

import org.dominokit.addons.ol.ui.MapCard;
import org.dominokit.domino.ui.grid.Column;
import org.dominokit.domino.ui.grid.Row;
import org.dominokit.domino.ui.utils.DominoElement;

public class MapCardComponent extends AbstractComponent<IMapCardComponent.Controller, HTMLElement> implements IMapCardComponent {

    private static final String MAP_ID = "mapCard";

    public MapCardComponent() {
        super();
    }

    @Override
    public void render() {

        MapCard mapCard = new MapCard(MapCardComponent.MAP_ID, "Map in a card");

        initElement(DominoElement.div()
                .appendChild(Row.create()
                        .addColumn(Column.span8()
                                .offset2()
                                .appendChild(mapCard)
                        )).asElement());

    }

    @Override
    public void edit() {
        DemoUtils.createDefaultMap(MapCardComponent.MAP_ID);
    }

}
