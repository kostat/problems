import { findMaxDividers } from "../maxDividers-linear";

describe("find max dividers", () => {
  it("success 1", () => {
    const [result, maxDividers] = findMaxDividers(1);
    console.info(`${result}:${maxDividers}`);
  });

  it("success 1000", () => {
    const [result, maxDividers] = findMaxDividers(1000);
    console.info(`${result}:${maxDividers}`);
  });

  it("success 10000", () => {
    const [result, maxDividers] = findMaxDividers(10000);
    console.info(`${result}:${maxDividers}`);
  });

  it("success 100000", () => {
    const [result, maxDividers] = findMaxDividers(100000);
    console.info(`${result}:${maxDividers}`);
  });

  it("success 1000000", () => {
    const [result, maxDividers] = findMaxDividers(1000000);
    console.info(`${result}:${maxDividers}`);
  });

  it("success 10000000", () => {
    const [result, maxDividers] = findMaxDividers(10000000);
    console.info(`${result}:${maxDividers}`);
  });
});
