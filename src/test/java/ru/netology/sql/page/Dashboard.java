package ru.netology.sql.page;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.visible;

public class Dashboard {
    private SelenideElement heading = $("[data-test-id=dashboard]");

    public Dashboard() {
        heading.shouldBe(visible);
    }
}