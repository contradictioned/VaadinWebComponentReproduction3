package com.example.demo;

import com.vaadin.flow.component.WebComponentExporter;
import com.vaadin.flow.component.webcomponent.WebComponent;
import com.vaadin.flow.theme.Theme;

public class MainViewWebComponentExporter extends WebComponentExporter<MainView> {
    public MainViewWebComponentExporter() {
        super("main-view");
    }

    @Override
    protected void configureInstance(WebComponent<MainView> webComponent, MainView mainView) {

    }
}
