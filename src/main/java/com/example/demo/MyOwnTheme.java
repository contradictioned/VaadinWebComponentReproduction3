package com.example.demo;

import com.vaadin.flow.theme.AbstractTheme;

import java.util.List;
import java.util.Map;

public class MyOwnTheme implements AbstractTheme {

    @Override
    public String getBaseUrl() {
        return "src/";
    }

    @Override
    public String getThemeUrl() {
        return "themes/my-own-theme/";
    }

    @Override
    public List<String> getHeaderInlineContents() {
        return AbstractTheme.super.getHeaderInlineContents();
    }

    @Override
    public Map<String, String> getHtmlAttributes(String variant) {
        return AbstractTheme.super.getHtmlAttributes(variant);
    }

    @Override
    public String translateUrl(String url) {
        return AbstractTheme.super.translateUrl(url);
    }
}
