import { primeFactors } from "../primeFactors";

describe("find prime divisors", () => {
  it("success 1260", () => {
    const result = primeFactors(1260);
    //   console.info(`${result}`);
    expect(result).toEqual(
      new Map([
        [2, 2],
        [3, 2],
        [5, 1],
        [7, 1],
      ])
    );
  });
});
