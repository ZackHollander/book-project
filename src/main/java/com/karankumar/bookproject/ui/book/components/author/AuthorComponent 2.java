/*
    The book project lets a user keep track of different books they would like to read, are currently
    reading, have read or did not finish.
    Copyright (C) 2020  Karan Kumar

    This program is free software: you can redistribute it and/or modify it under the terms of the
    GNU General Public License as published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful, but WITHOUT ANY
    WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
    PURPOSE.  See the GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along with this program.
    If not, see <https://www.gnu.org/licenses/>.
 */

package com.karankumar.bookproject.ui.book.components.author;

import com.karankumar.bookproject.backend.entity.Book;
import com.karankumar.bookproject.ui.book.components.FormItem;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;

public abstract class AuthorComponent extends FormItem<TextField> {
    private final String placeholder;

    public AuthorComponent(String placeholder, String label) {
        super(new TextField(), label);
        this.placeholder = placeholder;
        configure();
    }

    @Override
    public void configure() {
        TextField field = super.getField();

        field.setPlaceholder(placeholder);
        field.setClearButtonVisible(true);
        field.setRequired(true);
        field.setRequiredIndicatorVisible(true);
    }

    public String getValue() {
        return super.getField().getValue();
    }

    public abstract void bind(Binder<Book> binder);
}
