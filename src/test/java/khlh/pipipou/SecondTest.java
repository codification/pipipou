package khlh.pipipou;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SecondTest {
    @TestFactory
    Stream<DynamicTest> tests() {
        return Stream.of(
            DynamicTest.dynamicTest("description 1", () -> {
                assertTrue(true);
            })
        );
    }
}
