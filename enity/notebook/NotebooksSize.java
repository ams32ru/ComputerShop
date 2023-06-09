package com.example.computershop.enity.notebook;

/**
 * Возможные размеры для ноутбуков (диагональ)
 */
public enum NotebooksSize {
    THIRTEEN(13),
    FOURTEEN(14),
    FIFTEEN(15),
    SEVENTEEN(17);
    private int value;

    NotebooksSize(int value) {
        this.value = value;
    }
}
