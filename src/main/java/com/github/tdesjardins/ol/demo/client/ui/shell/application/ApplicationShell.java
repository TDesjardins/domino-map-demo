package com.github.tdesjardins.ol.demo.client.ui.shell.application;

import com.github.nalukit.nalu.client.component.AbstractShell;
import com.github.nalukit.nalu.client.component.annotation.Shell;
import com.github.nalukit.nalu.client.exception.RoutingInterceptionException;
import com.github.tdesjardins.ol.demo.client.DominoMapDemoContext;
import com.github.tdesjardins.ol.demo.client.event.FitLayoutEvent;
import com.github.tdesjardins.ol.demo.client.event.UnFitLayoutEvent;
import org.dominokit.domino.ui.layout.Layout;
import org.dominokit.domino.ui.style.ColorScheme;

import static org.dominokit.domino.ui.style.Unit.px;

@Shell("application")
public class ApplicationShell
        extends AbstractShell<DominoMapDemoContext> {

    private Layout layout;

    public ApplicationShell() {
        super();
    }

    @Override
    public void attachShell() {

        layout = Layout.create("Simple Map Application build with Domino-UI, Nalu and GWT-OL")
                .show(ColorScheme.INDIGO)
                .fitWidth()
                .fitHeight();

        layout.showFooter()
                .apply(layout -> layout.getFooter().style().setMinHeight(px.of(0)))
                .fixFooter();

        layout.getFooter().setId("footer");
        layout.getLeftPanel().setId("navigation");
        layout.getContentPanel().setId("content");
    }

    @Override
    public void detachShell() {
        this.layout.remove();
    }

    @Override
    public void bind(ShellLoader shellLoader) throws RoutingInterceptionException {

        this.eventBus.addHandler(FitLayoutEvent.TYPE,
                event -> {
                    layout.fitWidth();
                    layout.fitHeight();
                });

        this.eventBus.addHandler(UnFitLayoutEvent.TYPE,
                event -> {
                    layout.unfitWidth();
                    layout.unfitHeight();
                });

        super.bind(shellLoader);

    }

}
