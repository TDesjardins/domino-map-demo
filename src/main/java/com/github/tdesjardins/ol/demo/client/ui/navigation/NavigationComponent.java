package com.github.tdesjardins.ol.demo.client.ui.navigation;

import com.github.nalukit.nalu.client.component.AbstractComponent;
import elemental2.dom.HTMLElement;
import java.lang.Override;
import org.dominokit.domino.ui.icons.Icons;
import org.dominokit.domino.ui.tree.Tree;
import org.dominokit.domino.ui.tree.TreeItem;

public class NavigationComponent extends AbstractComponent<INavigationComponent.Controller, HTMLElement> implements INavigationComponent {

    private TreeItem mapItem;

    private TreeItem mapCardItem;

    private TreeItem mapCompositeContainer1;

    private TreeItem mapCompositeContainer2;

    public NavigationComponent() {
        super();
    }

    @Override
    public void render() {

        Tree tree = Tree.create("Navigation");
        initElement(tree.asElement());

        this.mapItem = TreeItem.create("OSM Map", Icons.ALL.map())
        .addClickListener(e -> getController().doNavigateTo("map"));

        this.mapCardItem = TreeItem.create("Card with map", Icons.ALL.map())
        .addClickListener(e -> getController().doNavigateTo("mapCard"));

        this.mapCompositeContainer1 = TreeItem.create("Map composite integration", Icons.ALL.map())
        .addClickListener(e -> getController().doNavigateTo("container1"));

        this.mapCompositeContainer2 = TreeItem.create("Map composite integration 2nd", Icons.ALL.map())
        .addClickListener(e -> getController().doNavigateTo("container2"));

        tree.appendChild(this.mapItem);
        tree.appendChild(this.mapCardItem);
        tree.appendChild(this.mapCompositeContainer1);
        tree.appendChild(this.mapCompositeContainer2);

    }

}
