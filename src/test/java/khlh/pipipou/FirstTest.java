package khlh.pipipou;

import org.junit.jupiter.api.Assertions;

public class FirstTest extends FuncTest {

    {{
        describe("A test", () -> {
            Assertions.assertTrue(() -> true);
        });

        describe("Another test", () -> {
            Assertions.assertAll(
                    () -> {},
                    () -> {}
            );
        });
    }}

}
