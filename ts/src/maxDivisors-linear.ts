type Data = number[][];

function fillPrimeStats(prime: number, data: Data) {
  const cache: number[] = [];
  for (var i = 1; ; i++) {
    const n = i * prime;
    if (n > data.length) break;

    const m = (data[n - 1] ??= []);
    var value = 1;
    if (i % prime === 0) {
      value += cache[i / prime - 1]!;
    }
    cache.push(value);
    m.push(value);
  }
}

function computeNumOfDivisors(primeStats: number[]) {
  return primeStats.reduce((a, b) => a * (b + 1), 1);
}

export function findMaxDivisors(max: number) {
  const data: Data = new Array(max);
  var result = 1;
  var maxDivisors = 1;

  for (var n = 2; n <= max; n++) {
    var stats = data[n - 1];
    if (!stats) {
      fillPrimeStats(n, data);
    } else {
      var numDivisors = computeNumOfDivisors(stats);
      if (numDivisors > maxDivisors) {
        result = n;
        maxDivisors = numDivisors;
      }
    }
  }

  return [result, maxDivisors];
}
