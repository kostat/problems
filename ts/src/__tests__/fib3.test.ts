import { fib2_gen2, fib3_gen2 } from "../fib3";

describe("fib3", () => {
  it("run 10", () => {
    const fib_it = fib3_gen2();
    const expected = [0, 1, 1, 2, 4, 7, 13, 24, 44, 81];

    for (let i = 0; i < expected.length; i++) {
      expect(fib_it.next().value).toEqual(expected[i]);
    }
  });
});

describe("fib2_gen2", () => {
  it("generates the first 10 Fibonacci numbers", () => {
    const fib_it = fib2_gen2();
    const expected = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55];

    for (let i = 0; i < expected.length; i++) {
      expect(fib_it.next().value).toEqual(expected[i]);
    }
  });
});
