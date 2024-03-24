type Data = number[];

function fillPrimeStats(prime: number, data: Data) {
  const cache: number[] = [];
  for (var i = 1; ; i++) {
    const n = i * prime;
    if (n > data.length) break;

    var value = 1;
    if (i % prime === 0) {
      value += cache[i / prime - 1]!;
    }
    cache.push(value);
    data[n - 1] = (data[n - 1] ?? 1) * (value + 1);
  }
}

export function findMaxDivisors(max: number) {
  const data: Data = new Array(max);
  var result = 1;
  var maxDivisors = 1;

  for (var n = 2; n <= max; n++) {
    const numDivisors = data[n - 1];
    if (!numDivisors) {
      fillPrimeStats(n, data);
    } else {
      if (numDivisors > maxDivisors) {
        result = n;
        maxDivisors = numDivisors;
      }
    }
  }

  return [result, maxDivisors];
}
