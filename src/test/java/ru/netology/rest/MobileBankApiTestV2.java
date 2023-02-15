package ru.netology.rest;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class MobileBankApiTestV2 {

    @Test
    @@ -21,6 +22,8 @@ void shouldReturnDemoAccounts() {
        // .header("Content-Type", "application/json; charset=UTF-8")
        // специализированные проверки - лучше
          .contentType(ContentType.JSON)
        ;
              .body(matchesJsonSchemaInClasspath("accounts.schema.json"))

        ;
    }
}
