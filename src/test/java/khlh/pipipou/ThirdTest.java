package khlh.pipipou;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.Stream;

import static khlh.pipipou.FuncTester.describe;
import static khlh.pipipou.FuncTester.tests;

public class ThirdTest {
    @TestFactory
    Stream<DynamicTest> myTests() {
        return tests(
                describe("Test 1", () -> {

                }),
                describe("Test 2", () -> {

                })
        );
    }
}
