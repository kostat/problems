import { primeFactors, computeNumOfDivisors } from "../primeFactors";

describe("find prime divisors", () => {
  it("success 1260", () => {
    const result = primeFactors(1260);
    const numDiv = computeNumOfDivisors(result.values());

    expect(result).toEqual(
      new Map([
        [2, 2],
        [3, 2],
        [5, 1],
        [7, 1],
      ])
    ); 
    expect(numDiv).toBe(36);
  });

  it("success 73513440", () => {
    const result = primeFactors(73513440);
    const numDiv = computeNumOfDivisors(result.values());

    expect(result).toEqual(
      new Map([
        [2, 5],
        [3, 3],
        [5, 1],
        [7, 1],
        [11, 1],
        [13, 1],
        [17, 1],
      ])
    );
    expect(numDiv).toBe(768);
  });

  // test success for 100000000
  it("success 100000000", () => {
    const result = primeFactors(100000000);
    const numDiv = computeNumOfDivisors(result.values());

    expect(result).toEqual(
      new Map([
        [2, 8],
        [5, 8],
      ])
    );
    expect(numDiv).toBe(81);
  });

});

