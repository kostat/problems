export function computeNumOfDivisors(primeStats: IterableIterator<number>) {
  return [...primeStats].reduce((a, b) => a * (b + 1), 1);
}

export function primeFactors(n: number) {
  var result = new Map<number, number>();
  var times = 0;

  for (var i = 2; i <= n; ) {
    if (n % i === 0) {
      n /= i;
      times++;
      continue;
    }

    if (times) {
      //   console.info(`${i}:${times}`);
      result.set(i, times);
      times = 0;
    }

    i++;
  }

  if (times) {
    // console.info(`${i}:${times}`);
    result.set(i, times);
    times = 0;
  }

  return result;
}
