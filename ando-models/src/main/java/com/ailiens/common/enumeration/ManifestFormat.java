package com.ailiens.common.enumeration;

/**
 * The FCTypes enumeration.
 */
public enum ManifestFormat {
    A4("A4"),FORTYCOLUMN("40 Column");
    private String format;
    ManifestFormat(String format){
        this.format = format;
    }
    public String getFormat(){
        return this.format;
    }
}
