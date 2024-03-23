import { fib3_gen2 } from "../fib3";

describe("fib3", () => {
  it("run 15", () => {
    const fib_it = fib3_gen2();

    for (var i = 0; i < 15; i++) {
      console.log(`${i + 1}:${fib_it.next().value}`);
    }
  });
});
