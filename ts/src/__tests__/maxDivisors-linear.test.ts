import { findMaxDivisors } from "../maxDivisors-linear";

describe("find max divisors", () => {
  it("success 1", () => {
    const [result, maxDivisors] = findMaxDivisors(1);
    console.info(`${result}:${maxDivisors}`);
  });

  it("success 1000", () => {
    const [result, maxDivisors] = findMaxDivisors(1000);
    console.info(`${result}:${maxDivisors}`);
  });

  it("success 10000", () => {
    const [result, maxDivisors] = findMaxDivisors(10000);
    console.info(`${result}:${maxDivisors}`);
  });

  it("success 100000", () => {
    const [result, maxDivisors] = findMaxDivisors(100000);
    console.info(`${result}:${maxDivisors}`);
  });

  it("success 1000000", () => {
    const [result, maxDivisors] = findMaxDivisors(1000000);
    console.info(`${result}:${maxDivisors}`);
  });

  it("success 10000000", () => {
    const [result, maxDivisors] = findMaxDivisors(10000000);
    console.info(`${result}:${maxDivisors}`);
  });
});
